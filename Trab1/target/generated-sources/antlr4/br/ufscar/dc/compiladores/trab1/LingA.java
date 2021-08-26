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
		PALAVRA_CHAVE=1, NUM_INT=2, NUM_REAL=3, IDENT=4, CADEIA=5, COMENTARIO=6, 
		WS=7, OP_REL=8, OP_ARIT=9, DELIM=10, ABREPAR=11, FECHAPAR=12, VIRGULA=13, 
		INTERVALO=14, PONTO=15, CHAVE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR", "VIRGULA", 
			"INTERVALO", "PONTO", "CHAVE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "':'", "'('", 
			"')'", "','", "'..'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR", "VIRGULA", 
			"INTERVALO", "PONTO", "CHAVE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0189\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0135\n\2\3\3\6\3\u0138\n\3\r"+
		"\3\16\3\u0139\3\4\6\4\u013d\n\4\r\4\16\4\u013e\3\4\3\4\6\4\u0143\n\4\r"+
		"\4\16\4\u0144\5\4\u0147\n\4\3\5\3\5\7\5\u014b\n\5\f\5\16\5\u014e\13\5"+
		"\3\6\3\6\3\6\3\6\7\6\u0154\n\6\f\6\16\6\u0157\13\6\3\6\3\6\3\7\3\7\7\7"+
		"\u015d\n\7\f\7\16\7\u0160\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0177\n\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\2\2"+
		"\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22\3\2\t\4\2C\\c|\6\2\62;C\\aac|\3\2$$\4\2\f\f\17\17\5\2\13"+
		"\f\17\17\"\"\7\2\'\',-//\61\61``\4\2]]__\2\u01c1\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3\u0134\3\2\2\2\5\u0137\3\2"+
		"\2\2\7\u013c\3\2\2\2\t\u0148\3\2\2\2\13\u014f\3\2\2\2\r\u015a\3\2\2\2"+
		"\17\u0164\3\2\2\2\21\u0176\3\2\2\2\23\u0178\3\2\2\2\25\u017a\3\2\2\2\27"+
		"\u017c\3\2\2\2\31\u017e\3\2\2\2\33\u0180\3\2\2\2\35\u0182\3\2\2\2\37\u0185"+
		"\3\2\2\2!\u0187\3\2\2\2#$\7x\2\2$%\7g\2\2%&\7t\2\2&\'\7f\2\2\'(\7c\2\2"+
		"()\7f\2\2)*\7g\2\2*+\7k\2\2+,\7t\2\2,\u0135\7q\2\2-.\7h\2\2./\7c\2\2/"+
		"\60\7n\2\2\60\61\7u\2\2\61\u0135\7q\2\2\62\63\7x\2\2\63\64\7c\2\2\64\u0135"+
		"\7t\2\2\65\66\7v\2\2\66\67\7k\2\2\678\7r\2\28\u0135\7q\2\29:\7p\2\2:;"+
		"\7c\2\2;\u0135\7q\2\2<\u0135\7g\2\2=>\7q\2\2>\u0135\7w\2\2?@\7h\2\2@A"+
		"\7k\2\2AB\7o\2\2BC\7a\2\2CD\7h\2\2DE\7w\2\2EF\7p\2\2FG\7e\2\2GH\7c\2\2"+
		"H\u0135\7q\2\2IJ\7h\2\2JK\7w\2\2KL\7p\2\2LM\7e\2\2MN\7c\2\2N\u0135\7q"+
		"\2\2OP\7h\2\2PQ\7k\2\2QR\7o\2\2RS\7a\2\2ST\7r\2\2TU\7t\2\2UV\7q\2\2VW"+
		"\7e\2\2WX\7g\2\2XY\7f\2\2YZ\7k\2\2Z[\7o\2\2[\\\7g\2\2\\]\7p\2\2]^\7v\2"+
		"\2^\u0135\7q\2\2_`\7r\2\2`a\7t\2\2ab\7q\2\2bc\7e\2\2cd\7g\2\2de\7f\2\2"+
		"ef\7k\2\2fg\7o\2\2gh\7g\2\2hi\7p\2\2ij\7v\2\2j\u0135\7q\2\2kl\7k\2\2l"+
		"m\7p\2\2mn\7v\2\2no\7g\2\2op\7k\2\2pq\7t\2\2q\u0135\7q\2\2rs\7e\2\2st"+
		"\7q\2\2tu\7p\2\2uv\7u\2\2vw\7v\2\2wx\7c\2\2xy\7p\2\2yz\7v\2\2z\u0135\7"+
		"g\2\2{|\7f\2\2|}\7g\2\2}~\7e\2\2~\177\7n\2\2\177\u0080\7c\2\2\u0080\u0081"+
		"\7t\2\2\u0081\u0135\7g\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7i\2\2\u0085\u0086\7q\2\2\u0086\u0087\7t\2\2\u0087\u0088\7k\2\2"+
		"\u0088\u0089\7v\2\2\u0089\u008a\7o\2\2\u008a\u0135\7q\2\2\u008b\u008c"+
		"\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7v\2\2\u008e\u008f\7g\2\2\u008f"+
		"\u0090\7k\2\2\u0090\u0091\7t\2\2\u0091\u0135\7q\2\2\u0092\u0093\7n\2\2"+
		"\u0093\u0094\7k\2\2\u0094\u0095\7v\2\2\u0095\u0096\7g\2\2\u0096\u0097"+
		"\7t\2\2\u0097\u0098\7c\2\2\u0098\u0135\7n\2\2\u0099\u009a\7t\2\2\u009a"+
		"\u009b\7g\2\2\u009b\u009c\7c\2\2\u009c\u0135\7n\2\2\u009d\u009e\7n\2\2"+
		"\u009e\u009f\7q\2\2\u009f\u00a0\7i\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2"+
		"\7e\2\2\u00a2\u0135\7q\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7w\2\2"+
		"\u00a9\u00aa\7k\2\2\u00aa\u0135\7t\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7k\2\2\u00ae\u0135\7c\2\2\u00af\u00b0\7k\2\2\u00b0"+
		"\u00b1\7o\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7k\2\2"+
		"\u00b4\u00b5\7o\2\2\u00b5\u0135\7c\2\2\u00b6\u00b7\7u\2\2\u00b7\u0135"+
		"\7g\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u0135\7q\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2"+
		"\u00bf\u00c0\7s\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3"+
		"\7p\2\2\u00c3\u00c4\7v\2\2\u00c4\u0135\7q\2\2\u00c5\u00c6\7k\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u0135\7q\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce"+
		"\7o\2\2\u00ce\u00cf\7a\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7n\2\2\u00d1"+
		"\u00d2\7i\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7k\2\2"+
		"\u00d5\u00d6\7v\2\2\u00d6\u00d7\7o\2\2\u00d7\u0135\7q\2\2\u00d8\u00d9"+
		"\7h\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7a\2\2\u00dc"+
		"\u00dd\7u\2\2\u00dd\u0135\7g\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2"+
		"\u00e0\u00e1\7i\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4"+
		"\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u0135\7q\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7u\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7g\2\2"+
		"\u00eb\u00ec\7x\2\2\u00ec\u0135\7c\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1\7a\2\2\u00f1\u00f2\7t\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3\u00f4\7i\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7u\2\2"+
		"\u00f6\u00f7\7v\2\2\u00f7\u00f8\7t\2\2\u00f8\u0135\7q\2\2\u00f9\u00fa"+
		"\7e\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7u\2\2\u00fc\u0135\7q\2\2\u00fd"+
		"\u00fe\7h\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7a\2\2"+
		"\u0101\u0102\7e\2\2\u0102\u0103\7c\2\2\u0103\u0104\7u\2\2\u0104\u0135"+
		"\7q\2\2\u0105\u0106\7u\2\2\u0106\u0107\7g\2\2\u0107\u0108\7l\2\2\u0108"+
		"\u0135\7c\2\2\u0109\u010a\7u\2\2\u010a\u010b\7g\2\2\u010b\u010c\7p\2\2"+
		"\u010c\u010d\7c\2\2\u010d\u0135\7q\2\2\u010e\u010f\7h\2\2\u010f\u0110"+
		"\7c\2\2\u0110\u0111\7e\2\2\u0111\u0135\7c\2\2\u0112\u0113\7c\2\2\u0113"+
		"\u0114\7v\2\2\u0114\u0135\7g\2\2\u0115\u0116\7r\2\2\u0116\u0117\7c\2\2"+
		"\u0117\u0118\7t\2\2\u0118\u0135\7c\2\2\u0119\u011a\7h\2\2\u011a\u011b"+
		"\7k\2\2\u011b\u011c\7o\2\2\u011c\u011d\7a\2\2\u011d\u011e\7r\2\2\u011e"+
		"\u011f\7c\2\2\u011f\u0120\7t\2\2\u0120\u0135\7c\2\2\u0121\u0122\7h\2\2"+
		"\u0122\u0123\7k\2\2\u0123\u0124\7o\2\2\u0124\u0125\7a\2\2\u0125\u0126"+
		"\7g\2\2\u0126\u0127\7p\2\2\u0127\u0128\7s\2\2\u0128\u0129\7w\2\2\u0129"+
		"\u012a\7c\2\2\u012a\u012b\7p\2\2\u012b\u012c\7v\2\2\u012c\u0135\7q\2\2"+
		"\u012d\u012e\7t\2\2\u012e\u012f\7g\2\2\u012f\u0130\7v\2\2\u0130\u0131"+
		"\7q\2\2\u0131\u0132\7t\2\2\u0132\u0133\7p\2\2\u0133\u0135\7g\2\2\u0134"+
		"#\3\2\2\2\u0134-\3\2\2\2\u0134\62\3\2\2\2\u0134\65\3\2\2\2\u01349\3\2"+
		"\2\2\u0134<\3\2\2\2\u0134=\3\2\2\2\u0134?\3\2\2\2\u0134I\3\2\2\2\u0134"+
		"O\3\2\2\2\u0134_\3\2\2\2\u0134k\3\2\2\2\u0134r\3\2\2\2\u0134{\3\2\2\2"+
		"\u0134\u0082\3\2\2\2\u0134\u008b\3\2\2\2\u0134\u0092\3\2\2\2\u0134\u0099"+
		"\3\2\2\2\u0134\u009d\3\2\2\2\u0134\u00a3\3\2\2\2\u0134\u00ab\3\2\2\2\u0134"+
		"\u00af\3\2\2\2\u0134\u00b6\3\2\2\2\u0134\u00b8\3\2\2\2\u0134\u00bd\3\2"+
		"\2\2\u0134\u00c5\3\2\2\2\u0134\u00cb\3\2\2\2\u0134\u00d8\3\2\2\2\u0134"+
		"\u00de\3\2\2\2\u0134\u00e6\3\2\2\2\u0134\u00ed\3\2\2\2\u0134\u00f9\3\2"+
		"\2\2\u0134\u00fd\3\2\2\2\u0134\u0105\3\2\2\2\u0134\u0109\3\2\2\2\u0134"+
		"\u010e\3\2\2\2\u0134\u0112\3\2\2\2\u0134\u0115\3\2\2\2\u0134\u0119\3\2"+
		"\2\2\u0134\u0121\3\2\2\2\u0134\u012d\3\2\2\2\u0135\4\3\2\2\2\u0136\u0138"+
		"\4\62;\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\6\3\2\2\2\u013b\u013d\4\62;\2\u013c\u013b\3\2\2\2"+
		"\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0146"+
		"\3\2\2\2\u0140\u0142\7\60\2\2\u0141\u0143\4\62;\2\u0142\u0141\3\2\2\2"+
		"\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147"+
		"\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0147\3\2\2\2\u0147\b\3\2\2\2\u0148"+
		"\u014c\t\2\2\2\u0149\u014b\t\3\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\n\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0155\7$\2\2\u0150\u0151\7$\2\2\u0151\u0154\7$\2\2\u0152"+
		"\u0154\n\4\2\2\u0153\u0150\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\7$\2\2\u0159\f\3\2\2\2\u015a\u015e\7}\2\2\u015b"+
		"\u015d\n\5\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0162\7\177\2\2\u0162\u0163\b\7\2\2\u0163\16\3\2\2\2\u0164\u0165\t\6"+
		"\2\2\u0165\u0166\b\b\3\2\u0166\20\3\2\2\2\u0167\u0177\7@\2\2\u0168\u0169"+
		"\7@\2\2\u0169\u0177\7?\2\2\u016a\u0177\7>\2\2\u016b\u016c\7>\2\2\u016c"+
		"\u0177\7?\2\2\u016d\u016e\7>\2\2\u016e\u0177\7@\2\2\u016f\u0177\7?\2\2"+
		"\u0170\u0171\7q\2\2\u0171\u0177\7w\2\2\u0172\u0177\7g\2\2\u0173\u0174"+
		"\7>\2\2\u0174\u0177\7/\2\2\u0175\u0177\7(\2\2\u0176\u0167\3\2\2\2\u0176"+
		"\u0168\3\2\2\2\u0176\u016a\3\2\2\2\u0176\u016b\3\2\2\2\u0176\u016d\3\2"+
		"\2\2\u0176\u016f\3\2\2\2\u0176\u0170\3\2\2\2\u0176\u0172\3\2\2\2\u0176"+
		"\u0173\3\2\2\2\u0176\u0175\3\2\2\2\u0177\22\3\2\2\2\u0178\u0179\t\7\2"+
		"\2\u0179\24\3\2\2\2\u017a\u017b\7<\2\2\u017b\26\3\2\2\2\u017c\u017d\7"+
		"*\2\2\u017d\30\3\2\2\2\u017e\u017f\7+\2\2\u017f\32\3\2\2\2\u0180\u0181"+
		"\7.\2\2\u0181\34\3\2\2\2\u0182\u0183\7\60\2\2\u0183\u0184\7\60\2\2\u0184"+
		"\36\3\2\2\2\u0185\u0186\7\60\2\2\u0186 \3\2\2\2\u0187\u0188\t\b\2\2\u0188"+
		"\"\3\2\2\2\r\2\u0134\u0139\u013e\u0144\u0146\u014c\u0153\u0155\u015e\u0176"+
		"\4\3\7\2\3\b\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}