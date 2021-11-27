package br.ufscar.dc.compiladores.trab4;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class BatalhaSemanticoUtils {
     // Inicializa a lista de erros semânticos
    public static List<String> errosSemanticos = new ArrayList<>();
    
    // adiciona erro semântico na lista de erros
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
    
    // Verifica se o tipo existe, se não classifica como inválido
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, BatalhaParser.Declaracao_equipeContext ctx) {
        String tipo = ctx.Tipo().getText();

        switch (tipo) {
            case "fogo":
                return TabelaDeSimbolos.Tipo.FOGO;

            case "agua":
                return TabelaDeSimbolos.Tipo.AGUA;

            case "grama":
                return TabelaDeSimbolos.Tipo.GRAMA;

            default:
                return TabelaDeSimbolos.Tipo.INVALIDO;
        }
    }
    
    public static TabelaDeSimbolos.Tipo verificarTipo(TabelaDeSimbolos tabela, BatalhaParser.Declaracao_selvagemContext ctx) {
        String tipo = ctx.Tipo().getText();

        switch (tipo) {
            case "fogo":
                return TabelaDeSimbolos.Tipo.FOGO;

            case "agua":
                return TabelaDeSimbolos.Tipo.AGUA;

            case "grama":
                return TabelaDeSimbolos.Tipo.GRAMA;

            default:
                return TabelaDeSimbolos.Tipo.INVALIDO;
        }
    }
}
