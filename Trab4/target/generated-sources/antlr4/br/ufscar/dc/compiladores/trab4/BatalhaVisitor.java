// Generated from br/ufscar/dc/compiladores/trab4/Batalha.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trab4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BatalhaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BatalhaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(BatalhaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(BatalhaParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#declaracao_equipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_equipe(BatalhaParser.Declaracao_equipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#declaracao_selvagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_selvagem(BatalhaParser.Declaracao_selvagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcao(BatalhaParser.AcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#cmdLutar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLutar(BatalhaParser.CmdLutarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#cmdTrocar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdTrocar(BatalhaParser.CmdTrocarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#cmdFugir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFugir(BatalhaParser.CmdFugirContext ctx);
}