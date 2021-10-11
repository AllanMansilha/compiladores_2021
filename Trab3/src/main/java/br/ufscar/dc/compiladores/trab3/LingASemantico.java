package br.ufscar.dc.compiladores.trab3;

import static br.ufscar.dc.compiladores.trab3.LingASemanticoUtils.errosSemanticos;
import br.ufscar.dc.compiladores.trab3.TabelaDeSimbolos.TipoLingA;
import java.util.ArrayList;
import java.util.HashMap;
import org.antlr.v4.runtime.Token;

public class LingASemantico extends LingABaseVisitor<Void>{
       
    static Escopos escoposAninhados = new Escopos();
   
    static HashMap<String, ArrayList<TipoLingA>> tabelaFuncaoProcedimento = new HashMap<>();
    HashMap<String, ArrayList<String>> tabelaRegistro = new HashMap<>();
       
    public void adicionaVariavelTabela(String nome, String tipo, Token nomeT, Token tipoT){
        TabelaDeSimbolos tabelaLocal = escoposAninhados.obterEscopoAtual();
        
        TabelaDeSimbolos tabelaGlobal = escoposAninhados.percorrerEscoposAninhados().get(escoposAninhados.percorrerEscoposAninhados().size()-1);
        TipoLingA tipoLinga=null;

        // Declarando os tipos das variáveis na tabela
        // o '^' refere-se ao ponteiro
        if(tipo.charAt(0)=='^'){
            tipo=tipo.substring(1);}
        if(tipo.equals("literal")){
            tipoLinga= TipoLingA.LITERAL;
        }else if(tipo.equals("inteiro")){
            tipoLinga=TipoLingA.INTEIRO;
        }else if(tipo.equals("real")){
            tipoLinga=TipoLingA.REAL;
        }else if(tipo.equals("logico")){
            tipoLinga=TipoLingA.LOGICO;
        }else if(tipo.equals("registro")){
            tipoLinga=TipoLingA.REGISTRO;
        }else{
            tipoLinga=TipoLingA.INVALIDO;
        }
        
        // Caso o tipo seja invalido, adiciona à lista de erros semanticos para aparecer no arquivo
        if(tipoLinga == TipoLingA.INVALIDO){
            LingASemanticoUtils.adicionarErroSemantico(tipoT, "tipo "+tipo+" nao declarado");
        }
        
        // Caso a variável não exista nem na tabela global nem na local,
        // adiciona na tabela local (escopo mais interno)
        if(!tabelaLocal.existe(nome)){
            if(!tabelaGlobal.existe(nome)){
                tabelaLocal.inserir(nome, tipoLinga);
            }else{
                // Caso exista na tabela global ou local, dispara erro de declaração previa
                LingASemanticoUtils.adicionarErroSemantico(nomeT, "identificador " + nome + " ja declarado anteriormente");
            }
        }else{
                LingASemanticoUtils.adicionarErroSemantico(nomeT, "identificador " + nome + " ja declarado anteriormente");
        }
    }

    @Override
    public Void visitDeclaracoes(LingAParser.DeclaracoesContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();        
        for(LingAParser.Decl_local_globalContext dlgc : ctx.decl_local_global()){
            visitDecl_local_global(dlgc);
        }
        return super.visitDeclaracoes(ctx);
    }
    
    @Override
    public Void visitDecl_local_global(LingAParser.Decl_local_globalContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        
        if(ctx.declaracao_global() != null){
            visitDeclaracao_global(ctx.declaracao_global());
        } else if(ctx.declaracao_local()!=null){
            visitDeclaracao_local(ctx.declaracao_local());
        }
        
        return super.visitDecl_local_global(ctx);
    }
    
