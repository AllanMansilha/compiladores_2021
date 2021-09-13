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
        
        //Recebe o tipo do token gerado pela gramatica
        String tipoToken = LingALexer.VOCABULARY.getSymbolicName(t.getType());
        String saida = ""; //string a ser impressa no aquivo de saida 
        
        if (tipoToken != null && tipoToken.equals("COMENTARIO_ERRADO")) {
            saida = "Linha " + t.getLine() + ": comentario nao fechado";
        }
        else if (tipoToken != null && tipoToken.equals("CADEIA_ERRADA")) {
            saida = "Linha " + t.getLine() + ": cadeia literal nao fechada";
        }
        else if (tipoToken != null && tipoToken.equals("ERRO")) {
            saida = "Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado";
        }
        else if (t.getType() == Token.EOF) {
            saida = "Linha " + t.getLine() + ": erro sintatico proximo a EOF";
        }
        else {
            saida = "Linha " + t.getLine() + ": erro sintatico proximo a " + t.getText();
        }
        pw.println(saida);
        pw.println("Fim da compilacao");
        throw new ParseCancellationException(saida);
             
    }
}
