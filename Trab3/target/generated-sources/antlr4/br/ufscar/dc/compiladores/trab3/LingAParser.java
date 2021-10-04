// Generated from br/ufscar/dc/compiladores/trab3/LingA.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trab3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LingAParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_dimensao = 6, RULE_tipo = 7, 
		RULE_tipo_basico = 8, RULE_tipo_basico_ident = 9, RULE_tipo_estendido = 10, 
		RULE_valor_constante = 11, RULE_registro = 12, RULE_declaracao_global = 13, 
		RULE_parametro = 14, RULE_parametros = 15, RULE_corpo = 16, RULE_cmd = 17, 
		RULE_cmdleia = 18, RULE_cmdescreva = 19, RULE_cmdse = 20, RULE_cmdcaso = 21, 
		RULE_cmdpara = 22, RULE_cmdenquanto = 23, RULE_cmdfaca = 24, RULE_cmdatribuicao = 25, 
		RULE_cmdchamada = 26, RULE_cmdretorne = 27, RULE_selecao = 28, RULE_item_selecao = 29, 
		RULE_constantes = 30, RULE_numero_intervalo = 31, RULE_op_unario = 32, 
		RULE_exp_aritmetica = 33, RULE_termo = 34, RULE_fator = 35, RULE_op1 = 36, 
		RULE_op2 = 37, RULE_op3 = 38, RULE_parcela = 39, RULE_parcela_unario = 40, 
		RULE_parcela_nao_unario = 41, RULE_exp_relacional = 42, RULE_op_relacional = 43, 
		RULE_expressao = 44, RULE_termo_logico = 45, RULE_fator_logico = 46, RULE_parcela_logica = 47, 
		RULE_op_logico_1 = 48, RULE_op_logico_2 = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
			"identificador", "dimensao", "tipo", "tipo_basico", "tipo_basico_ident", 
			"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
			"parametro", "parametros", "corpo", "cmd", "cmdleia", "cmdescreva", "cmdse", 
			"cmdcaso", "cmdpara", "cmdenquanto", "cmdfaca", "cmdatribuicao", "cmdchamada", 
			"cmdretorne", "selecao", "item_selecao", "constantes", "numero_intervalo", 
			"op_unario", "exp_aritmetica", "termo", "fator", "op1", "op2", "op3", 
			"parcela", "parcela_unario", "parcela_nao_unario", "exp_relacional", 
			"op_relacional", "expressao", "termo_logico", "fator_logico", "parcela_logica", 
			"op_logico_1", "op_logico_2"
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

	@Override
	public String getGrammarFileName() { return "LingA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LingAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(LingAParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LingAParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			declaracoes();
			setState(101);
			match(ALGORITMO);
			setState(102);
			corpo();
			setState(103);
			match(T__0);
			setState(104);
			match(EOF);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO) | (1L << PROCEDIMENTO) | (1L << FUNCAO))) != 0)) {
				{
				{
				setState(106);
				decl_local_global();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitDecl_local_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitDecl_local_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case CONSTANTE:
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				declaracao_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				declaracao_global();
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

	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(LingAParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(LingAParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(LingAParser.IDENT, 0); }
		public TerminalNode DELIM() { return getToken(LingAParser.DELIM, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(LingAParser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(LingAParser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(DECLARE);
				setState(117);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(CONSTANTE);
				setState(119);
				match(IDENT);
				setState(120);
				match(DELIM);
				setState(121);
				tipo_basico();
				setState(122);
				match(IGUAL);
				setState(123);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(TIPO);
				setState(126);
				match(IDENT);
				setState(127);
				match(DELIM);
				setState(128);
				tipo();
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

	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIM() { return getToken(LingAParser.DELIM, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LingAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LingAParser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			identificador();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(132);
				match(VIRGULA);
				setState(133);
				identificador();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(DELIM);
			setState(140);
			tipo();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(LingAParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LingAParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public List<TerminalNode> PONTO() { return getTokens(LingAParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(LingAParser.PONTO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IDENT);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(143);
				match(PONTO);
				setState(144);
				match(IDENT);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			dimensao();
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

	public static class DimensaoContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(152);
				match(T__1);
				setState(153);
				exp_aritmetica();
				setState(154);
				match(T__2);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				registro();
				}
				break;
			case PONTEIRO:
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				tipo_estendido();
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(LingAParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(LingAParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(LingAParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(LingAParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << INTEIRO) | (1L << REAL) | (1L << LOGICO))) != 0)) ) {
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LingAParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitTipo_basico_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitTipo_basico_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_basico_ident);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(IDENT);
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

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(LingAParser.PONTEIRO, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(171);
				match(PONTEIRO);
				}
			}

			setState(174);
			tipo_basico_ident();
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LingAParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(LingAParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LingAParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LingAParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(LingAParser.FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (VERDADEIRO - 23)) | (1L << (FALSO - 23)) | (1L << (NUM_INT - 23)) | (1L << (NUM_REAL - 23)) | (1L << (CADEIA - 23)))) != 0)) ) {
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

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(LingAParser.REGISTRO, 0); }
		public TerminalNode FIM_REGISTRO() { return getToken(LingAParser.FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(REGISTRO);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(179);
				variavel();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(FIM_REGISTRO);
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

	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(LingAParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(LingAParser.IDENT, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(LingAParser.FIM_PROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(LingAParser.FUNCAO, 0); }
		public TerminalNode DELIM() { return getToken(LingAParser.DELIM, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNÇÃO() { return getToken(LingAParser.FIM_FUNÇÃO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitDeclaracao_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitDeclaracao_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracao_global);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(PROCEDIMENTO);
				setState(188);
				match(IDENT);
				setState(189);
				match(T__3);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==IDENT) {
					{
					setState(190);
					parametros();
					}
				}

				setState(193);
				match(T__4);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
					{
					{
					setState(194);
					declaracao_local();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (PONTEIRO - 18)) | (1L << (RETORNE - 18)) | (1L << (LEIA - 18)) | (1L << (ESCREVA - 18)) | (1L << (SE - 18)) | (1L << (CASO - 18)) | (1L << (PARA - 18)) | (1L << (FACA - 18)) | (1L << (ENQUANTO - 18)) | (1L << (IDENT - 18)))) != 0)) {
					{
					{
					setState(200);
					cmd();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(FUNCAO);
				setState(208);
				match(IDENT);
				setState(209);
				match(T__3);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==IDENT) {
					{
					setState(210);
					parametros();
					}
				}

				setState(213);
				match(T__4);
				setState(214);
				match(DELIM);
				setState(215);
				tipo_estendido();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
					{
					{
					setState(216);
					declaracao_local();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (PONTEIRO - 18)) | (1L << (RETORNE - 18)) | (1L << (LEIA - 18)) | (1L << (ESCREVA - 18)) | (1L << (SE - 18)) | (1L << (CASO - 18)) | (1L << (PARA - 18)) | (1L << (FACA - 18)) | (1L << (ENQUANTO - 18)) | (1L << (IDENT - 18)))) != 0)) {
					{
					{
					setState(222);
					cmd();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(FIM_FUNÇÃO);
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

	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIM() { return getToken(LingAParser.DELIM, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LingAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LingAParser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(232);
				match(T__5);
				}
			}

			setState(235);
			identificador();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(236);
				match(VIRGULA);
				setState(237);
				identificador();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(DELIM);
			setState(244);
			tipo_estendido();
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LingAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LingAParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			parametro();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(247);
				match(VIRGULA);
				setState(248);
				parametro();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(254);
				declaracao_local();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (PONTEIRO - 18)) | (1L << (RETORNE - 18)) | (1L << (LEIA - 18)) | (1L << (ESCREVA - 18)) | (1L << (SE - 18)) | (1L << (CASO - 18)) | (1L << (PARA - 18)) | (1L << (FACA - 18)) | (1L << (ENQUANTO - 18)) | (1L << (IDENT - 18)))) != 0)) {
				{
				{
				setState(260);
				cmd();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CmdContext extends ParserRuleContext {
		public CmdleiaContext cmdleia() {
			return getRuleContext(CmdleiaContext.class,0);
		}
		public CmdescrevaContext cmdescreva() {
			return getRuleContext(CmdescrevaContext.class,0);
		}
		public CmdseContext cmdse() {
			return getRuleContext(CmdseContext.class,0);
		}
		public CmdcasoContext cmdcaso() {
			return getRuleContext(CmdcasoContext.class,0);
		}
		public CmdparaContext cmdpara() {
			return getRuleContext(CmdparaContext.class,0);
		}
		public CmdenquantoContext cmdenquanto() {
			return getRuleContext(CmdenquantoContext.class,0);
		}
		public CmdfacaContext cmdfaca() {
			return getRuleContext(CmdfacaContext.class,0);
		}
		public CmdatribuicaoContext cmdatribuicao() {
			return getRuleContext(CmdatribuicaoContext.class,0);
		}
		public CmdchamadaContext cmdchamada() {
			return getRuleContext(CmdchamadaContext.class,0);
		}
		public CmdretorneContext cmdretorne() {
			return getRuleContext(CmdretorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmd);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				cmdleia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				cmdescreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				cmdse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				cmdcaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				cmdpara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				cmdenquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(272);
				cmdfaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(273);
				cmdatribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(274);
				cmdchamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(275);
				cmdretorne();
				}
				break;
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

	public static class CmdleiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(LingAParser.LEIA, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<TerminalNode> PONTEIRO() { return getTokens(LingAParser.PONTEIRO); }
		public TerminalNode PONTEIRO(int i) {
			return getToken(LingAParser.PONTEIRO, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LingAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LingAParser.VIRGULA, i);
		}
		public CmdleiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCmdleia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCmdleia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCmdleia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdleiaContext cmdleia() throws RecognitionException {
		CmdleiaContext _localctx = new CmdleiaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdleia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LEIA);
			setState(279);
			match(T__3);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(280);
				match(PONTEIRO);
				}
			}

			setState(283);
			identificador();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(284);
				match(VIRGULA);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(285);
					match(PONTEIRO);
					}
				}

				setState(288);
				identificador();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(T__4);
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

	public static class CmdescrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(LingAParser.ESCREVA, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LingAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LingAParser.VIRGULA, i);
		}
		public CmdescrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCmdescreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCmdescreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCmdescreva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdescrevaContext cmdescreva() throws RecognitionException {
		CmdescrevaContext _localctx = new CmdescrevaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdescreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ESCREVA);
			setState(297);
			match(T__3);
			setState(298);
			expressao();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(299);
				match(VIRGULA);
				setState(300);
				expressao();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(T__4);
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

	public static class CmdseContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(LingAParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(LingAParser.ENTAO, 0); }
		public TerminalNode FIM_SE() { return getToken(LingAParser.FIM_SE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(LingAParser.SENAO, 0); }
		public CmdseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCmdse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCmdse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCmdse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdseContext cmdse() throws RecognitionException {
		CmdseContext _localctx = new CmdseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(SE);
			setState(309);
			expressao();
			setState(310);
			match(ENTAO);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (PONTEIRO - 18)) | (1L << (RETORNE - 18)) | (1L << (LEIA - 18)) | (1L << (ESCREVA - 18)) | (1L << (SE - 18)) | (1L << (CASO - 18)) | (1L << (PARA - 18)) | (1L << (FACA - 18)) | (1L << (ENQUANTO - 18)) | (1L << (IDENT - 18)))) != 0)) {
				{
				{
				setState(311);
				cmd();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(317);
				match(SENAO);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (PONTEIRO - 18)) | (1L << (RETORNE - 18)) | (1L << (LEIA - 18)) | (1L << (ESCREVA - 18)) | (1L << (SE - 18)) | (1L << (CASO - 18)) | (1L << (PARA - 18)) | (1L << (FACA - 18)) | (1L << (ENQUANTO - 18)) | (1L << (IDENT - 18)))) != 0)) {
					{
					{
					setState(318);
					cmd();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(326);
			match(FIM_SE);
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

	public static class CmdcasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(LingAParser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(LingAParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(LingAParser.FIM_CASO, 0); }
		public TerminalNode SENAO() { return getToken(LingAParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdcasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdcaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCmdcaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCmdcaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCmdcaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdcasoContext cmdcaso() throws RecognitionException {
		CmdcasoContext _localctx = new CmdcasoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdcaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(CASO);
			setState(329);
			exp_aritmetica();
			setState(330);
			match(SEJA);
			setState(331);
			selecao();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(332);
				match(SENAO);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (PONTEIRO - 18)) | (1L << (RETORNE - 18)) | (1L << (LEIA - 18)) | (1L << (ESCREVA - 18)) | (1L << (SE - 18)) | (1L << (CASO - 18)) | (1L << (PARA - 18)) | (1L << (FACA - 18)) | (1L << (ENQUANTO - 18)) | (1L << (IDENT - 18)))) != 0)) {
					{
					{
					setState(333);
					cmd();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(341);
			match(FIM_CASO);
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

	public static class CmdparaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(LingAParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(LingAParser.IDENT, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(LingAParser.OP_ATRIBUICAO, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(LingAParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(LingAParser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(LingAParser.FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdpara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCmdpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCmdpara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCmdpara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdparaContext cmdpara() throws RecognitionException {
		CmdparaContext _localctx = new CmdparaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(PARA);
			setState(344);
			match(IDENT);
			setState(345);
			match(OP_ATRIBUICAO);
			setState(346);
			exp_aritmetica();
			setState(347);
			match(ATE);
			setState(348);
			exp_aritmetica();
			setState(349);
			match(FACA);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (PONTEIRO - 18)) | (1L << (RETORNE - 18)) | (1L << (LEIA - 18)) | (1L << (ESCREVA - 18)) | (1L << (SE - 18)) | (1L << (CASO - 18)) | (1L << (PARA - 18)) | (1L << (FACA - 18)) | (1L << (ENQUANTO - 18)) | (1L << (IDENT - 18)))) != 0)) {
				{
				{
				setState(350);
				cmd();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(FIM_PARA);
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

	public static class CmdenquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(LingAParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(LingAParser.FACA, 0); }
		public TerminalNode FIM_ENQUANTO() { return getToken(LingAParser.FIM_ENQUANTO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdenquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdenquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCmdenquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCmdenquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCmdenquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdenquantoContext cmdenquanto() throws RecognitionException {
		CmdenquantoContext _localctx = new CmdenquantoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdenquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(ENQUANTO);
			setState(359);
			expressao();
			setState(360);
			match(FACA);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (PONTEIRO - 18)) | (1L << (RETORNE - 18)) | (1L << (LEIA - 18)) | (1L << (ESCREVA - 18)) | (1L << (SE - 18)) | (1L << (CASO - 18)) | (1L << (PARA - 18)) | (1L << (FACA - 18)) | (1L << (ENQUANTO - 18)) | (1L << (IDENT - 18)))) != 0)) {
				{
				{
				setState(361);
				cmd();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(FIM_ENQUANTO);
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

	public static class CmdfacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(LingAParser.FACA, 0); }
		public TerminalNode ATE() { return getToken(LingAParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdfacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdfaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCmdfaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCmdfaca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCmdfaca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdfacaContext cmdfaca() throws RecognitionException {
		CmdfacaContext _localctx = new CmdfacaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdfaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(FACA);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (PONTEIRO - 18)) | (1L << (RETORNE - 18)) | (1L << (LEIA - 18)) | (1L << (ESCREVA - 18)) | (1L << (SE - 18)) | (1L << (CASO - 18)) | (1L << (PARA - 18)) | (1L << (FACA - 18)) | (1L << (ENQUANTO - 18)) | (1L << (IDENT - 18)))) != 0)) {
				{
				{
				setState(370);
				cmd();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(ATE);
			setState(377);
			expressao();
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

	public static class CmdatribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode OP_ATRIBUICAO() { return getToken(LingAParser.OP_ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(LingAParser.PONTEIRO, 0); }
		public CmdatribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdatribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCmdatribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCmdatribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCmdatribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdatribuicaoContext cmdatribuicao() throws RecognitionException {
		CmdatribuicaoContext _localctx = new CmdatribuicaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdatribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(379);
				match(PONTEIRO);
				}
			}

			setState(382);
			identificador();
			setState(383);
			match(OP_ATRIBUICAO);
			setState(384);
			expressao();
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

	public static class CmdchamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LingAParser.IDENT, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LingAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LingAParser.VIRGULA, i);
		}
		public CmdchamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdchamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCmdchamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCmdchamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCmdchamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdchamadaContext cmdchamada() throws RecognitionException {
		CmdchamadaContext _localctx = new CmdchamadaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdchamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(IDENT);
			setState(387);
			match(T__3);
			setState(388);
			expressao();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(389);
				match(VIRGULA);
				setState(390);
				expressao();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(T__4);
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

	public static class CmdretorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(LingAParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdretorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdretorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterCmdretorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitCmdretorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitCmdretorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdretorneContext cmdretorne() throws RecognitionException {
		CmdretorneContext _localctx = new CmdretorneContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmdretorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(RETORNE);
			setState(399);
			expressao();
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

	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==NUM_INT) {
				{
				{
				setState(401);
				item_selecao();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(LingAParser.DELIM, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitItem_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitItem_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			constantes();
			setState(408);
			match(DELIM);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (PONTEIRO - 18)) | (1L << (RETORNE - 18)) | (1L << (LEIA - 18)) | (1L << (ESCREVA - 18)) | (1L << (SE - 18)) | (1L << (CASO - 18)) | (1L << (PARA - 18)) | (1L << (FACA - 18)) | (1L << (ENQUANTO - 18)) | (1L << (IDENT - 18)))) != 0)) {
				{
				{
				setState(409);
				cmd();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LingAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LingAParser.VIRGULA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			numero_intervalo();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(416);
				match(VIRGULA);
				setState(417);
				numero_intervalo();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(LingAParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(LingAParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode PONTOPONTO() { return getToken(LingAParser.PONTOPONTO, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(423);
				op_unario();
				}
			}

			setState(426);
			match(NUM_INT);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTOPONTO) {
				{
				setState(427);
				match(PONTOPONTO);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(428);
					op_unario();
					}
				}

				setState(431);
				match(NUM_INT);
				}
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

	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(LingAParser.SUB, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitOp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitOp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(SUB);
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

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitExp_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitExp_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			termo();
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(437);
					op1();
					setState(438);
					termo();
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			fator();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(446);
				op2();
				setState(447);
				fator();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			parcela();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(455);
				op3();
				setState(456);
				parcela();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Op1Context extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(LingAParser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(LingAParser.SUB, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUB) ) {
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

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(LingAParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LingAParser.DIV, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
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

	public static class Op3Context extends ParserRuleContext {
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(T__6);
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

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parcela);
		int _la;
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case PONTEIRO:
			case SUB:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(469);
					op_unario();
					}
				}

				setState(472);
				parcela_unario();
				}
				break;
			case T__7:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				parcela_nao_unario();
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

	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(LingAParser.PONTEIRO, 0); }
		public TerminalNode IDENT() { return getToken(LingAParser.IDENT, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LingAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LingAParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(LingAParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LingAParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitParcela_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitParcela_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parcela_unario);
		int _la;
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(476);
					match(PONTEIRO);
					}
				}

				setState(479);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(IDENT);
				setState(481);
				match(T__3);
				setState(482);
				expressao();
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(483);
					match(VIRGULA);
					setState(484);
					expressao();
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(490);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				match(T__3);
				setState(495);
				expressao();
				setState(496);
				match(T__4);
				}
				break;
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LingAParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitParcela_nao_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitParcela_nao_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parcela_nao_unario);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(T__7);
				setState(501);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(CADEIA);
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

	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitExp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitExp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			exp_aritmetica();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIFERENTE) | (1L << MAIOR) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MENOR_IGUAL))) != 0)) {
				{
				setState(506);
				op_relacional();
				setState(507);
				exp_aritmetica();
				}
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(LingAParser.MAIOR, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(LingAParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(LingAParser.MENOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(LingAParser.MENOR_IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(LingAParser.DIFERENTE, 0); }
		public TerminalNode IGUAL() { return getToken(LingAParser.IGUAL, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIFERENTE) | (1L << MAIOR) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MENOR_IGUAL))) != 0)) ) {
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

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			termo_logico();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(514);
				op_logico_1();
				setState(515);
				termo_logico();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			fator_logico();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(523);
				op_logico_2();
				setState(524);
				fator_logico();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode NEGACAO() { return getToken(LingAParser.NEGACAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGACAO) {
				{
				setState(531);
				match(NEGACAO);
				}
			}

			setState(534);
			parcela_logica();
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

	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(LingAParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(LingAParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_logica);
		int _la;
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				_la = _input.LA(1);
				if ( !(_la==VERDADEIRO || _la==FALSO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__3:
			case T__7:
			case PONTEIRO:
			case SUB:
			case NUM_INT:
			case NUM_REAL:
			case CADEIA:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				exp_relacional();
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

	public static class Op_logico_1Context extends ParserRuleContext {
		public TerminalNode OU() { return getToken(LingAParser.OU, 0); }
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterOp_logico_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitOp_logico_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitOp_logico_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(OU);
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

	public static class Op_logico_2Context extends ParserRuleContext {
		public TerminalNode E() { return getToken(LingAParser.E, 0); }
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).enterOp_logico_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LingAListener ) ((LingAListener)listener).exitOp_logico_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LingAVisitor ) return ((LingAVisitor<? extends T>)visitor).visitOp_logico_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(E);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0223\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\7\3n\n\3\f\3\16\3q\13\3\3\4\3\4\5\4u\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0084\n\5\3\6\3\6\3\6"+
		"\7\6\u0089\n\6\f\6\16\6\u008c\13\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0094\n"+
		"\7\f\7\16\7\u0097\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u009f\n\b\f\b\16\b"+
		"\u00a2\13\b\3\t\3\t\5\t\u00a6\n\t\3\n\3\n\3\13\3\13\5\13\u00ac\n\13\3"+
		"\f\5\f\u00af\n\f\3\f\3\f\3\r\3\r\3\16\3\16\7\16\u00b7\n\16\f\16\16\16"+
		"\u00ba\13\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00c2\n\17\3\17\3\17\7"+
		"\17\u00c6\n\17\f\17\16\17\u00c9\13\17\3\17\7\17\u00cc\n\17\f\17\16\17"+
		"\u00cf\13\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d6\n\17\3\17\3\17\3\17\3"+
		"\17\7\17\u00dc\n\17\f\17\16\17\u00df\13\17\3\17\7\17\u00e2\n\17\f\17\16"+
		"\17\u00e5\13\17\3\17\3\17\5\17\u00e9\n\17\3\20\5\20\u00ec\n\20\3\20\3"+
		"\20\3\20\7\20\u00f1\n\20\f\20\16\20\u00f4\13\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\7\21\u00fc\n\21\f\21\16\21\u00ff\13\21\3\22\7\22\u0102\n\22\f"+
		"\22\16\22\u0105\13\22\3\22\7\22\u0108\n\22\f\22\16\22\u010b\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0117\n\23\3\24\3\24"+
		"\3\24\5\24\u011c\n\24\3\24\3\24\3\24\5\24\u0121\n\24\3\24\7\24\u0124\n"+
		"\24\f\24\16\24\u0127\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0130"+
		"\n\25\f\25\16\25\u0133\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u013b"+
		"\n\26\f\26\16\26\u013e\13\26\3\26\3\26\7\26\u0142\n\26\f\26\16\26\u0145"+
		"\13\26\5\26\u0147\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0151"+
		"\n\27\f\27\16\27\u0154\13\27\5\27\u0156\n\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u0162\n\30\f\30\16\30\u0165\13\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\7\31\u016d\n\31\f\31\16\31\u0170\13\31\3\31"+
		"\3\31\3\32\3\32\7\32\u0176\n\32\f\32\16\32\u0179\13\32\3\32\3\32\3\32"+
		"\3\33\5\33\u017f\n\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u018a\n\34\f\34\16\34\u018d\13\34\3\34\3\34\3\35\3\35\3\35\3\36\7\36"+
		"\u0195\n\36\f\36\16\36\u0198\13\36\3\37\3\37\3\37\7\37\u019d\n\37\f\37"+
		"\16\37\u01a0\13\37\3 \3 \3 \7 \u01a5\n \f \16 \u01a8\13 \3!\5!\u01ab\n"+
		"!\3!\3!\3!\5!\u01b0\n!\3!\5!\u01b3\n!\3\"\3\"\3#\3#\3#\3#\7#\u01bb\n#"+
		"\f#\16#\u01be\13#\3$\3$\3$\3$\7$\u01c4\n$\f$\16$\u01c7\13$\3%\3%\3%\3"+
		"%\7%\u01cd\n%\f%\16%\u01d0\13%\3&\3&\3\'\3\'\3(\3(\3)\5)\u01d9\n)\3)\3"+
		")\5)\u01dd\n)\3*\5*\u01e0\n*\3*\3*\3*\3*\3*\3*\7*\u01e8\n*\f*\16*\u01eb"+
		"\13*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01f5\n*\3+\3+\3+\5+\u01fa\n+\3,\3,\3"+
		",\3,\5,\u0200\n,\3-\3-\3.\3.\3.\3.\7.\u0208\n.\f.\16.\u020b\13.\3/\3/"+
		"\3/\3/\7/\u0211\n/\f/\16/\u0214\13/\3\60\5\60\u0217\n\60\3\60\3\60\3\61"+
		"\3\61\5\61\u021d\n\61\3\62\3\62\3\63\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\b"+
		"\3\2\25\30\4\2\31\32@B\3\2;<\3\2=>\3\2\65:\3\2\31\32\2\u0235\2f\3\2\2"+
		"\2\4o\3\2\2\2\6t\3\2\2\2\b\u0083\3\2\2\2\n\u0085\3\2\2\2\f\u0090\3\2\2"+
		"\2\16\u00a0\3\2\2\2\20\u00a5\3\2\2\2\22\u00a7\3\2\2\2\24\u00ab\3\2\2\2"+
		"\26\u00ae\3\2\2\2\30\u00b2\3\2\2\2\32\u00b4\3\2\2\2\34\u00e8\3\2\2\2\36"+
		"\u00eb\3\2\2\2 \u00f8\3\2\2\2\"\u0103\3\2\2\2$\u0116\3\2\2\2&\u0118\3"+
		"\2\2\2(\u012a\3\2\2\2*\u0136\3\2\2\2,\u014a\3\2\2\2.\u0159\3\2\2\2\60"+
		"\u0168\3\2\2\2\62\u0173\3\2\2\2\64\u017e\3\2\2\2\66\u0184\3\2\2\28\u0190"+
		"\3\2\2\2:\u0196\3\2\2\2<\u0199\3\2\2\2>\u01a1\3\2\2\2@\u01aa\3\2\2\2B"+
		"\u01b4\3\2\2\2D\u01b6\3\2\2\2F\u01bf\3\2\2\2H\u01c8\3\2\2\2J\u01d1\3\2"+
		"\2\2L\u01d3\3\2\2\2N\u01d5\3\2\2\2P\u01dc\3\2\2\2R\u01f4\3\2\2\2T\u01f9"+
		"\3\2\2\2V\u01fb\3\2\2\2X\u0201\3\2\2\2Z\u0203\3\2\2\2\\\u020c\3\2\2\2"+
		"^\u0216\3\2\2\2`\u021c\3\2\2\2b\u021e\3\2\2\2d\u0220\3\2\2\2fg\5\4\3\2"+
		"gh\7\13\2\2hi\5\"\22\2ij\7\3\2\2jk\7\2\2\3k\3\3\2\2\2ln\5\6\4\2ml\3\2"+
		"\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\5\3\2\2\2qo\3\2\2\2ru\5\b\5\2su\5"+
		"\34\17\2tr\3\2\2\2ts\3\2\2\2u\7\3\2\2\2vw\7\r\2\2w\u0084\5\n\6\2xy\7\22"+
		"\2\2yz\7E\2\2z{\7\16\2\2{|\5\22\n\2|}\7\65\2\2}~\5\30\r\2~\u0084\3\2\2"+
		"\2\177\u0080\7\23\2\2\u0080\u0081\7E\2\2\u0081\u0082\7\16\2\2\u0082\u0084"+
		"\5\20\t\2\u0083v\3\2\2\2\u0083x\3\2\2\2\u0083\177\3\2\2\2\u0084\t\3\2"+
		"\2\2\u0085\u008a\5\f\7\2\u0086\u0087\7\17\2\2\u0087\u0089\5\f\7\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\16\2\2\u008e"+
		"\u008f\5\20\t\2\u008f\13\3\2\2\2\u0090\u0095\7E\2\2\u0091\u0092\7\20\2"+
		"\2\u0092\u0094\7E\2\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\5\16\b\2\u0099\r\3\2\2\2\u009a\u009b\7\4\2\2\u009b\u009c\5D#\2"+
		"\u009c\u009d\7\5\2\2\u009d\u009f\3\2\2\2\u009e\u009a\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\17\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a6\5\32\16\2\u00a4\u00a6\5\26\f\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\21\3\2\2\2\u00a7\u00a8\t\2\2\2\u00a8"+
		"\23\3\2\2\2\u00a9\u00ac\5\22\n\2\u00aa\u00ac\7E\2\2\u00ab\u00a9\3\2\2"+
		"\2\u00ab\u00aa\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00af\7\24\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5\24\13\2"+
		"\u00b1\27\3\2\2\2\u00b2\u00b3\t\3\2\2\u00b3\31\3\2\2\2\u00b4\u00b8\7\33"+
		"\2\2\u00b5\u00b7\5\n\6\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00bc\7\34\2\2\u00bc\33\3\2\2\2\u00bd\u00be\7\35\2\2\u00be"+
		"\u00bf\7E\2\2\u00bf\u00c1\7\6\2\2\u00c0\u00c2\5 \21\2\u00c1\u00c0\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c7\7\7\2\2\u00c4"+
		"\u00c6\5\b\5\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cd\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cc\5$\23\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00e9\7\36\2\2\u00d1\u00d2\7\37\2\2\u00d2\u00d3\7E\2\2\u00d3\u00d5\7"+
		"\6\2\2\u00d4\u00d6\5 \21\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\7\7\2\2\u00d8\u00d9\7\16\2\2\u00d9\u00dd\5"+
		"\26\f\2\u00da\u00dc\5\b\5\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e3\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00e0\u00e2\5$\23\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e7\7\"\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00bd\3\2\2\2\u00e8"+
		"\u00d1\3\2\2\2\u00e9\35\3\2\2\2\u00ea\u00ec\7\b\2\2\u00eb\u00ea\3\2\2"+
		"\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f2\5\f\7\2\u00ee\u00ef"+
		"\7\17\2\2\u00ef\u00f1\5\f\7\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f6\7\16\2\2\u00f6\u00f7\5\26\f\2\u00f7\37\3\2\2\2\u00f8"+
		"\u00fd\5\36\20\2\u00f9\u00fa\7\17\2\2\u00fa\u00fc\5\36\20\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"!\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\5\b\5\2\u0101\u0100\3\2\2\2"+
		"\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0109"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\5$\23\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a#\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010c\u0117\5&\24\2\u010d\u0117\5(\25\2\u010e\u0117"+
		"\5*\26\2\u010f\u0117\5,\27\2\u0110\u0117\5.\30\2\u0111\u0117\5\60\31\2"+
		"\u0112\u0117\5\62\32\2\u0113\u0117\5\64\33\2\u0114\u0117\5\66\34\2\u0115"+
		"\u0117\58\35\2\u0116\u010c\3\2\2\2\u0116\u010d\3\2\2\2\u0116\u010e\3\2"+
		"\2\2\u0116\u010f\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0111\3\2\2\2\u0116"+
		"\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2"+
		"\2\2\u0117%\3\2\2\2\u0118\u0119\7#\2\2\u0119\u011b\7\6\2\2\u011a\u011c"+
		"\7\24\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2"+
		"\u011d\u0125\5\f\7\2\u011e\u0120\7\17\2\2\u011f\u0121\7\24\2\2\u0120\u011f"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\5\f\7\2\u0123"+
		"\u011e\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\7\2\2\u0129"+
		"\'\3\2\2\2\u012a\u012b\7$\2\2\u012b\u012c\7\6\2\2\u012c\u0131\5Z.\2\u012d"+
		"\u012e\7\17\2\2\u012e\u0130\5Z.\2\u012f\u012d\3\2\2\2\u0130\u0133\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\7\7\2\2\u0135)\3\2\2\2\u0136\u0137\7%\2\2\u0137"+
		"\u0138\5Z.\2\u0138\u013c\7&\2\2\u0139\u013b\5$\23\2\u013a\u0139\3\2\2"+
		"\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0146"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0143\7\'\2\2\u0140\u0142\5$\23\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u013f\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7(\2\2\u0149+\3\2\2\2\u014a"+
		"\u014b\7)\2\2\u014b\u014c\5D#\2\u014c\u014d\7*\2\2\u014d\u0155\5:\36\2"+
		"\u014e\u0152\7\'\2\2\u014f\u0151\5$\23\2\u0150\u014f\3\2\2\2\u0151\u0154"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u014e\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0158\7+\2\2\u0158-\3\2\2\2\u0159\u015a\7,\2\2\u015a\u015b"+
		"\7E\2\2\u015b\u015c\7?\2\2\u015c\u015d\5D#\2\u015d\u015e\7-\2\2\u015e"+
		"\u015f\5D#\2\u015f\u0163\7.\2\2\u0160\u0162\5$\23\2\u0161\u0160\3\2\2"+
		"\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7/\2\2\u0167/\3\2\2\2\u0168\u0169"+
		"\7\60\2\2\u0169\u016a\5Z.\2\u016a\u016e\7.\2\2\u016b\u016d\5$\23\2\u016c"+
		"\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7\61\2\2\u0172"+
		"\61\3\2\2\2\u0173\u0177\7.\2\2\u0174\u0176\5$\23\2\u0175\u0174\3\2\2\2"+
		"\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7-\2\2\u017b\u017c\5Z.\2\u017c"+
		"\63\3\2\2\2\u017d\u017f\7\24\2\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2"+
		"\2\u017f\u0180\3\2\2\2\u0180\u0181\5\f\7\2\u0181\u0182\7?\2\2\u0182\u0183"+
		"\5Z.\2\u0183\65\3\2\2\2\u0184\u0185\7E\2\2\u0185\u0186\7\6\2\2\u0186\u018b"+
		"\5Z.\2\u0187\u0188\7\17\2\2\u0188\u018a\5Z.\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\7\2\2\u018f\67\3\2\2\2\u0190\u0191"+
		"\7!\2\2\u0191\u0192\5Z.\2\u01929\3\2\2\2\u0193\u0195\5<\37\2\u0194\u0193"+
		"\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		";\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\5> \2\u019a\u019e\7\16\2\2\u019b"+
		"\u019d\5$\23\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f=\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a6"+
		"\5@!\2\u01a2\u01a3\7\17\2\2\u01a3\u01a5\5@!\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7?\3\2\2\2"+
		"\u01a8\u01a6\3\2\2\2\u01a9\u01ab\5B\"\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b2\7@\2\2\u01ad\u01af\7\21\2\2\u01ae"+
		"\u01b0\5B\"\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b3\7@\2\2\u01b2\u01ad\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"A\3\2\2\2\u01b4\u01b5\7<\2\2\u01b5C\3\2\2\2\u01b6\u01bc\5F$\2\u01b7\u01b8"+
		"\5J&\2\u01b8\u01b9\5F$\2\u01b9\u01bb\3\2\2\2\u01ba\u01b7\3\2\2\2\u01bb"+
		"\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bdE\3\2\2\2"+
		"\u01be\u01bc\3\2\2\2\u01bf\u01c5\5H%\2\u01c0\u01c1\5L\'\2\u01c1\u01c2"+
		"\5H%\2\u01c2\u01c4\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6G\3\2\2\2\u01c7\u01c5\3\2\2\2"+
		"\u01c8\u01ce\5P)\2\u01c9\u01ca\5N(\2\u01ca\u01cb\5P)\2\u01cb\u01cd\3\2"+
		"\2\2\u01cc\u01c9\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cfI\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\t\4\2\2"+
		"\u01d2K\3\2\2\2\u01d3\u01d4\t\5\2\2\u01d4M\3\2\2\2\u01d5\u01d6\7\t\2\2"+
		"\u01d6O\3\2\2\2\u01d7\u01d9\5B\"\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u01dd\5R*\2\u01db\u01dd\5T+\2\u01dc\u01d8"+
		"\3\2\2\2\u01dc\u01db\3\2\2\2\u01ddQ\3\2\2\2\u01de\u01e0\7\24\2\2\u01df"+
		"\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01f5\5\f"+
		"\7\2\u01e2\u01e3\7E\2\2\u01e3\u01e4\7\6\2\2\u01e4\u01e9\5Z.\2\u01e5\u01e6"+
		"\7\17\2\2\u01e6\u01e8\5Z.\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01ec\u01ed\7\7\2\2\u01ed\u01f5\3\2\2\2\u01ee\u01f5\7@\2\2\u01ef"+
		"\u01f5\7A\2\2\u01f0\u01f1\7\6\2\2\u01f1\u01f2\5Z.\2\u01f2\u01f3\7\7\2"+
		"\2\u01f3\u01f5\3\2\2\2\u01f4\u01df\3\2\2\2\u01f4\u01e2\3\2\2\2\u01f4\u01ee"+
		"\3\2\2\2\u01f4\u01ef\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f5S\3\2\2\2\u01f6"+
		"\u01f7\7\n\2\2\u01f7\u01fa\5\f\7\2\u01f8\u01fa\7B\2\2\u01f9\u01f6\3\2"+
		"\2\2\u01f9\u01f8\3\2\2\2\u01faU\3\2\2\2\u01fb\u01ff\5D#\2\u01fc\u01fd"+
		"\5X-\2\u01fd\u01fe\5D#\2\u01fe\u0200\3\2\2\2\u01ff\u01fc\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200W\3\2\2\2\u0201\u0202\t\6\2\2\u0202Y\3\2\2\2\u0203"+
		"\u0209\5\\/\2\u0204\u0205\5b\62\2\u0205\u0206\5\\/\2\u0206\u0208\3\2\2"+
		"\2\u0207\u0204\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a"+
		"\3\2\2\2\u020a[\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u0212\5^\60\2\u020d"+
		"\u020e\5d\63\2\u020e\u020f\5^\60\2\u020f\u0211\3\2\2\2\u0210\u020d\3\2"+
		"\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"]\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0217\7\64\2\2\u0216\u0215\3\2\2\2"+
		"\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\5`\61\2\u0219_\3"+
		"\2\2\2\u021a\u021d\t\7\2\2\u021b\u021d\5V,\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021b\3\2\2\2\u021da\3\2\2\2\u021e\u021f\7\63\2\2\u021fc\3\2\2\2\u0220"+
		"\u0221\7\62\2\2\u0221e\3\2\2\2;ot\u0083\u008a\u0095\u00a0\u00a5\u00ab"+
		"\u00ae\u00b8\u00c1\u00c7\u00cd\u00d5\u00dd\u00e3\u00e8\u00eb\u00f2\u00fd"+
		"\u0103\u0109\u0116\u011b\u0120\u0125\u0131\u013c\u0143\u0146\u0152\u0155"+
		"\u0163\u016e\u0177\u017e\u018b\u0196\u019e\u01a6\u01aa\u01af\u01b2\u01bc"+
		"\u01c5\u01ce\u01d8\u01dc\u01df\u01e9\u01f4\u01f9\u01ff\u0209\u0212\u0216"+
		"\u021c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}