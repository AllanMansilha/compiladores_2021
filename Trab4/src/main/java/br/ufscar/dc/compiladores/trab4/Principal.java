package br.ufscar.dc.compiladores.trab4;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal {
    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        BatalhaLexer lexer = new BatalhaLexer(cs);

        // Descomentar para depurar o Léxico
//        Token t = null;
//        while( (t = lexer.nextToken()).getType() != Token.EOF) {
//            System.out.println("<" + AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
//        }
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BatalhaParser parser = new BatalhaParser(tokens);
        parser.lista_batalha();
    }
}
