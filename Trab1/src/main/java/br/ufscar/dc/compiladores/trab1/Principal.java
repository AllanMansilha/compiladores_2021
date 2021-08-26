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
        try (FileWriter fileWritter = new FileWriter(args[1], true)) {
            try (BufferedWriter bw = new BufferedWriter(fileWritter)) {
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    String data = "<'" + t.getText() + "','" + t.getText() + "'>" + "\n";
                    if (t.getType() != 1 & t.getType() < 8 ) {
                        data = "<'" + t.getText() + "'," + LingA.VOCABULARY.getDisplayName(t.getType()) + ">" + "\n";
                    }
                    bw.write(data);
                }
            }
        }
    }
}