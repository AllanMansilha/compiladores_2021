package br.ufscar.dc.compiladores.trab2;

// Classes para tratamento de arquivos
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

// Classes padrão
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;

// Classes para tratamento antlr
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;


public class Principal {

    public static void main(String[] args) throws IOException {
        
        try(PrintWriter pw = new PrintWriter(new File(args[1]))) { 
            // Leitura de characteres por arquivo (arquivo no args[0])
            CharStream cs = CharStreams.fromFileName(args[0]);
        
            // Variável de tratamento do analizador léxico
            LingALexer lex = new LingALexer(cs);
                
            CommonTokenStream tokens = new CommonTokenStream(lex);
            LingAParser parser = new LingAParser(tokens);
        
            // Registrar o error lister personalizado aqui
            MyCustomErrorListener mcel = new MyCustomErrorListener(pw);
            parser.removeErrorListeners();
            parser.addErrorListener(mcel);
            parser.programa();
        } catch(IOException ex){
            
        }catch(ParseCancellationException exception) {
                //ao captar um erro, imprime no terminal o erro e encerra a execução
               //System.out.println(exception.getMessage());
        }
        
        
    }
}