package br.ufscar.dc.compiladores.trab4;

import br.ufscar.dc.compiladores.trab4.BatalhaParser.ProgramaContext;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Principal {
    public static void main(String args[]) throws IOException{
        
        GeradorHTML.criaArquivo(args[1]);
       
        // Leitura de characteres por arquivo (arquivo no args[0])
        CharStream cs = CharStreams.fromFileName(args[0]);
        
        // Variável de tratamento do analizador léxico
        BatalhaLexer lex = new BatalhaLexer(cs);
            
        // Criação parser
        CommonTokenStream tokens = new CommonTokenStream(lex);
        BatalhaParser parser = new BatalhaParser(tokens);
        
        // Registrar o error lister personalizado aqui
        parser.removeErrorListeners();
        MyCustomErrorListener mcel = new MyCustomErrorListener();
        parser.addErrorListener(mcel);
            
        // Criação semântico
        ProgramaContext arvore = parser.programa();
        BatalhaSemantico as = new BatalhaSemantico();
        as.visitPrograma(arvore);
            
        parser.programa();
            
        GeradorHTML.gravaArquivo();
    }
}