    @Override
    public Void visitDeclaracao_local(LingAParser.Declaracao_localContext ctx) {
        
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        String tipoVar = null;

        if (ctx.DECLARE() != null) {
            // Se a variavel for do tipo registro, adiciona na tabela
            if (ctx.variavel().tipo().registro() != null) {
                
                for(LingAParser.IdentificadorContext ic : ctx.variavel().identificador()){
                    
                    adicionaVariavelTabela(ic.getText(), "registro", ic.getStart(), null);
                    // Adicionando o nome da variavel
                    for(LingAParser.VariavelContext vc : ctx.variavel().tipo().registro().variavel()){
                        tipoVar = vc.tipo().getText();
                        
                        for( LingAParser.IdentificadorContext icr : vc.identificador()){
                            
                            adicionaVariavelTabela(ic.getText() + '.' + icr.getText(), tipoVar, icr.getStart(), vc.tipo().getStart());
                        }
                    }
                }
            } else {
              
                tipoVar = ctx.variavel().tipo().getText();
                
                if(tabelaRegistro.containsKey(tipoVar)){
                    ArrayList<String> variaveis_registro = tabelaRegistro.get(tipoVar);
                    
                    for(LingAParser.IdentificadorContext ic : ctx.variavel().identificador()){
                        String nome = ic.IDENT().get(0).getText();
                        if(tabela.existe(nome) || tabelaRegistro.containsKey(nome)){
                            LingASemanticoUtils.adicionarErroSemantico(ic.getStart(), "identificador " + nome + " ja declarado anteriormente");
                        }else{
                            adicionaVariavelTabela(nome, "registro", ic.getStart(), ctx.variavel().tipo().getStart());
                            for(int i=0;i<variaveis_registro.size();i=i+2){
                                 adicionaVariavelTabela(nome + '.' + variaveis_registro.get(i), variaveis_registro.get(i+1), ic.getStart(), ctx.variavel().tipo().getStart());
                            }
                        }
                    }
                }else {
                   for (LingAParser.IdentificadorContext ident : ctx.variavel().identificador()) {
                        String nomeVar = ident.getText();
                        if (tabelaFuncaoProcedimento.containsKey(nomeVar)) {
                            LingASemanticoUtils.adicionarErroSemantico(ident.getStart(), "identificador " + nomeVar + " ja declarado anteriormente");
                        } else {
                            adicionaVariavelTabela(nomeVar, tipoVar, ident.getStart(), ctx.variavel().tipo().getStart());

                        }
                    } 
                }
            }
            
        } else if (ctx.CONSTANTE()!=null) {
             adicionaVariavelTabela(ctx.IDENT().getText(), ctx.tipo_basico().getText(), ctx.IDENT().getSymbol(), ctx.IDENT().getSymbol());
        
        } else if(ctx.TIPO()!=null){
             if (ctx.tipo().registro() != null) {
                ArrayList<String> variaveisRegistro = new ArrayList<String>();
                for (LingAParser.VariavelContext vc : ctx.tipo().registro().variavel()) {
                    tipoVar = vc.tipo().getText();
                    for (LingAParser.IdentificadorContext ic : vc.identificador()) {
                        variaveisRegistro.add(ic.getText());
                        variaveisRegistro.add(tipoVar);
                    }
                }
                tabelaRegistro.put(ctx.IDENT().getText(), variaveisRegistro);
            
            }
        }
        
        return super.visitDeclaracao_local(ctx);
    }

