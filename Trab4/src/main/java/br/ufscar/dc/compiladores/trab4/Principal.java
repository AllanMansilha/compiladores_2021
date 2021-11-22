package br.ufscar.dc.compiladores.trab4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {
    static CharStream cs;
    static BatalhaLexer lexer;
    static CommonTokenStream tokens;
    static BatalhaParser parser;
    static BatalhaVisitor semantico;

    public static void main(String[] args){     
        try (PrintWriter pw = new PrintWriter(new File(args[1]))){
            if(lexer_parser(args[0], pw) /* && semantico(args[0], pw)*/){
                //geradorPDF(args[0],args[1]);
            }
        } catch(IOException e){
            System.out.println("Falha na criação do arquivo de saída.");
        }
    }
    
    static boolean lexer_parser(String file, PrintWriter pw) throws IOException {
        try {
            cs = CharStreams.fromFileName(file);
            lexer = new BatalhaLexer(cs);
            tokens = new CommonTokenStream(lexer);
            parser = new BatalhaParser(tokens);
            
            // Remove a mensagem de erro padrão
            parser.removeErrorListeners();
            // Registra o error personalizado da analise lexica e sintatica
            MyCustomErrorListener mcel = new MyCustomErrorListener(pw);
            parser.addErrorListener(mcel);
            // Roda a analise sintatica
            parser.programa();
            return true;
        } catch (IOException e){
            System.out.println(e.toString());
            return false;
        }
    }
}
