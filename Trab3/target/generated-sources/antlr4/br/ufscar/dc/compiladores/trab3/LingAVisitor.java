// Generated from br/ufscar/dc/compiladores/trab3/LingA.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trab3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LingAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LingAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LingAParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LingAParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(LingAParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(LingAParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(LingAParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(LingAParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(LingAParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(LingAParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LingAParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(LingAParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(LingAParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(LingAParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(LingAParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(LingAParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(LingAParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(LingAParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(LingAParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(LingAParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(LingAParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#cmdleia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdleia(LingAParser.CmdleiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#cmdescreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdescreva(LingAParser.CmdescrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#cmdse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdse(LingAParser.CmdseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#cmdcaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdcaso(LingAParser.CmdcasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#cmdpara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdpara(LingAParser.CmdparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#cmdenquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdenquanto(LingAParser.CmdenquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#cmdfaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdfaca(LingAParser.CmdfacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#cmdatribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdatribuicao(LingAParser.CmdatribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#cmdchamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdchamada(LingAParser.CmdchamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#cmdretorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdretorne(LingAParser.CmdretorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(LingAParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(LingAParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(LingAParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(LingAParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(LingAParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(LingAParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(LingAParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(LingAParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(LingAParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(LingAParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(LingAParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(LingAParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(LingAParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(LingAParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(LingAParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(LingAParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(LingAParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(LingAParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(LingAParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(LingAParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(LingAParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link LingAParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(LingAParser.Op_logico_2Context ctx);
}