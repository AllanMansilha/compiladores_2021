package br.ufscar.dc.compiladores.trab3;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class LingASemanticoUtils {

    public static List<String> errosSemanticos = new ArrayList<>();

    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.TipoLingA ret = null;
        for (var ta : ctx.termo()) {
            TabelaDeSimbolos.TipoLingA aux = verificarTipo(tabela, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLingA.INVALIDO) {
                ret = TabelaDeSimbolos.TipoLingA.INVALIDO;
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.TermoContext ctx) {
        TabelaDeSimbolos.TipoLingA ret = null;

        ret = verificarTipo(tabela, ctx.fator().get(0));

        for (LingAParser.FatorContext fator : ctx.fator()) {
            TabelaDeSimbolos.TipoLingA aux = verificarTipo(tabela, fator);
            if ((ret != aux) && (aux != TabelaDeSimbolos.TipoLingA.INVALIDO)) {

                if ((aux == TabelaDeSimbolos.TipoLingA.REAL) || (aux == TabelaDeSimbolos.TipoLingA.INTEIRO)) {
                    ret = TabelaDeSimbolos.TipoLingA.REAL;
                } else {

                    ret = TabelaDeSimbolos.TipoLingA.INVALIDO;
                    return ret;
                }
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.FatorContext ctx) {
        TabelaDeSimbolos.TipoLingA ret = null;

        ret = verificarTipo(tabela, ctx.parcela().get(0));

        for (LingAParser.ParcelaContext parcela : ctx.parcela()) {
            ret = verificarTipo(tabela, parcela);

        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.ParcelaContext ctx) {

        if (ctx.parcela_unario() != null) {
            return verificarTipo(tabela, ctx.parcela_unario());
        } else {
            return verificarTipo(tabela, ctx.parcela_nao_unario());
        }
    }

    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.Parcela_nao_unarioContext ctx) {
        TabelaDeSimbolos.TipoLingA ret = null;

        if (ctx.identificador() != null) {
            if (!tabela.existe(ctx.identificador().getText())) {
                if (!errosSemanticos.contains("Linha " + ctx.identificador().getStart().getLine() + ": identificador " + ctx.identificador().getText() + " nao declarado")) {
                    adicionarErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
                    ret = TabelaDeSimbolos.TipoLingA.INVALIDO;
                }
                return ret;
      
            } else {
                ret = tabela.verificar(ctx.identificador().getText());
                return ret;
            }
        } else {
            ret = TabelaDeSimbolos.TipoLingA.LITERAL;
            return ret;
        }
    }

    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.Parcela_unarioContext ctx) {
        TabelaDeSimbolos.TipoLingA ret = null;

        if (ctx.identificador() != null) {
            String nome = null;
            if (ctx.identificador().dimensao().exp_aritmetica().size() > 0) {
                nome = ctx.identificador().IDENT().get(0).getText();
            } else {
                nome = ctx.identificador().getText();
            }
            if (tabela.existe(nome)) {
                ret = tabela.verificar(nome);
            } else {

                TabelaDeSimbolos tabelaGlobal = LingASemantico.escoposAninhados.percorrerEscoposAninhados().get(LingASemantico.escoposAninhados.percorrerEscoposAninhados().size() - 1);
                if (!tabelaGlobal.existe(nome)) {
                    if (!errosSemanticos.contains("Linha " + ctx.identificador().getStart().getLine() + ": identificador " + ctx.identificador().getText() + " nao declarado")) {
                        adicionarErroSemantico(ctx.identificador().start, "identificador " + ctx.identificador().getText() + " nao declarado");
                        ret = TabelaDeSimbolos.TipoLingA.INVALIDO;
                    }

                } else {

                    ret = tabelaGlobal.verificar(nome);
                }
            }

        } else if (ctx.IDENT() != null) {
            if (LingASemantico.tabelaFuncaoProcedimento.containsKey(ctx.IDENT().getText())) {
                
                List<TabelaDeSimbolos.TipoLingA> aux = LingASemantico.tabelaFuncaoProcedimento.get(ctx.IDENT().getText());
                
                if (aux.size() - 1 == ctx.expressao().size()) {
                    
                    for (int i = 0; i < ctx.expressao().size(); i++) {
                        if (aux.get(i) != verificarTipo(tabela, ctx.expressao().get(i))) {

                            adicionarErroSemantico(ctx.expressao().get(i).getStart(), "incompatibilidade de parametros na chamada de " + ctx.IDENT().getText());
                        }
                    }
                    ret = aux.get(aux.size() - 1);
                } else {
                    adicionarErroSemantico(ctx.IDENT().getSymbol(), "incompatibilidade de parametros na chamada de " + ctx.IDENT().getText());
                }
            } else {
                ret = TabelaDeSimbolos.TipoLingA.INVALIDO;
            }
        } else if (ctx.NUM_INT() != null) {
            ret = TabelaDeSimbolos.TipoLingA.INTEIRO;
        } else if (ctx.NUM_REAL() != null) {
            ret = TabelaDeSimbolos.TipoLingA.REAL;
        } else {
            ret = verificarTipo(tabela, ctx.expressao().get(0));
        }
        return ret;
    }
    
    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.ExpressaoContext ctx) {
        TabelaDeSimbolos.TipoLingA ret = null;

        TabelaDeSimbolos.TipoLingA aux = verificarTipo(tabela, ctx.termo_logico(0));
        ret = aux;

        for (LingAParser.Termo_logicoContext termoLogico : ctx.termo_logico()) {
            aux = verificarTipo(tabela, termoLogico);
            if (ret != aux && aux != TabelaDeSimbolos.TipoLingA.INVALIDO) {
                ret = TabelaDeSimbolos.TipoLingA.INVALIDO;
                return ret;
            }
        }

        return ret;
    }
    
    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.Termo_logicoContext ctx) {
        TabelaDeSimbolos.TipoLingA ret = null;
        TabelaDeSimbolos.TipoLingA aux = verificarTipo(tabela, ctx.fator_logico(0));
        ret = aux;
        for (LingAParser.Fator_logicoContext fatorLogico : ctx.fator_logico()) {
            aux= verificarTipo(tabela, fatorLogico);
            if (ret != aux && aux != TabelaDeSimbolos.TipoLingA.INVALIDO) {
                ret = TabelaDeSimbolos.TipoLingA.INVALIDO;
                return ret;
            }
        }
        return ret;
    }
    
    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.Fator_logicoContext ctx) {

        TabelaDeSimbolos.TipoLingA ret = null;
        ret = verificarTipo(tabela, ctx.parcela_logica());
        return ret;

    }
    
     public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.Parcela_logicaContext ctx) {
        TabelaDeSimbolos.TipoLingA ret = null;

        if (ctx.exp_relacional() != null) {
            ret = verificarTipo(tabela, ctx.exp_relacional());

        } else {
            ret = TabelaDeSimbolos.TipoLingA.LOGICO;
        }
        return ret;

    }
     
    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.Exp_relacionalContext ctx) {

        TabelaDeSimbolos.TipoLingA ret1 = null;

        ret1 = verificarTipo(tabela, ctx.exp_aritmetica().get(0));

        if (ctx.exp_aritmetica().size() > 1) {
            TabelaDeSimbolos.TipoLingA ret2 = verificarTipo(tabela, ctx.exp_aritmetica().get(1));
            
            // Caso os dois tipos sejam iguais, pode adicionar a exp. logica na tabela
            if (ret1 == ret2) {
                return TabelaDeSimbolos.TipoLingA.LOGICO;

            // Caso os dois tipos não sejam iguais
            } else {
                // Caso os tipos sejam real/inteiro, pode adicionar
                if ( ((ret1 == TabelaDeSimbolos.TipoLingA.REAL) && (ret2 == TabelaDeSimbolos.TipoLingA.INTEIRO)) || ((ret2 == TabelaDeSimbolos.TipoLingA.REAL) && (ret1 == TabelaDeSimbolos.TipoLingA.INTEIRO)) ) {
                    return TabelaDeSimbolos.TipoLingA.LOGICO;
                } else {
                    // Caso não, eles não podem ser comparados e, portanto, são invalidos.
                    return TabelaDeSimbolos.TipoLingA.INVALIDO;
                }
            }
        }

        return ret1;

    }

    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, LingAParser.IdentificadorContext ctx) {
        String nomeVar = ctx.IDENT().get(0).getText();

        return tabela.verificar(nomeVar);
    }

    public static TabelaDeSimbolos.TipoLingA verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}
