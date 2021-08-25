// Generated from br/ufscar/dc/compiladores/trab1/LingA.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trab1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LingA extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUMINT=2, NUMREAL=3, IDENT=4, CADEIA=5, COMENTARIO=6, 
		WS=7, OP_REL=8, OP_ARIT=9, DELIM=10, ABREPAR=11, FECHAPAR=12, VIRGULA=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUMINT", "NUMREAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR", "VIRGULA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "':'", "'('", 
			"')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUMINT", "NUMREAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR", "VIRGULA"
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


	public LingA(CharStream input) {
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
		case 5:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u00e9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0096\n\2\3\3\5\3\u0099\n\3\3\3\6\3\u009c"+
		"\n\3\r\3\16\3\u009d\3\4\5\4\u00a1\n\4\3\4\6\4\u00a4\n\4\r\4\16\4\u00a5"+
		"\3\4\3\4\6\4\u00aa\n\4\r\4\16\4\u00ab\5\4\u00ae\n\4\3\5\3\5\7\5\u00b2"+
		"\n\5\f\5\16\5\u00b5\13\5\3\6\3\6\3\6\3\6\7\6\u00bb\n\6\f\6\16\6\u00be"+
		"\13\6\3\6\3\6\3\7\3\7\7\7\u00c4\n\7\f\7\16\7\u00c7\13\7\3\7\5\7\u00ca"+
		"\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u00de\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\2\2\17"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\t"+
		"\4\2--//\4\2C\\c|\5\2\62;C\\c|\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\5\2,-//\61\61\2\u010a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\u0095\3\2\2\2\5\u0098"+
		"\3\2\2\2\7\u00a0\3\2\2\2\t\u00af\3\2\2\2\13\u00b6\3\2\2\2\r\u00c1\3\2"+
		"\2\2\17\u00ce\3\2\2\2\21\u00dd\3\2\2\2\23\u00df\3\2\2\2\25\u00e1\3\2\2"+
		"\2\27\u00e3\3\2\2\2\31\u00e5\3\2\2\2\33\u00e7\3\2\2\2\35\36\7f\2\2\36"+
		"\37\7g\2\2\37 \7e\2\2 !\7n\2\2!\"\7c\2\2\"#\7t\2\2#\u0096\7g\2\2$%\7c"+
		"\2\2%&\7n\2\2&\'\7i\2\2\'(\7q\2\2()\7t\2\2)*\7k\2\2*+\7v\2\2+,\7o\2\2"+
		",\u0096\7q\2\2-.\7k\2\2./\7p\2\2/\60\7v\2\2\60\61\7g\2\2\61\62\7k\2\2"+
		"\62\63\7t\2\2\63\u0096\7q\2\2\64\65\7n\2\2\65\66\7k\2\2\66\67\7v\2\2\67"+
		"8\7g\2\289\7t\2\29:\7c\2\2:\u0096\7n\2\2;<\7t\2\2<=\7g\2\2=>\7c\2\2>\u0096"+
		"\7n\2\2?@\7n\2\2@A\7q\2\2AB\7i\2\2BC\7k\2\2CD\7e\2\2D\u0096\7q\2\2EF\7"+
		"c\2\2FG\7v\2\2GH\7t\2\2HI\7k\2\2IJ\7d\2\2JK\7w\2\2KL\7k\2\2L\u0096\7t"+
		"\2\2MN\7n\2\2NO\7g\2\2OP\7k\2\2P\u0096\7c\2\2QR\7k\2\2RS\7o\2\2ST\7r\2"+
		"\2TU\7t\2\2UV\7k\2\2VW\7o\2\2WX\7k\2\2X\u0096\7t\2\2YZ\7u\2\2Z\u0096\7"+
		"g\2\2[\\\7g\2\2\\]\7p\2\2]^\7v\2\2^_\7c\2\2_\u0096\7q\2\2`a\7g\2\2ab\7"+
		"p\2\2bc\7s\2\2cd\7w\2\2de\7c\2\2ef\7p\2\2fg\7v\2\2g\u0096\7q\2\2hi\7k"+
		"\2\2ij\7p\2\2jk\7k\2\2kl\7e\2\2lm\7k\2\2m\u0096\7q\2\2no\7h\2\2op\7k\2"+
		"\2pq\7o\2\2qr\7a\2\2rs\7c\2\2st\7n\2\2tu\7i\2\2uv\7q\2\2vw\7t\2\2wx\7"+
		"k\2\2xy\7v\2\2yz\7o\2\2z\u0096\7q\2\2{|\7h\2\2|}\7k\2\2}~\7o\2\2~\177"+
		"\7a\2\2\177\u0080\7u\2\2\u0080\u0096\7g\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\7g\2\2\u0083\u0084\7i\2\2\u0084\u0085\7k\2\2\u0085\u0086\7u\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0096\7q\2\2\u0089\u008a\7h\2\2"+
		"\u008a\u008b\7k\2\2\u008b\u008c\7o\2\2\u008c\u008d\7a\2\2\u008d\u008e"+
		"\7t\2\2\u008e\u008f\7g\2\2\u008f\u0090\7i\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7u\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0096\7q\2\2"+
		"\u0095\35\3\2\2\2\u0095$\3\2\2\2\u0095-\3\2\2\2\u0095\64\3\2\2\2\u0095"+
		";\3\2\2\2\u0095?\3\2\2\2\u0095E\3\2\2\2\u0095M\3\2\2\2\u0095Q\3\2\2\2"+
		"\u0095Y\3\2\2\2\u0095[\3\2\2\2\u0095`\3\2\2\2\u0095h\3\2\2\2\u0095n\3"+
		"\2\2\2\u0095{\3\2\2\2\u0095\u0081\3\2\2\2\u0095\u0089\3\2\2\2\u0096\4"+
		"\3\2\2\2\u0097\u0099\t\2\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u009c\4\62;\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\6\3\2\2\2\u009f\u00a1"+
		"\t\2\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u00a4\4\62;\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ad\3\2\2\2\u00a7\u00a9\7\60\2\2\u00a8"+
		"\u00aa\4\62;\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\b\3\2\2\2\u00af\u00b3\t\3\2\2\u00b0\u00b2\t\4\2\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\n\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00bc\7$\2\2\u00b7"+
		"\u00b8\7$\2\2\u00b8\u00bb\7$\2\2\u00b9\u00bb\n\5\2\2\u00ba\u00b7\3\2\2"+
		"\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0"+
		"\f\3\2\2\2\u00c1\u00c5\7}\2\2\u00c2\u00c4\n\6\2\2\u00c3\u00c2\3\2\2\2"+
		"\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\7\17\2\2\u00c9\u00c8\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd"+
		"\b\7\2\2\u00cd\16\3\2\2\2\u00ce\u00cf\t\7\2\2\u00cf\u00d0\b\b\3\2\u00d0"+
		"\20\3\2\2\2\u00d1\u00de\7@\2\2\u00d2\u00d3\7@\2\2\u00d3\u00de\7?\2\2\u00d4"+
		"\u00de\7>\2\2\u00d5\u00d6\7>\2\2\u00d6\u00de\7?\2\2\u00d7\u00d8\7>\2\2"+
		"\u00d8\u00de\7@\2\2\u00d9\u00de\7?\2\2\u00da\u00db\7q\2\2\u00db\u00de"+
		"\7w\2\2\u00dc\u00de\7g\2\2\u00dd\u00d1\3\2\2\2\u00dd\u00d2\3\2\2\2\u00dd"+
		"\u00d4\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d9\3\2"+
		"\2\2\u00dd\u00da\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\22\3\2\2\2\u00df\u00e0"+
		"\t\b\2\2\u00e0\24\3\2\2\2\u00e1\u00e2\7<\2\2\u00e2\26\3\2\2\2\u00e3\u00e4"+
		"\7*\2\2\u00e4\30\3\2\2\2\u00e5\u00e6\7+\2\2\u00e6\32\3\2\2\2\u00e7\u00e8"+
		"\7.\2\2\u00e8\34\3\2\2\2\20\2\u0095\u0098\u009d\u00a0\u00a5\u00ab\u00ad"+
		"\u00b3\u00ba\u00bc\u00c5\u00c9\u00dd\4\3\7\2\3\b\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}