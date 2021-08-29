


package br.ufscar.dc.compiladores.trab1;

// Classes para tratamento de arquivos
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

// Classes padrão
import java.io.IOException;
import java.nio.Buffer;

// Classes para tratamento antlr
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String[] args) throws IOException {

        // Leitura de characteres por arquivo (arquivo no args[0])
        CharStream cs = CharStreams.fromFileName(args[0]);
        
        // Variável de tratamento do analizador léxico
        LingA lex = new LingA(cs);
        
        // Cada token do léxico da linguagemA ANTLR criado
        Token t = null;
        
        // Cria um vetor de escrita de arquivo do arquivo passado em args[1], utilizando o append para arquivos já criados
        try (FileWriter fileWritter = new FileWriter(args[1], true)) {
            
        // Cria um buffer de escrita, através do vetor de escrita criado na linha 37
            try (BufferedWriter bw = new BufferedWriter(fileWritter)) {
                
                // Enquanto o tipo do próximo token a ser lido não for o token de fim do arquivo, continua o loop
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    
                    // Modelo padrão de escrita do token: <palavra-chave, palavra-chave>
                    String data = "<'" + t.getText() + "','" + t.getText() + "'>" + "\n";
                    
                    // Caso o tipo do token seja diferente de 1 (palavra chave) e menor do que 8 (de operadores ou sinais), 
                    // utiliza-se o modelo de token: <token, modelo-do-token>
                    if (t.getType() != 1 & t.getType() < 8 ) {
                        data = "<'" + t.getText() + "'," + LingA.VOCABULARY.getDisplayName(t.getType()) + ">" + "\n";
                    }
                    
                    // Caso o tipo do token seja nenhum dos identificados anteriormente, ocorreu um erro de simbolo não identificado
                    // O erro é escrito no arquivo e quebra-se o loop para interromper a execução.
                    if (t.getType() >= 20){
                        bw.write("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado" + "\n");
                        break;
                    }
                    
                    // Caso o tipo do token seja uma cadeia literal sem fechamento de aspas, reporta-se o erro
                    // e quebra-se o loop para interromper a execução.
                    else if (t.getType() == 18){                        
                        bw.write("Linha " + t.getLine() + ": cadeia literal nao fechada" + "\n");
                        break;
                    }
                    
                    // Caso o tipo do token reconhecido seja um comentário sem fechamento, reporta-se
                    // e quebra-se o loop para interromper a execução do resto do código.
                    else if (t.getType() == 19){                        
                        bw.write("Linha " + t.getLine() + ": comentario nao fechado" + "\n");
                        break;
                    }
                    
                    // Escrita do token no arquivo, caso não ocorra nenhum problema
                    bw.write(data);
                }
            }
        }
    }
}