    @Override
    public Void visitDeclaracao_global(LingAParser.Declaracao_globalContext ctx) {
        escoposAninhados.criarNovoEscopo();
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        ArrayList<TipoLingA> tiposVariaveis = new ArrayList<TipoLingA>();

        if(ctx.PROCEDIMENTO()!=null){
            for(LingAParser.ParametroContext parametro : ctx.parametros().parametro()){
                if(parametro.tipo_estendido().tipo_basico_ident().tipo_basico()!=null){
                    
                    for(LingAParser.IdentificadorContext ic : parametro.identificador()){
                        adicionaVariavelTabela(ic.getText(), parametro.tipo_estendido().getText(), ic.getStart(), parametro.tipo_estendido().getStart());
                        String tipo = parametro.tipo_estendido().getText();
                        TipoLingA tipoLinga=null;
                         if (tabelaRegistro.containsKey(tipo)) {
                            tipoLinga= TipoLingA.REGISTRO;
                        }

                       if(tipo.charAt(0)=='^'){
                            tipo=tipo.substring(1);
                        }
                        if(tipo.equals("literal")){
                            tipoLinga= TipoLingA.LITERAL;
                        }else if(tipo.equals("inteiro")){
                            tipoLinga=TipoLingA.INTEIRO;
                        }else if(tipo.equals("real")){
                            tipoLinga=TipoLingA.REAL;
                        }else if(tipo.equals("logico")){
                            tipoLinga=TipoLingA.LOGICO;
                        }else if(tipo.equals("registro")){
                            tipoLinga=TipoLingA.REGISTRO;
                        }else{
                            tipoLinga=TipoLingA.INVALIDO;
                        }
                        tiposVariaveis.add(tipoLinga);
                    }
                }else{
                    if(tabelaRegistro.containsKey(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText())){
                        ArrayList<String> variaveisRegistro = tabelaRegistro.get(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText());
                        
                        for(LingAParser.IdentificadorContext ic: parametro.identificador()){
                            TipoLingA tipoLinga=null;
                            String tipo = parametro.tipo_estendido().getText();
                            if (tabelaRegistro.containsKey(tipo)) {
                                tipoLinga= TipoLingA.REGISTRO;
                            }

                            if(tipo.charAt(0)=='^'){
                                tipo=tipo.substring(1);
                            }
                            if(tipo.equals("literal")){
                                tipoLinga= TipoLingA.LITERAL;
                            }else if(tipo.equals("inteiro")){
                                tipoLinga=TipoLingA.INTEIRO;
                            }else if(tipo.equals("real")){
                                tipoLinga=TipoLingA.REAL;
                            }else if(tipo.equals("logico")){
                                tipoLinga=TipoLingA.LOGICO;
                            }else if(tipo.equals("registro")){
                                tipoLinga=TipoLingA.REGISTRO;
                            }else{
                                tipoLinga=TipoLingA.INVALIDO;
                            }
                            tiposVariaveis.add(tipoLinga);
                            
                            for(int i=0;i<tiposVariaveis.size();i=i+2){
                                adicionaVariavelTabela(ic.getText() + '.' + variaveisRegistro.get(i), variaveisRegistro.get(i+1), ic.getStart(), ic.getStart());
                            }
                        }
                    }else{
                       LingASemanticoUtils.adicionarErroSemantico(parametro.getStart(), "tipo nao declarado"); 
                    }
                }
            }
            for(LingAParser.CmdContext c : ctx.cmd()){
                if(c.cmdretorne()!=null){
                    LingASemanticoUtils.adicionarErroSemantico(c.getStart(), "comando retorne nao permitido nesse escopo");
                }
                
            }

            tabelaFuncaoProcedimento.put(ctx.IDENT().getText(), tiposVariaveis);
        }else if(ctx.FUNCAO()!=null){
            for(LingAParser.ParametroContext parametro: ctx.parametros().parametro()){
                
                if(parametro.tipo_estendido().tipo_basico_ident().tipo_basico()!=null){
                    for(LingAParser.IdentificadorContext ic : parametro.identificador()){
                        adicionaVariavelTabela(ic.getText(), parametro.tipo_estendido().getText(), ic.getStart(), parametro.tipo_estendido().getStart());
                        String tipo = parametro.tipo_estendido().getText();
                        TipoLingA tipoLinga=null;
                         if (tabelaRegistro.containsKey(tipo)) {
                            tipoLinga= TipoLingA.REGISTRO;
                            }

                        if(tipo.charAt(0)=='^'){
                            tipo=tipo.substring(1);
                        }
                        if(tipo.equals("literal")){
                            tipoLinga= TipoLingA.LITERAL;
                        }else if(tipo.equals("inteiro")){
                            tipoLinga=TipoLingA.INTEIRO;
                        }else if(tipo.equals("real")){
                            tipoLinga=TipoLingA.REAL;
                        }else if(tipo.equals("logico")){
                            tipoLinga=TipoLingA.LOGICO;
                        }else if(tipo.equals("registro")){
                            tipoLinga=TipoLingA.REGISTRO;
                        }else{
                            tipoLinga=TipoLingA.INVALIDO;
                        }
                        tiposVariaveis.add(tipoLinga);
                    }
                } else{
                    
                    if(tabelaRegistro.containsKey(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText())){
                        ArrayList<String> variaveisRegistro = tabelaRegistro.get(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText());
                        
                        for(LingAParser.IdentificadorContext ic : parametro.identificador()){
                            String tipo = parametro.tipo_estendido().tipo_basico_ident().IDENT().getText();
                            TipoLingA tipoLinga=null;
                         if (tabelaRegistro.containsKey(tipo)) {
                            tipoLinga= TipoLingA.REGISTRO;
                        }

                        if(tipo.charAt(0)=='^'){
                            tipo=tipo.substring(1);
                        }
                        if(tipo.equals("literal")){
                            tipoLinga= TipoLingA.LITERAL;
                        }else if(tipo.equals("inteiro")){
                            tipoLinga=TipoLingA.INTEIRO;
                        }else if(tipo.equals("real")){
                            tipoLinga=TipoLingA.REAL;
                        }else if(tipo.equals("logico")){
                            tipoLinga=TipoLingA.LOGICO;
                        }else if(tipo.equals("registro")){
                            tipoLinga=TipoLingA.REGISTRO;
                        }else{
                            tipoLinga=TipoLingA.INVALIDO;
                        }
                        tiposVariaveis.add(tipoLinga);
                            for(int i=0; i<variaveisRegistro.size();i=i+2){
                                 adicionaVariavelTabela(ic.getText() + "." + variaveisRegistro.get(i), variaveisRegistro.get(i+1), ic.getStart(), ic.getStart());
                            }
                        }
                    }else{
                        LingASemanticoUtils.adicionarErroSemantico(parametro.getStart(), "tipo nao declarado");
                    }
                }
            }
            
          
        }
        
        return super.visitDeclaracao_global(ctx);
    }


