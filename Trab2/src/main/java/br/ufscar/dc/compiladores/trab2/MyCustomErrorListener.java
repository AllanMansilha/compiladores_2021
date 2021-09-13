package br.ufscar.dc.compiladores.trab2;

import java.io.PrintWriter;
import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener; // cuidado para importar a versão 4
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token; // Vamos também precisar de Token
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class MyCustomErrorListener implements ANTLRErrorListener {
    
   PrintWriter pw;
   public MyCustomErrorListener(PrintWriter pw) {
       this.pw = pw;    
   }

    @Override
    public void	reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }
    
    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Aqui vamos colocar o tratamento de erro customizado

        Token t = (Token) offendingSymbol;
        
       // Local onde é armazenado a saída escrita no arquivo
        String data = "";
        
        // Caso em que o comentário não foi fechado de forma correta
        if (t.getType() == 67) {
            data = "Linha " + t.getLine() + ": comentario nao fechado";
        }

        // Caso em que a cadeia não foi fechada
        else if (t.getType() == 66) {
            data = "Linha " + t.getLine() + ": cadeia literal nao fechada";
        }

        // Erros gerais não previstos
        else if (t.getType() == 68) {
            data = "Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado";
        }

        // Caso o problema seja no fim de arquivo (EOF)
        else if (t.getType() == Token.EOF) {
            data = "Linha " + t.getLine() + ": erro sintatico proximo a EOF";
        }

        // Outros casos (como não fechamento de comandos como se, para, etc.)
        else {
            data = "Linha " + t.getLine() + ": erro sintatico proximo a " + t.getText();
        }
        pw.println(data);
        pw.println("Fim da compilacao");
        throw new ParseCancellationException(data);
             
    }
}
