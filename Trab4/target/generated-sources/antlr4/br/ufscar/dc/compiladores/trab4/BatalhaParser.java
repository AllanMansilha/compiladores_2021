// Generated from br/ufscar/dc/compiladores/trab4/Batalha.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trab4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BatalhaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, PalavrasChave=12, VIRGULA=13, DOISPONTOS=14, Abre=15, 
		Fecha=16, Tipo=17, Nome=18, NUM_INT=19, Nivel=20, Vida=21, ERRO=22, COMENTARIO=23, 
		WS=24;
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_declaracao_equipe = 2, RULE_declaracao_selvagem = 3, 
		RULE_acao = 4, RULE_cmdLutar = 5, RULE_cmdTrocar = 6, RULE_cmdFugir = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "corpo", "declaracao_equipe", "declaracao_selvagem", "acao", 
			"cmdLutar", "cmdTrocar", "cmdFugir"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pokemon equipe'", "'nome'", "'tipo'", "'nivel'", "'vida'", "'fim equipe'", 
			"'pokemon selvagem'", "'fim selvagem'", "'Atacar'", "'Trocar'", "'Fugir'", 
			null, "','", "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"PalavrasChave", "VIRGULA", "DOISPONTOS", "Abre", "Fecha", "Tipo", "Nome", 
			"NUM_INT", "Nivel", "Vida", "ERRO", "COMENTARIO", "WS"
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

	@Override
	public String getGrammarFileName() { return "Batalha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BatalhaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			corpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public Declaracao_selvagemContext declaracao_selvagem() {
			return getRuleContext(Declaracao_selvagemContext.class,0);
		}
		public List<Declaracao_equipeContext> declaracao_equipe() {
			return getRuleContexts(Declaracao_equipeContext.class);
		}
		public Declaracao_equipeContext declaracao_equipe(int i) {
			return getRuleContext(Declaracao_equipeContext.class,i);
		}
		public List<AcaoContext> acao() {
			return getRuleContexts(AcaoContext.class);
		}
		public AcaoContext acao(int i) {
			return getRuleContext(AcaoContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				declaracao_equipe();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(23);
			declaracao_selvagem();
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				acao();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_equipeContext extends ParserRuleContext {
		public List<TerminalNode> DOISPONTOS() { return getTokens(BatalhaParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(BatalhaParser.DOISPONTOS, i);
		}
		public TerminalNode Nome() { return getToken(BatalhaParser.Nome, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(BatalhaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BatalhaParser.VIRGULA, i);
		}
		public TerminalNode Tipo() { return getToken(BatalhaParser.Tipo, 0); }
		public TerminalNode Nivel() { return getToken(BatalhaParser.Nivel, 0); }
		public TerminalNode Vida() { return getToken(BatalhaParser.Vida, 0); }
		public Declaracao_equipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_equipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterDeclaracao_equipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitDeclaracao_equipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitDeclaracao_equipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_equipeContext declaracao_equipe() throws RecognitionException {
		Declaracao_equipeContext _localctx = new Declaracao_equipeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_equipe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			match(T__1);
			setState(31);
			match(DOISPONTOS);
			setState(32);
			match(Nome);
			setState(33);
			match(VIRGULA);
			setState(34);
			match(T__2);
			setState(35);
			match(DOISPONTOS);
			setState(36);
			match(Tipo);
			setState(37);
			match(VIRGULA);
			setState(38);
			match(T__3);
			setState(39);
			match(DOISPONTOS);
			setState(40);
			match(Nivel);
			setState(41);
			match(VIRGULA);
			setState(42);
			match(T__4);
			setState(43);
			match(DOISPONTOS);
			setState(44);
			match(Vida);
			setState(45);
			match(VIRGULA);
			setState(46);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_selvagemContext extends ParserRuleContext {
		public List<TerminalNode> DOISPONTOS() { return getTokens(BatalhaParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(BatalhaParser.DOISPONTOS, i);
		}
		public TerminalNode Nome() { return getToken(BatalhaParser.Nome, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(BatalhaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BatalhaParser.VIRGULA, i);
		}
		public TerminalNode Tipo() { return getToken(BatalhaParser.Tipo, 0); }
		public TerminalNode Nivel() { return getToken(BatalhaParser.Nivel, 0); }
		public TerminalNode Vida() { return getToken(BatalhaParser.Vida, 0); }
		public Declaracao_selvagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_selvagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterDeclaracao_selvagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitDeclaracao_selvagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitDeclaracao_selvagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_selvagemContext declaracao_selvagem() throws RecognitionException {
		Declaracao_selvagemContext _localctx = new Declaracao_selvagemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_selvagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__6);
			setState(49);
			match(T__1);
			setState(50);
			match(DOISPONTOS);
			setState(51);
			match(Nome);
			setState(52);
			match(VIRGULA);
			setState(53);
			match(T__2);
			setState(54);
			match(DOISPONTOS);
			setState(55);
			match(Tipo);
			setState(56);
			match(VIRGULA);
			setState(57);
			match(T__3);
			setState(58);
			match(DOISPONTOS);
			setState(59);
			match(Nivel);
			setState(60);
			match(VIRGULA);
			setState(61);
			match(T__4);
			setState(62);
			match(DOISPONTOS);
			setState(63);
			match(Vida);
			setState(64);
			match(VIRGULA);
			setState(65);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AcaoContext extends ParserRuleContext {
		public CmdLutarContext cmdLutar() {
			return getRuleContext(CmdLutarContext.class,0);
		}
		public CmdTrocarContext cmdTrocar() {
			return getRuleContext(CmdTrocarContext.class,0);
		}
		public CmdFugirContext cmdFugir() {
			return getRuleContext(CmdFugirContext.class,0);
		}
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterAcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitAcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitAcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_acao);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				cmdLutar();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				cmdTrocar();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				cmdFugir();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLutarContext extends ParserRuleContext {
		public TerminalNode Abre() { return getToken(BatalhaParser.Abre, 0); }
		public TerminalNode Nome() { return getToken(BatalhaParser.Nome, 0); }
		public TerminalNode Fecha() { return getToken(BatalhaParser.Fecha, 0); }
		public CmdLutarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLutar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterCmdLutar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitCmdLutar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitCmdLutar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLutarContext cmdLutar() throws RecognitionException {
		CmdLutarContext _localctx = new CmdLutarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdLutar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__8);
			setState(73);
			match(Abre);
			setState(74);
			match(Nome);
			setState(75);
			match(Fecha);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdTrocarContext extends ParserRuleContext {
		public TerminalNode Abre() { return getToken(BatalhaParser.Abre, 0); }
		public TerminalNode Nome() { return getToken(BatalhaParser.Nome, 0); }
		public TerminalNode Fecha() { return getToken(BatalhaParser.Fecha, 0); }
		public CmdTrocarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdTrocar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterCmdTrocar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitCmdTrocar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitCmdTrocar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdTrocarContext cmdTrocar() throws RecognitionException {
		CmdTrocarContext _localctx = new CmdTrocarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdTrocar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__9);
			setState(78);
			match(Abre);
			setState(79);
			match(Nome);
			setState(80);
			match(Fecha);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdFugirContext extends ParserRuleContext {
		public CmdFugirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFugir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterCmdFugir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitCmdFugir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitCmdFugir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdFugirContext cmdFugir() throws RecognitionException {
		CmdFugirContext _localctx = new CmdFugirContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdFugir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\6\3\26"+
		"\n\3\r\3\16\3\27\3\3\3\3\6\3\34\n\3\r\3\16\3\35\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\5\6I\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\2\2\n"+
		"\2\4\6\b\n\f\16\20\2\2\2R\2\22\3\2\2\2\4\25\3\2\2\2\6\37\3\2\2\2\b\62"+
		"\3\2\2\2\nH\3\2\2\2\fJ\3\2\2\2\16O\3\2\2\2\20T\3\2\2\2\22\23\5\4\3\2\23"+
		"\3\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27"+
		"\30\3\2\2\2\30\31\3\2\2\2\31\33\5\b\5\2\32\34\5\n\6\2\33\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\5\3\2\2\2\37 \7\3\2\2 !\7\4"+
		"\2\2!\"\7\20\2\2\"#\7\24\2\2#$\7\17\2\2$%\7\5\2\2%&\7\20\2\2&\'\7\23\2"+
		"\2\'(\7\17\2\2()\7\6\2\2)*\7\20\2\2*+\7\26\2\2+,\7\17\2\2,-\7\7\2\2-."+
		"\7\20\2\2./\7\27\2\2/\60\7\17\2\2\60\61\7\b\2\2\61\7\3\2\2\2\62\63\7\t"+
		"\2\2\63\64\7\4\2\2\64\65\7\20\2\2\65\66\7\24\2\2\66\67\7\17\2\2\678\7"+
		"\5\2\289\7\20\2\29:\7\23\2\2:;\7\17\2\2;<\7\6\2\2<=\7\20\2\2=>\7\26\2"+
		"\2>?\7\17\2\2?@\7\7\2\2@A\7\20\2\2AB\7\27\2\2BC\7\17\2\2CD\7\n\2\2D\t"+
		"\3\2\2\2EI\5\f\7\2FI\5\16\b\2GI\5\20\t\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2"+
		"I\13\3\2\2\2JK\7\13\2\2KL\7\21\2\2LM\7\24\2\2MN\7\22\2\2N\r\3\2\2\2OP"+
		"\7\f\2\2PQ\7\21\2\2QR\7\24\2\2RS\7\22\2\2S\17\3\2\2\2TU\7\r\2\2U\21\3"+
		"\2\2\2\5\27\35H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}