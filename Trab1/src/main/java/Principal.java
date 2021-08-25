package br.ufscar.dc.compiladores.trab1;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
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
            File f1 = new File("saida.txt");
            if(f1.createNewFile() == false){
                f1.delete();
                f1.createNewFile();
            }
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                if (t.getType() == 1){
                    try {
                       String data = "<'" + t.getText() +  "','" + t.getText() + "'>" + "\n";

                       FileWriter fileWritter = new FileWriter(f1.getName(),true);
                       BufferedWriter bw = new BufferedWriter(fileWritter);
                       bw.write(data);
                       bw.close();
                    } catch(IOException e){
                    }
                }
                else{
                    try {
                       String data = "<'" + t.getText() +  "'," + LingA.VOCABULARY.getDisplayName(t.getType()) + ">" + "\n";
                      
                       FileWriter fileWritter = new FileWriter(f1.getName(),true);
                       BufferedWriter bw = new BufferedWriter(fileWritter);
                       bw.write(data);
                       bw.close();
                    } catch(IOException e){
                    }
                }
            }
        } catch (IOException ex) {
        }        
    }
}