    @Override
    public Void visitCmdleia(LingAParser.CmdleiaContext ctx) {
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLingA tipos;
        String nomeVar;
        for (LingAParser.IdentificadorContext ic : ctx.identificador()) {

            nomeVar = ic.getText();
            
            if (!tabela.existe(ic.getText()) ) {
                if (!errosSemanticos.contains("Linha " + ic.getStart().getLine() + ": identificador " + ic.getText() + " nao declarado")){
                LingASemanticoUtils.adicionarErroSemantico(ic.getStart(), "identificador " + ic.getText() + " nao declarado");
                }
            }
        }
        return super.visitCmdleia(ctx);
    }

    //Visitação para o comando escreva, essa funcao basicamente obtem o escopo atual pega as expressao dentro do contexto e chama verificaTipo de Utils
    @Override
    public Void visitCmdescreva(LingAParser.CmdescrevaContext ctx) {
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLingA tipo;

        for (LingAParser.ExpressaoContext expressao : ctx.expressao()) {
            tipo = LingASemanticoUtils.verificarTipo(tabela, expressao);
        }

        return super.visitCmdescreva(ctx);
    }
    
     //Visitante para o comando se (IF)
    @Override
    public Void visitCmdse(LingAParser.CmdseContext ctx) {
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLingA tipo = LingASemanticoUtils.verificarTipo(tabela, ctx.expressao());

        return super.visitCmdse(ctx);
    }

    
    @Override
    public Void visitCmdcaso(LingAParser.CmdcasoContext ctx) {
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLingA tipo = LingASemanticoUtils.verificarTipo(tabela, ctx.exp_aritmetica());

        for (LingAParser.CmdContext cmd : ctx.cmd()) {
            visitCmd(cmd);
        }

        return super.visitCmdcaso(ctx);
    }
    
