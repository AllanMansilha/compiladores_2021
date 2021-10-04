package br.ufscar.dc.compiladores.trab3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {

    public static void main(String args[]) throws IOException {
        try (PrintWriter pw = new PrintWriter(new File(args[1]))) {

            // Leitura do arquivo de entrada
            CharStream cs = CharStreams.fromFileName(args[0]);
            
            // Declarações do analisador léxico e do analisador sintático
            // Variável de tratamento do analizador léxico
            LingALexer lex = new LingALexer(cs);
                
            CommonTokenStream tokens = new CommonTokenStream(lex);
            LingAParser parser = new LingAParser(tokens);
        
            // Aqui não está funcionando 
            //MyCustomErrorListener mcel = new MyCustomErrorListener(pw);
            //parser.removeErrorListeners();
            //parser.addErrorListener(mcel);
            //parser.programa();

            // Declarações do analisador semântico
            LingAParser.ProgramaContext arvore = parser.programa();
            LingASemantico sem = new LingASemantico();
            
            // Iniciando o programa
            sem.visitPrograma(arvore);
           
            // Caso não tenha erros semânticos
            if(LingASemanticoUtils.errosSemanticos.isEmpty()){
                
                // Inicia-se a geração do código em C
                LingAGeradorC aux = new LingAGeradorC();
                aux.visitPrograma(arvore);
                pw.print(aux.saida.toString());

            }else{
                
                // Caso tenha erros, envia os erros para o documento de saída
                for(String erros : LingASemanticoUtils.errosSemanticos){
                    pw.println(erros);
                    
                 }
                 pw.println("Fim da compilacao");
            }

            pw.close();

        }
    }    
}