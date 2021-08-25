package br.ufscar.dc.compiladores.trab1;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String[] args) {
                try {
            CharStream cs = CharStreams.fromFileName(args[0]);
            LingA lex = new LingA(cs);
            Token t = null;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                System.out.println("<'" + t.getText() +  "'," + LingA.VOCABULARY.getDisplayName(t.getType()) + ">");
            }

        } catch (IOException ex) {
        }
               
    }
}
