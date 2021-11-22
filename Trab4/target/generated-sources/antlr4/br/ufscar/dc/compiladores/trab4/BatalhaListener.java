// Generated from br/ufscar/dc/compiladores/trab4/Batalha.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trab4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BatalhaParser}.
 */
public interface BatalhaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(BatalhaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(BatalhaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(BatalhaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(BatalhaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#declaracao_equipe}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_equipe(BatalhaParser.Declaracao_equipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#declaracao_equipe}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_equipe(BatalhaParser.Declaracao_equipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#declaracao_selvagem}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_selvagem(BatalhaParser.Declaracao_selvagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#declaracao_selvagem}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_selvagem(BatalhaParser.Declaracao_selvagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterAcao(BatalhaParser.AcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitAcao(BatalhaParser.AcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#cmdLutar}.
	 * @param ctx the parse tree
	 */
	void enterCmdLutar(BatalhaParser.CmdLutarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#cmdLutar}.
	 * @param ctx the parse tree
	 */
	void exitCmdLutar(BatalhaParser.CmdLutarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#cmdTrocar}.
	 * @param ctx the parse tree
	 */
	void enterCmdTrocar(BatalhaParser.CmdTrocarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#cmdTrocar}.
	 * @param ctx the parse tree
	 */
	void exitCmdTrocar(BatalhaParser.CmdTrocarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#cmdFugir}.
	 * @param ctx the parse tree
	 */
	void enterCmdFugir(BatalhaParser.CmdFugirContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#cmdFugir}.
	 * @param ctx the parse tree
	 */
	void exitCmdFugir(BatalhaParser.CmdFugirContext ctx);
}