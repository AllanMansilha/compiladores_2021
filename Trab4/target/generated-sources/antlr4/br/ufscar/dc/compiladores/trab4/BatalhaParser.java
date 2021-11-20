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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BATALHA=7, POKEMON=8, 
		SELVAGEM=9, MENSAGEM=10, NUM_INT=11, CADEIA=12, COMENTARIO=13, WS=14, 
		VIRGULA=15, DOISPONTOS=16, ERRO=17;
	public static final int
		RULE_lista_batalha = 0, RULE_lista_pokemon = 1, RULE_lista_selvagem = 2, 
		RULE_mensagem_final = 3, RULE_item = 4, RULE_tipo = 5, RULE_acao = 6, 
		RULE_nome = 7, RULE_nivel = 8, RULE_vida = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"lista_batalha", "lista_pokemon", "lista_selvagem", "mensagem_final", 
			"item", "tipo", "acao", "nome", "nivel", "vida"
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

	public static class Lista_batalhaContext extends ParserRuleContext {
		public TerminalNode BATALHA() { return getToken(BatalhaParser.BATALHA, 0); }
		public Lista_pokemonContext lista_pokemon() {
			return getRuleContext(Lista_pokemonContext.class,0);
		}
		public Lista_selvagemContext lista_selvagem() {
			return getRuleContext(Lista_selvagemContext.class,0);
		}
		public Mensagem_finalContext mensagem_final() {
			return getRuleContext(Mensagem_finalContext.class,0);
		}
		public Lista_batalhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_batalha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterLista_batalha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitLista_batalha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitLista_batalha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_batalhaContext lista_batalha() throws RecognitionException {
		Lista_batalhaContext _localctx = new Lista_batalhaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lista_batalha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(BATALHA);
			setState(21);
			lista_pokemon();
			setState(22);
			lista_selvagem();
			setState(23);
			mensagem_final();
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

	public static class Lista_pokemonContext extends ParserRuleContext {
		public TerminalNode POKEMON() { return getToken(BatalhaParser.POKEMON, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public Lista_pokemonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_pokemon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterLista_pokemon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitLista_pokemon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitLista_pokemon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_pokemonContext lista_pokemon() throws RecognitionException {
		Lista_pokemonContext _localctx = new Lista_pokemonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lista_pokemon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(POKEMON);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				item();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0) );
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

	public static class Lista_selvagemContext extends ParserRuleContext {
		public TerminalNode SELVAGEM() { return getToken(BatalhaParser.SELVAGEM, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public Lista_selvagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_selvagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterLista_selvagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitLista_selvagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitLista_selvagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_selvagemContext lista_selvagem() throws RecognitionException {
		Lista_selvagemContext _localctx = new Lista_selvagemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lista_selvagem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(SELVAGEM);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				item();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0) );
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

	public static class Mensagem_finalContext extends ParserRuleContext {
		public TerminalNode MENSAGEM() { return getToken(BatalhaParser.MENSAGEM, 0); }
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public Mensagem_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensagem_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterMensagem_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitMensagem_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitMensagem_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mensagem_finalContext mensagem_final() throws RecognitionException {
		Mensagem_finalContext _localctx = new Mensagem_finalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mensagem_final);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(MENSAGEM);
			setState(38);
			acao();
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

	public static class ItemContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(BatalhaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(BatalhaParser.VIRGULA, i);
		}
		public NivelContext nivel() {
			return getRuleContext(NivelContext.class,0);
		}
		public VidaContext vida() {
			return getRuleContext(VidaContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			tipo();
			setState(41);
			nome();
			setState(42);
			match(VIRGULA);
			setState(43);
			nivel();
			setState(44);
			match(VIRGULA);
			setState(45);
			vida();
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
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
		enterRule(_localctx, 12, RULE_acao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(49);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(50);
				match(T__4);
				}
				break;
			case T__5:
				{
				setState(51);
				match(T__5);
				setState(52);
				nome();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(BatalhaParser.CADEIA, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(CADEIA);
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

	public static class NivelContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(BatalhaParser.NUM_INT, 0); }
		public NivelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nivel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterNivel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitNivel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitNivel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NivelContext nivel() throws RecognitionException {
		NivelContext _localctx = new NivelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nivel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(NUM_INT);
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

	public static class VidaContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(BatalhaParser.NUM_INT, 0); }
		public VidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).enterVida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BatalhaListener ) ((BatalhaListener)listener).exitVida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BatalhaVisitor ) return ((BatalhaVisitor<? extends T>)visitor).visitVida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VidaContext vida() throws RecognitionException {
		VidaContext _localctx = new VidaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(NUM_INT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\4\3\4\6\4$\n\4\r\4"+
		"\16\4%\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\5\b8\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24"+
		"\2\3\3\2\3\5\29\2\26\3\2\2\2\4\33\3\2\2\2\6!\3\2\2\2\b\'\3\2\2\2\n*\3"+
		"\2\2\2\f\61\3\2\2\2\16\67\3\2\2\2\209\3\2\2\2\22;\3\2\2\2\24=\3\2\2\2"+
		"\26\27\7\t\2\2\27\30\5\4\3\2\30\31\5\6\4\2\31\32\5\b\5\2\32\3\3\2\2\2"+
		"\33\35\7\n\2\2\34\36\5\n\6\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2"+
		"\37 \3\2\2\2 \5\3\2\2\2!#\7\13\2\2\"$\5\n\6\2#\"\3\2\2\2$%\3\2\2\2%#\3"+
		"\2\2\2%&\3\2\2\2&\7\3\2\2\2\'(\7\f\2\2()\5\16\b\2)\t\3\2\2\2*+\5\f\7\2"+
		"+,\5\20\t\2,-\7\21\2\2-.\5\22\n\2./\7\21\2\2/\60\5\24\13\2\60\13\3\2\2"+
		"\2\61\62\t\2\2\2\62\r\3\2\2\2\638\7\6\2\2\648\7\7\2\2\65\66\7\b\2\2\66"+
		"8\5\20\t\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\28\17\3\2\2\29:\7\16"+
		"\2\2:\21\3\2\2\2;<\7\r\2\2<\23\3\2\2\2=>\7\r\2\2>\25\3\2\2\2\5\37%\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}