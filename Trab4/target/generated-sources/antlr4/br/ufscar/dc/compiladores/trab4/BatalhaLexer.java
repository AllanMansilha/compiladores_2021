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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PalavrasChave=11, VIRGULA=12, DOISPONTOS=13, Abre=14, Fecha=15, 
		Tipo=16, Nome=17, Vida=18, COMENTARIO=19, WS=20, ERRO=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "PalavrasChave", "VIRGULA", "DOISPONTOS", "Abre", "Fecha", "Tipo", 
			"Nome", "Vida", "ESC_SEQ", "COMENTARIO", "WS", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pokemon equipe'", "'nome'", "'tipo'", "'vida'", "'fim equipe'", 
			"'pokemon selvagem'", "'fim selvagem'", "'Lutar'", "'Trocar'", "'Fugir'", 
			null, "','", "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PalavrasChave", 
			"VIRGULA", "DOISPONTOS", "Abre", "Fecha", "Tipo", "Nome", "Vida", "COMENTARIO", 
			"WS", "ERRO"
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
		case 19:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0115\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00df"+
		"\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f6\n\21\3\22\3\22\7\22"+
		"\u00fa\n\22\f\22\16\22\u00fd\13\22\3\23\6\23\u0100\n\23\r\23\16\23\u0101"+
		"\3\24\3\24\3\24\3\25\3\25\7\25\u0109\n\25\f\25\16\25\u010c\13\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25+\26"+
		"-\27\3\2\6\4\2C\\c|\5\2\"\"C\\c|\5\2\f\f\17\17\177\177\5\2\13\f\17\17"+
		"\"\"\2\u0122\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2"+
		"\5>\3\2\2\2\7C\3\2\2\2\tH\3\2\2\2\13M\3\2\2\2\rX\3\2\2\2\17i\3\2\2\2\21"+
		"v\3\2\2\2\23|\3\2\2\2\25\u0083\3\2\2\2\27\u00de\3\2\2\2\31\u00e0\3\2\2"+
		"\2\33\u00e2\3\2\2\2\35\u00e4\3\2\2\2\37\u00e6\3\2\2\2!\u00f5\3\2\2\2#"+
		"\u00f7\3\2\2\2%\u00ff\3\2\2\2\'\u0103\3\2\2\2)\u0106\3\2\2\2+\u0110\3"+
		"\2\2\2-\u0113\3\2\2\2/\60\7r\2\2\60\61\7q\2\2\61\62\7m\2\2\62\63\7g\2"+
		"\2\63\64\7o\2\2\64\65\7q\2\2\65\66\7p\2\2\66\67\7\"\2\2\678\7g\2\289\7"+
		"s\2\29:\7w\2\2:;\7k\2\2;<\7r\2\2<=\7g\2\2=\4\3\2\2\2>?\7p\2\2?@\7q\2\2"+
		"@A\7o\2\2AB\7g\2\2B\6\3\2\2\2CD\7v\2\2DE\7k\2\2EF\7r\2\2FG\7q\2\2G\b\3"+
		"\2\2\2HI\7x\2\2IJ\7k\2\2JK\7f\2\2KL\7c\2\2L\n\3\2\2\2MN\7h\2\2NO\7k\2"+
		"\2OP\7o\2\2PQ\7\"\2\2QR\7g\2\2RS\7s\2\2ST\7w\2\2TU\7k\2\2UV\7r\2\2VW\7"+
		"g\2\2W\f\3\2\2\2XY\7r\2\2YZ\7q\2\2Z[\7m\2\2[\\\7g\2\2\\]\7o\2\2]^\7q\2"+
		"\2^_\7p\2\2_`\7\"\2\2`a\7u\2\2ab\7g\2\2bc\7n\2\2cd\7x\2\2de\7c\2\2ef\7"+
		"i\2\2fg\7g\2\2gh\7o\2\2h\16\3\2\2\2ij\7h\2\2jk\7k\2\2kl\7o\2\2lm\7\"\2"+
		"\2mn\7u\2\2no\7g\2\2op\7n\2\2pq\7x\2\2qr\7c\2\2rs\7i\2\2st\7g\2\2tu\7"+
		"o\2\2u\20\3\2\2\2vw\7N\2\2wx\7w\2\2xy\7v\2\2yz\7c\2\2z{\7t\2\2{\22\3\2"+
		"\2\2|}\7V\2\2}~\7t\2\2~\177\7q\2\2\177\u0080\7e\2\2\u0080\u0081\7c\2\2"+
		"\u0081\u0082\7t\2\2\u0082\24\3\2\2\2\u0083\u0084\7H\2\2\u0084\u0085\7"+
		"w\2\2\u0085\u0086\7i\2\2\u0086\u0087\7k\2\2\u0087\u0088\7t\2\2\u0088\26"+
		"\3\2\2\2\u0089\u008a\7p\2\2\u008a\u008b\7q\2\2\u008b\u008c\7o\2\2\u008c"+
		"\u00df\7g\2\2\u008d\u008e\7v\2\2\u008e\u008f\7k\2\2\u008f\u0090\7r\2\2"+
		"\u0090\u00df\7q\2\2\u0091\u0092\7p\2\2\u0092\u0093\7k\2\2\u0093\u0094"+
		"\7x\2\2\u0094\u0095\7g\2\2\u0095\u00df\7n\2\2\u0096\u0097\7x\2\2\u0097"+
		"\u0098\7k\2\2\u0098\u0099\7f\2\2\u0099\u00df\7c\2\2\u009a\u009b\7n\2\2"+
		"\u009b\u009c\7w\2\2\u009c\u009d\7v\2\2\u009d\u009e\7c\2\2\u009e\u00df"+
		"\7t\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7q\2\2\u00a2"+
		"\u00a3\7e\2\2\u00a3\u00a4\7c\2\2\u00a4\u00df\7t\2\2\u00a5\u00a6\7h\2\2"+
		"\u00a6\u00a7\7w\2\2\u00a7\u00a8\7i\2\2\u00a8\u00a9\7k\2\2\u00a9\u00df"+
		"\7t\2\2\u00aa\u00ab\7r\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7m\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7p\2\2"+
		"\u00b1\u00b2\7\"\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7s\2\2\u00b4\u00b5"+
		"\7w\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7r\2\2\u00b7\u00df\7g\2\2\u00b8"+
		"\u00b9\7h\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7\"\2"+
		"\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7s\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0\u00c1\7r\2\2\u00c1\u00df\7g\2\2\u00c2\u00c3\7r\2\2\u00c3"+
		"\u00c4\7q\2\2\u00c4\u00c5\7m\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7o\2\2"+
		"\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7\"\2\2\u00ca\u00cb"+
		"\7u\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7x\2\2\u00ce"+
		"\u00cf\7c\2\2\u00cf\u00d0\7i\2\2\u00d0\u00d1\7g\2\2\u00d1\u00df\7o\2\2"+
		"\u00d2\u00d3\7h\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6"+
		"\7\"\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7n\2\2\u00d9"+
		"\u00da\7x\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7i\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd\u00df\7o\2\2\u00de\u0089\3\2\2\2\u00de\u008d\3\2\2\2\u00de\u0091"+
		"\3\2\2\2\u00de\u0096\3\2\2\2\u00de\u009a\3\2\2\2\u00de\u009f\3\2\2\2\u00de"+
		"\u00a5\3\2\2\2\u00de\u00aa\3\2\2\2\u00de\u00b8\3\2\2\2\u00de\u00c2\3\2"+
		"\2\2\u00de\u00d2\3\2\2\2\u00df\30\3\2\2\2\u00e0\u00e1\7.\2\2\u00e1\32"+
		"\3\2\2\2\u00e2\u00e3\7<\2\2\u00e3\34\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5"+
		"\36\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7 \3\2\2\2\u00e8\u00e9\7h\2\2\u00e9"+
		"\u00ea\7q\2\2\u00ea\u00eb\7i\2\2\u00eb\u00f6\7q\2\2\u00ec\u00ed\7c\2\2"+
		"\u00ed\u00ee\7i\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f6\7c\2\2\u00f0\u00f1"+
		"\7i\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7o\2\2\u00f4"+
		"\u00f6\7c\2\2\u00f5\u00e8\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00f0\3\2"+
		"\2\2\u00f6\"\3\2\2\2\u00f7\u00fb\t\2\2\2\u00f8\u00fa\t\3\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"$\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\4\62;\2\u00ff\u00fe\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102&\3"+
		"\2\2\2\u0103\u0104\7^\2\2\u0104\u0105\7)\2\2\u0105(\3\2\2\2\u0106\u010a"+
		"\7}\2\2\u0107\u0109\n\4\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u010e\7\177\2\2\u010e\u010f\b\25\2\2\u010f*\3\2\2\2\u0110\u0111"+
		"\t\5\2\2\u0111\u0112\b\26\3\2\u0112,\3\2\2\2\u0113\u0114\13\2\2\2\u0114"+
		".\3\2\2\2\b\2\u00de\u00f5\u00fb\u0101\u010a\4\3\25\2\3\26\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}