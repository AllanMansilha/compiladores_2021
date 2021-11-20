// Generated from br/ufscar/dc/compiladores/trab4/Batalha.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trab4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BatalhaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BATALHA=7, POKEMON=8, 
		SELVAGEM=9, MENSAGEM=10, NUM_INT=11, CADEIA=12, COMENTARIO=13, WS=14, 
		VIRGULA=15, DOISPONTOS=16, ERRO=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "BATALHA", "POKEMON", 
			"SELVAGEM", "MENSAGEM", "NUM_INT", "CADEIA", "ESC_SEQ", "COMENTARIO", 
			"WS", "VIRGULA", "DOISPONTOS", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fogo'", "'agua'", "'grama'", "'lutar'", "'fugir'", "'trocar para'", 
			"'batalha'", "'pokemon'", "'selvagem'", "'mensagem'", null, null, null, 
			null, "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "BATALHA", "POKEMON", "SELVAGEM", 
			"MENSAGEM", "NUM_INT", "CADEIA", "COMENTARIO", "WS", "VIRGULA", "DOISPONTOS", 
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


	public BatalhaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Batalha.g4"; }

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
		case 13:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\fs\n\f\r\f\16\ft\3\r\3"+
		"\r\7\ry\n\r\f\r\16\r|\13\r\3\16\3\16\3\16\3\17\3\17\7\17\u0083\n\17\f"+
		"\17\16\17\u0086\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\2\35\17\37\20!\21#\22%\23\3\2\6\4\2C\\c|\5\2\"\"C\\c|\5\2\f\f\17"+
		"\17\177\177\5\2\13\f\17\17\"\"\2\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5,\3\2\2\2\7\61\3"+
		"\2\2\2\t\67\3\2\2\2\13=\3\2\2\2\rC\3\2\2\2\17O\3\2\2\2\21W\3\2\2\2\23"+
		"_\3\2\2\2\25h\3\2\2\2\27r\3\2\2\2\31v\3\2\2\2\33}\3\2\2\2\35\u0080\3\2"+
		"\2\2\37\u008a\3\2\2\2!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2\'("+
		"\7h\2\2()\7q\2\2)*\7i\2\2*+\7q\2\2+\4\3\2\2\2,-\7c\2\2-.\7i\2\2./\7w\2"+
		"\2/\60\7c\2\2\60\6\3\2\2\2\61\62\7i\2\2\62\63\7t\2\2\63\64\7c\2\2\64\65"+
		"\7o\2\2\65\66\7c\2\2\66\b\3\2\2\2\678\7n\2\289\7w\2\29:\7v\2\2:;\7c\2"+
		"\2;<\7t\2\2<\n\3\2\2\2=>\7h\2\2>?\7w\2\2?@\7i\2\2@A\7k\2\2AB\7t\2\2B\f"+
		"\3\2\2\2CD\7v\2\2DE\7t\2\2EF\7q\2\2FG\7e\2\2GH\7c\2\2HI\7t\2\2IJ\7\"\2"+
		"\2JK\7r\2\2KL\7c\2\2LM\7t\2\2MN\7c\2\2N\16\3\2\2\2OP\7d\2\2PQ\7c\2\2Q"+
		"R\7v\2\2RS\7c\2\2ST\7n\2\2TU\7j\2\2UV\7c\2\2V\20\3\2\2\2WX\7r\2\2XY\7"+
		"q\2\2YZ\7m\2\2Z[\7g\2\2[\\\7o\2\2\\]\7q\2\2]^\7p\2\2^\22\3\2\2\2_`\7u"+
		"\2\2`a\7g\2\2ab\7n\2\2bc\7x\2\2cd\7c\2\2de\7i\2\2ef\7g\2\2fg\7o\2\2g\24"+
		"\3\2\2\2hi\7o\2\2ij\7g\2\2jk\7p\2\2kl\7u\2\2lm\7c\2\2mn\7i\2\2no\7g\2"+
		"\2op\7o\2\2p\26\3\2\2\2qs\4\62;\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2"+
		"\2\2u\30\3\2\2\2vz\t\2\2\2wy\t\3\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{\32\3\2\2\2|z\3\2\2\2}~\7^\2\2~\177\7)\2\2\177\34\3\2\2\2\u0080"+
		"\u0084\7}\2\2\u0081\u0083\n\4\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7\177\2\2\u0088\u0089\b\17\2\2\u0089\36\3\2"+
		"\2\2\u008a\u008b\t\5\2\2\u008b\u008c\b\20\3\2\u008c \3\2\2\2\u008d\u008e"+
		"\7.\2\2\u008e\"\3\2\2\2\u008f\u0090\7<\2\2\u0090$\3\2\2\2\u0091\u0092"+
		"\13\2\2\2\u0092&\3\2\2\2\6\2tz\u0084\4\3\17\2\3\20\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}