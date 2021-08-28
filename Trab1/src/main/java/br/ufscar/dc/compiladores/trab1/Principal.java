package br.ufscar.dc.compiladores.trab1;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String[] args) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        LingA lex = new LingA(cs);
        Token t = null;
        int line = 1;
        try (FileWriter fileWritter = new FileWriter(args[1], true)) {
            try (BufferedWriter bw = new BufferedWriter(fileWritter)) {
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    String data = "<'" + t.getText() + "','" + t.getText() + "'>" + "\n";
                    if (t.getType() != 1 & t.getType() < 8 ) {
                        data = "<'" + t.getText() + "'," + LingA.VOCABULARY.getDisplayName(t.getType()) + ">" + "\n";
                    }
                    if (t.getType() == 19){                        
                        bw.write("Linha " + line + ": " + t.getText() + " - simbolo nao identificado");
                        break;
                    }
                    else if (t.getType() == 18){                        
                        bw.write("Linha " + line + ": cadeia literal nao fechada");
                        break;
                    }
                    else if (t.getType() == 17){                        
                        bw.write("Linha " + line + ": comentario nao fechado");
                        break;
                    }
                    bw.write(data);
                    line = line + 1;
                }
            }
        }
    }
}