    //Visitante para o comando para (for)
    //Verifica tambem erros de identificadores nao declarados
    @Override
    public Void visitCmdpara(LingAParser.CmdparaContext ctx) {
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();

        if (!tabela.existe(ctx.IDENT().getText())) {
            LingASemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "identificador " + ctx.IDENT().getText() + " nao declarado");
        }

        for(LingAParser.Exp_aritmeticaContext expArit : ctx.exp_aritmetica()){
            LingASemanticoUtils.verificarTipo(tabela, expArit);
        }
        
        for(LingAParser.CmdContext c : ctx.cmd()){
            visitCmd(c);
        }

        return super.visitCmdpara(ctx);
    }
    
    //Visitante  do comando Enquanto (while)
    //Obtem o escopo atual e passar a expressoa para verificarTipo
    @Override
    public Void visitCmdenquanto(LingAParser.CmdenquantoContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLingA tipoExpressao = LingASemanticoUtils.verificarTipo(tabela, ctx.expressao());
        return super.visitCmdenquanto(ctx); 
    }
    
    
    //Visitante  do comando Enquanto (faca)
    @Override
    public Void visitCmdfaca(LingAParser.CmdfacaContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLingA tipoExpressao = LingASemanticoUtils.verificarTipo(tabela, ctx.expressao());
        
        
        for(LingAParser.CmdContext c : ctx.cmd()){
            visitCmd(c);
        }
        
        return super.visitCmdfaca(ctx);
    }
    
    //Visitante para o comando atribuição
    //Recebe o escopo atual, verifica se o identificador ja nao foi declarado
    //Verifica se as atribuições sao compativeis com os tipos declarados
    @Override
    public Void visitCmdatribuicao(LingAParser.CmdatribuicaoContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLingA tipoExpressao = LingASemanticoUtils.verificarTipo(tabela, ctx.expressao());
        String varNome = ctx.identificador().getText();
        
        if(tipoExpressao != TipoLingA.INVALIDO){
            
            if (!tabela.existe(varNome)){
                 LingASemanticoUtils.adicionarErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
            } else {
                
                TipoLingA varTipo = LingASemanticoUtils.verificarTipo(tabela, varNome);
                if(varTipo != tipoExpressao){
                    if ( !(((varTipo == TipoLingA.REAL) || (varTipo == TipoLingA.INTEIRO)) & ((tipoExpressao == TipoLingA.INTEIRO) || (tipoExpressao == TipoLingA.REAL))) ) {
 
                        if (ctx.PONTEIRO() != null) {
                            LingASemanticoUtils.adicionarErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para ^" + ctx.identificador().getText());
                        } else {
                            LingASemanticoUtils.adicionarErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + ctx.identificador().getText());
                        }
                }
                
            }
        }
    } else {
           LingASemanticoUtils.adicionarErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + ctx.identificador().getText());
        }
        return super.visitCmdatribuicao(ctx);
    }
    
    @Override
    public Void visitCmdchamada(LingAParser.CmdchamadaContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        
        for(LingAParser.ExpressaoContext ec: ctx.expressao()){
            LingASemanticoUtils.verificarTipo(tabela, ec);
        }
        
        return super.visitCmdchamada(ctx);
    }
    
    @Override
    public Void visitCmdretorne(LingAParser.CmdretorneContext ctx){
        TabelaDeSimbolos tabela = escoposAninhados.obterEscopoAtual();
        TipoLingA tipoExpressao = LingASemanticoUtils.verificarTipo(tabela, ctx.expressao());
        
        return super.visitCmdretorne(ctx);
        
    }
    

}