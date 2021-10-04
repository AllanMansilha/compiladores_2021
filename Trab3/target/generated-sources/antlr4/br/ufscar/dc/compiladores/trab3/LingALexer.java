// Generated from br/ufscar/dc/compiladores/trab3/LingA.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trab3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LingALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ALGORITMO=9, 
		DOCUMENTACAO_DO_ALGORITMO=10, DECLARE=11, DELIM=12, VIRGULA=13, PONTO=14, 
		PONTOPONTO=15, CONSTANTE=16, TIPO=17, PONTEIRO=18, LITERAL=19, INTEIRO=20, 
		REAL=21, LOGICO=22, VERDADEIRO=23, FALSO=24, REGISTRO=25, FIM_REGISTRO=26, 
		PROCEDIMENTO=27, FIM_PROCEDIMENTO=28, FUNCAO=29, ROTINA=30, RETORNE=31, 
		FIM_FUNÇÃO=32, LEIA=33, ESCREVA=34, SE=35, ENTAO=36, SENAO=37, FIM_SE=38, 
		CASO=39, SEJA=40, FIM_CASO=41, PARA=42, ATE=43, FACA=44, FIM_PARA=45, 
		ENQUANTO=46, FIM_ENQUANTO=47, E=48, OU=49, NEGACAO=50, IGUAL=51, DIFERENTE=52, 
		MAIOR=53, MAIOR_IGUAL=54, MENOR=55, MENOR_IGUAL=56, SOMA=57, SUB=58, MULT=59, 
		DIV=60, OP_ATRIBUICAO=61, NUM_INT=62, NUM_REAL=63, CADEIA=64, COMENTARIO=65, 
		WS=66, IDENT=67, CADEIA_ERRADA=68, COMENTARIO_ERRADO=69, ERRO=70;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ALGORITMO", 
			"DOCUMENTACAO_DO_ALGORITMO", "DECLARE", "DELIM", "VIRGULA", "PONTO", 
			"PONTOPONTO", "CONSTANTE", "TIPO", "PONTEIRO", "LITERAL", "INTEIRO", 
			"REAL", "LOGICO", "VERDADEIRO", "FALSO", "REGISTRO", "FIM_REGISTRO", 
			"PROCEDIMENTO", "FIM_PROCEDIMENTO", "FUNCAO", "ROTINA", "RETORNE", "FIM_FUNÇÃO", 
			"LEIA", "ESCREVA", "SE", "ENTAO", "SENAO", "FIM_SE", "CASO", "SEJA", 
			"FIM_CASO", "PARA", "ATE", "FACA", "FIM_PARA", "ENQUANTO", "FIM_ENQUANTO", 
			"E", "OU", "NEGACAO", "IGUAL", "DIFERENTE", "MAIOR", "MAIOR_IGUAL", "MENOR", 
			"MENOR_IGUAL", "SOMA", "SUB", "MULT", "DIV", "OP_ATRIBUICAO", "NUM_INT", 
			"NUM_REAL", "CADEIA", "ESC_SEQ", "COMENTARIO", "WS", "IDENT", "CADEIA_ERRADA", 
			"COMENTARIO_ERRADO", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fim_algoritmo'", "'['", "']'", "'('", "')'", "'var'", "'%'", 
			"'&'", "'algoritmo'", "'documenta\u00E7\u00E3o_do_algoritmo'", "'declare'", 
			"':'", "','", "'.'", "'..'", "'constante'", "'tipo'", "'^'", "'literal'", 
			"'inteiro'", "'real'", "'logico'", "'verdadeiro'", "'falso'", "'registro'", 
			"'fim_registro'", "'procedimento'", "'fim_procedimento'", "'funcao'", 
			"'rotina'", "'retorne'", "'fim_funcao'", "'leia'", "'escreva'", "'se'", 
			"'entao'", "'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", 
			"'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'e'", 
			"'ou'", "'nao'", "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ALGORITMO", "DOCUMENTACAO_DO_ALGORITMO", 
			"DECLARE", "DELIM", "VIRGULA", "PONTO", "PONTOPONTO", "CONSTANTE", "TIPO", 
			"PONTEIRO", "LITERAL", "INTEIRO", "REAL", "LOGICO", "VERDADEIRO", "FALSO", 
			"REGISTRO", "FIM_REGISTRO", "PROCEDIMENTO", "FIM_PROCEDIMENTO", "FUNCAO", 
			"ROTINA", "RETORNE", "FIM_FUN\u0007\u0008O", "LEIA", "ESCREVA", "SE", 
			"ENTAO", "SENAO", "FIM_SE", "CASO", "SEJA", "FIM_CASO", "PARA", "ATE", 
			"FACA", "FIM_PARA", "ENQUANTO", "FIM_ENQUANTO", "E", "OU", "NEGACAO", 
			"IGUAL", "DIFERENTE", "MAIOR", "MAIOR_IGUAL", "MENOR", "MENOR_IGUAL", 
			"SOMA", "SUB", "MULT", "DIV", "OP_ATRIBUICAO", "NUM_INT", "NUM_REAL", 
			"CADEIA", "COMENTARIO", "WS", "IDENT", "CADEIA_ERRADA", "COMENTARIO_ERRADO", 
			"ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LingALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LingA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 65:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 66:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u024b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\3\67\38\38\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3"+
		"?\5?\u01ff\n?\3?\6?\u0202\n?\r?\16?\u0203\3@\5@\u0207\n@\3@\6@\u020a\n"+
		"@\r@\16@\u020b\3@\3@\6@\u0210\n@\r@\16@\u0211\5@\u0214\n@\3A\3A\3A\6A"+
		"\u0219\nA\rA\16A\u021a\3A\3A\3B\3B\3B\3C\3C\7C\u0224\nC\fC\16C\u0227\13"+
		"C\3C\5C\u022a\nC\3C\3C\3D\3D\3D\3E\3E\7E\u0233\nE\fE\16E\u0236\13E\3F"+
		"\3F\7F\u023a\nF\fF\16F\u023d\13F\3F\3F\3G\3G\7G\u0243\nG\fG\16G\u0246"+
		"\13G\3G\3G\3H\3H\3\u021a\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083\2\u0085C\u0087"+
		"D\u0089E\u008bF\u008dG\u008fH\3\2\13\4\2--//\6\2\f\f\17\17))^^\5\2\f\f"+
		"\17\17\177\177\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\3\2$$\4\2\f"+
		"\f\17\17\3\2\177\177\2\u0256\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u009f\3\2\2\2\7\u00a1"+
		"\3\2\2\2\t\u00a3\3\2\2\2\13\u00a5\3\2\2\2\r\u00a7\3\2\2\2\17\u00ab\3\2"+
		"\2\2\21\u00ad\3\2\2\2\23\u00af\3\2\2\2\25\u00b9\3\2\2\2\27\u00d3\3\2\2"+
		"\2\31\u00db\3\2\2\2\33\u00dd\3\2\2\2\35\u00df\3\2\2\2\37\u00e1\3\2\2\2"+
		"!\u00e4\3\2\2\2#\u00ee\3\2\2\2%\u00f3\3\2\2\2\'\u00f5\3\2\2\2)\u00fd\3"+
		"\2\2\2+\u0105\3\2\2\2-\u010a\3\2\2\2/\u0111\3\2\2\2\61\u011c\3\2\2\2\63"+
		"\u0122\3\2\2\2\65\u012b\3\2\2\2\67\u0138\3\2\2\29\u0145\3\2\2\2;\u0156"+
		"\3\2\2\2=\u015d\3\2\2\2?\u0164\3\2\2\2A\u016c\3\2\2\2C\u0177\3\2\2\2E"+
		"\u017c\3\2\2\2G\u0184\3\2\2\2I\u0187\3\2\2\2K\u018d\3\2\2\2M\u0193\3\2"+
		"\2\2O\u019a\3\2\2\2Q\u019f\3\2\2\2S\u01a4\3\2\2\2U\u01ad\3\2\2\2W\u01b2"+
		"\3\2\2\2Y\u01b6\3\2\2\2[\u01bb\3\2\2\2]\u01c4\3\2\2\2_\u01cd\3\2\2\2a"+
		"\u01da\3\2\2\2c\u01dc\3\2\2\2e\u01df\3\2\2\2g\u01e3\3\2\2\2i\u01e5\3\2"+
		"\2\2k\u01e8\3\2\2\2m\u01ea\3\2\2\2o\u01ed\3\2\2\2q\u01ef\3\2\2\2s\u01f2"+
		"\3\2\2\2u\u01f4\3\2\2\2w\u01f6\3\2\2\2y\u01f8\3\2\2\2{\u01fa\3\2\2\2}"+
		"\u01fe\3\2\2\2\177\u0206\3\2\2\2\u0081\u0215\3\2\2\2\u0083\u021e\3\2\2"+
		"\2\u0085\u0221\3\2\2\2\u0087\u022d\3\2\2\2\u0089\u0230\3\2\2\2\u008b\u0237"+
		"\3\2\2\2\u008d\u0240\3\2\2\2\u008f\u0249\3\2\2\2\u0091\u0092\7h\2\2\u0092"+
		"\u0093\7k\2\2\u0093\u0094\7o\2\2\u0094\u0095\7a\2\2\u0095\u0096\7c\2\2"+
		"\u0096\u0097\7n\2\2\u0097\u0098\7i\2\2\u0098\u0099\7q\2\2\u0099\u009a"+
		"\7t\2\2\u009a\u009b\7k\2\2\u009b\u009c\7v\2\2\u009c\u009d\7o\2\2\u009d"+
		"\u009e\7q\2\2\u009e\4\3\2\2\2\u009f\u00a0\7]\2\2\u00a0\6\3\2\2\2\u00a1"+
		"\u00a2\7_\2\2\u00a2\b\3\2\2\2\u00a3\u00a4\7*\2\2\u00a4\n\3\2\2\2\u00a5"+
		"\u00a6\7+\2\2\u00a6\f\3\2\2\2\u00a7\u00a8\7x\2\2\u00a8\u00a9\7c\2\2\u00a9"+
		"\u00aa\7t\2\2\u00aa\16\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac\20\3\2\2\2\u00ad"+
		"\u00ae\7(\2\2\u00ae\22\3\2\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1"+
		"\u00b2\7i\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7k\2\2"+
		"\u00b5\u00b6\7v\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7q\2\2\u00b8\24\3\2"+
		"\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd"+
		"\7w\2\2\u00bd\u00be\7o\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7\u00e9\2\2\u00c3\u00c4\7"+
		"\u00e5\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7a\2\2\u00c6\u00c7\7f\2\2\u00c7"+
		"\u00c8\7q\2\2\u00c8\u00c9\7a\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7n\2\2"+
		"\u00cb\u00cc\7i\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf"+
		"\7k\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7o\2\2\u00d1\u00d2\7q\2\2\u00d2"+
		"\26\3\2\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7e\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7g\2\2"+
		"\u00da\30\3\2\2\2\u00db\u00dc\7<\2\2\u00dc\32\3\2\2\2\u00dd\u00de\7.\2"+
		"\2\u00de\34\3\2\2\2\u00df\u00e0\7\60\2\2\u00e0\36\3\2\2\2\u00e1\u00e2"+
		"\7\60\2\2\u00e2\u00e3\7\60\2\2\u00e3 \3\2\2\2\u00e4\u00e5\7e\2\2\u00e5"+
		"\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7v\2\2"+
		"\u00e9\u00ea\7c\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed"+
		"\7g\2\2\u00ed\"\3\2\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1"+
		"\7r\2\2\u00f1\u00f2\7q\2\2\u00f2$\3\2\2\2\u00f3\u00f4\7`\2\2\u00f4&\3"+
		"\2\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7g\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7n\2\2"+
		"\u00fc(\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7v\2"+
		"\2\u0100\u0101\7g\2\2\u0101\u0102\7k\2\2\u0102\u0103\7t\2\2\u0103\u0104"+
		"\7q\2\2\u0104*\3\2\2\2\u0105\u0106\7t\2\2\u0106\u0107\7g\2\2\u0107\u0108"+
		"\7c\2\2\u0108\u0109\7n\2\2\u0109,\3\2\2\2\u010a\u010b\7n\2\2\u010b\u010c"+
		"\7q\2\2\u010c\u010d\7i\2\2\u010d\u010e\7k\2\2\u010e\u010f\7e\2\2\u010f"+
		"\u0110\7q\2\2\u0110.\3\2\2\2\u0111\u0112\7x\2\2\u0112\u0113\7g\2\2\u0113"+
		"\u0114\7t\2\2\u0114\u0115\7f\2\2\u0115\u0116\7c\2\2\u0116\u0117\7f\2\2"+
		"\u0117\u0118\7g\2\2\u0118\u0119\7k\2\2\u0119\u011a\7t\2\2\u011a\u011b"+
		"\7q\2\2\u011b\60\3\2\2\2\u011c\u011d\7h\2\2\u011d\u011e\7c\2\2\u011e\u011f"+
		"\7n\2\2\u011f\u0120\7u\2\2\u0120\u0121\7q\2\2\u0121\62\3\2\2\2\u0122\u0123"+
		"\7t\2\2\u0123\u0124\7g\2\2\u0124\u0125\7i\2\2\u0125\u0126\7k\2\2\u0126"+
		"\u0127\7u\2\2\u0127\u0128\7v\2\2\u0128\u0129\7t\2\2\u0129\u012a\7q\2\2"+
		"\u012a\64\3\2\2\2\u012b\u012c\7h\2\2\u012c\u012d\7k\2\2\u012d\u012e\7"+
		"o\2\2\u012e\u012f\7a\2\2\u012f\u0130\7t\2\2\u0130\u0131\7g\2\2\u0131\u0132"+
		"\7i\2\2\u0132\u0133\7k\2\2\u0133\u0134\7u\2\2\u0134\u0135\7v\2\2\u0135"+
		"\u0136\7t\2\2\u0136\u0137\7q\2\2\u0137\66\3\2\2\2\u0138\u0139\7r\2\2\u0139"+
		"\u013a\7t\2\2\u013a\u013b\7q\2\2\u013b\u013c\7e\2\2\u013c\u013d\7g\2\2"+
		"\u013d\u013e\7f\2\2\u013e\u013f\7k\2\2\u013f\u0140\7o\2\2\u0140\u0141"+
		"\7g\2\2\u0141\u0142\7p\2\2\u0142\u0143\7v\2\2\u0143\u0144\7q\2\2\u0144"+
		"8\3\2\2\2\u0145\u0146\7h\2\2\u0146\u0147\7k\2\2\u0147\u0148\7o\2\2\u0148"+
		"\u0149\7a\2\2\u0149\u014a\7r\2\2\u014a\u014b\7t\2\2\u014b\u014c\7q\2\2"+
		"\u014c\u014d\7e\2\2\u014d\u014e\7g\2\2\u014e\u014f\7f\2\2\u014f\u0150"+
		"\7k\2\2\u0150\u0151\7o\2\2\u0151\u0152\7g\2\2\u0152\u0153\7p\2\2\u0153"+
		"\u0154\7v\2\2\u0154\u0155\7q\2\2\u0155:\3\2\2\2\u0156\u0157\7h\2\2\u0157"+
		"\u0158\7w\2\2\u0158\u0159\7p\2\2\u0159\u015a\7e\2\2\u015a\u015b\7c\2\2"+
		"\u015b\u015c\7q\2\2\u015c<\3\2\2\2\u015d\u015e\7t\2\2\u015e\u015f\7q\2"+
		"\2\u015f\u0160\7v\2\2\u0160\u0161\7k\2\2\u0161\u0162\7p\2\2\u0162\u0163"+
		"\7c\2\2\u0163>\3\2\2\2\u0164\u0165\7t\2\2\u0165\u0166\7g\2\2\u0166\u0167"+
		"\7v\2\2\u0167\u0168\7q\2\2\u0168\u0169\7t\2\2\u0169\u016a\7p\2\2\u016a"+
		"\u016b\7g\2\2\u016b@\3\2\2\2\u016c\u016d\7h\2\2\u016d\u016e\7k\2\2\u016e"+
		"\u016f\7o\2\2\u016f\u0170\7a\2\2\u0170\u0171\7h\2\2\u0171\u0172\7w\2\2"+
		"\u0172\u0173\7p\2\2\u0173\u0174\7e\2\2\u0174\u0175\7c\2\2\u0175\u0176"+
		"\7q\2\2\u0176B\3\2\2\2\u0177\u0178\7n\2\2\u0178\u0179\7g\2\2\u0179\u017a"+
		"\7k\2\2\u017a\u017b\7c\2\2\u017bD\3\2\2\2\u017c\u017d\7g\2\2\u017d\u017e"+
		"\7u\2\2\u017e\u017f\7e\2\2\u017f\u0180\7t\2\2\u0180\u0181\7g\2\2\u0181"+
		"\u0182\7x\2\2\u0182\u0183\7c\2\2\u0183F\3\2\2\2\u0184\u0185\7u\2\2\u0185"+
		"\u0186\7g\2\2\u0186H\3\2\2\2\u0187\u0188\7g\2\2\u0188\u0189\7p\2\2\u0189"+
		"\u018a\7v\2\2\u018a\u018b\7c\2\2\u018b\u018c\7q\2\2\u018cJ\3\2\2\2\u018d"+
		"\u018e\7u\2\2\u018e\u018f\7g\2\2\u018f\u0190\7p\2\2\u0190\u0191\7c\2\2"+
		"\u0191\u0192\7q\2\2\u0192L\3\2\2\2\u0193\u0194\7h\2\2\u0194\u0195\7k\2"+
		"\2\u0195\u0196\7o\2\2\u0196\u0197\7a\2\2\u0197\u0198\7u\2\2\u0198\u0199"+
		"\7g\2\2\u0199N\3\2\2\2\u019a\u019b\7e\2\2\u019b\u019c\7c\2\2\u019c\u019d"+
		"\7u\2\2\u019d\u019e\7q\2\2\u019eP\3\2\2\2\u019f\u01a0\7u\2\2\u01a0\u01a1"+
		"\7g\2\2\u01a1\u01a2\7l\2\2\u01a2\u01a3\7c\2\2\u01a3R\3\2\2\2\u01a4\u01a5"+
		"\7h\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7\7o\2\2\u01a7\u01a8\7a\2\2\u01a8"+
		"\u01a9\7e\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7u\2\2\u01ab\u01ac\7q\2\2"+
		"\u01acT\3\2\2\2\u01ad\u01ae\7r\2\2\u01ae\u01af\7c\2\2\u01af\u01b0\7t\2"+
		"\2\u01b0\u01b1\7c\2\2\u01b1V\3\2\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4\7"+
		"v\2\2\u01b4\u01b5\7g\2\2\u01b5X\3\2\2\2\u01b6\u01b7\7h\2\2\u01b7\u01b8"+
		"\7c\2\2\u01b8\u01b9\7e\2\2\u01b9\u01ba\7c\2\2\u01baZ\3\2\2\2\u01bb\u01bc"+
		"\7h\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be\7o\2\2\u01be\u01bf\7a\2\2\u01bf"+
		"\u01c0\7r\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3\7c\2\2"+
		"\u01c3\\\3\2\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7\7s"+
		"\2\2\u01c7\u01c8\7w\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb"+
		"\7v\2\2\u01cb\u01cc\7q\2\2\u01cc^\3\2\2\2\u01cd\u01ce\7h\2\2\u01ce\u01cf"+
		"\7k\2\2\u01cf\u01d0\7o\2\2\u01d0\u01d1\7a\2\2\u01d1\u01d2\7g\2\2\u01d2"+
		"\u01d3\7p\2\2\u01d3\u01d4\7s\2\2\u01d4\u01d5\7w\2\2\u01d5\u01d6\7c\2\2"+
		"\u01d6\u01d7\7p\2\2\u01d7\u01d8\7v\2\2\u01d8\u01d9\7q\2\2\u01d9`\3\2\2"+
		"\2\u01da\u01db\7g\2\2\u01dbb\3\2\2\2\u01dc\u01dd\7q\2\2\u01dd\u01de\7"+
		"w\2\2\u01ded\3\2\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2"+
		"\7q\2\2\u01e2f\3\2\2\2\u01e3\u01e4\7?\2\2\u01e4h\3\2\2\2\u01e5\u01e6\7"+
		">\2\2\u01e6\u01e7\7@\2\2\u01e7j\3\2\2\2\u01e8\u01e9\7@\2\2\u01e9l\3\2"+
		"\2\2\u01ea\u01eb\7@\2\2\u01eb\u01ec\7?\2\2\u01ecn\3\2\2\2\u01ed\u01ee"+
		"\7>\2\2\u01eep\3\2\2\2\u01ef\u01f0\7>\2\2\u01f0\u01f1\7?\2\2\u01f1r\3"+
		"\2\2\2\u01f2\u01f3\7-\2\2\u01f3t\3\2\2\2\u01f4\u01f5\7/\2\2\u01f5v\3\2"+
		"\2\2\u01f6\u01f7\7,\2\2\u01f7x\3\2\2\2\u01f8\u01f9\7\61\2\2\u01f9z\3\2"+
		"\2\2\u01fa\u01fb\7>\2\2\u01fb\u01fc\7/\2\2\u01fc|\3\2\2\2\u01fd\u01ff"+
		"\t\2\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200"+
		"\u0202\4\62;\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0201\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0204~\3\2\2\2\u0205\u0207\t\2\2\2\u0206\u0205"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u020a\4\62;\2\u0209"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u0213\3\2\2\2\u020d\u020f\7\60\2\2\u020e\u0210\4\62;\2\u020f"+
		"\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0214\3\2\2\2\u0213\u020d\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0080\3\2\2\2\u0215\u0218\7$\2\2\u0216\u0219\5\u0083B\2\u0217\u0219\n"+
		"\3\2\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\7$"+
		"\2\2\u021d\u0082\3\2\2\2\u021e\u021f\7^\2\2\u021f\u0220\7)\2\2\u0220\u0084"+
		"\3\2\2\2\u0221\u0225\7}\2\2\u0222\u0224\n\4\2\2\u0223\u0222\3\2\2\2\u0224"+
		"\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0229\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0228\u022a\7\177\2\2\u0229\u0228\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\bC\2\2\u022c\u0086\3\2"+
		"\2\2\u022d\u022e\t\5\2\2\u022e\u022f\bD\3\2\u022f\u0088\3\2\2\2\u0230"+
		"\u0234\t\6\2\2\u0231\u0233\t\7\2\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2"+
		"\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u008a\3\2\2\2\u0236"+
		"\u0234\3\2\2\2\u0237\u023b\7$\2\2\u0238\u023a\n\b\2\2\u0239\u0238\3\2"+
		"\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023e\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u023f\t\t\2\2\u023f\u008c\3\2"+
		"\2\2\u0240\u0244\7}\2\2\u0241\u0243\n\n\2\2\u0242\u0241\3\2\2\2\u0243"+
		"\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2"+
		"\2\2\u0246\u0244\3\2\2\2\u0247\u0248\7\f\2\2\u0248\u008e\3\2\2\2\u0249"+
		"\u024a\13\2\2\2\u024a\u0090\3\2\2\2\20\2\u01fe\u0203\u0206\u020b\u0211"+
		"\u0213\u0218\u021a\u0225\u0229\u0234\u023b\u0244\4\3C\2\3D\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}