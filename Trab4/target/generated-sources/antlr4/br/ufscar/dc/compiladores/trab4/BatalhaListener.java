// Generated from br/ufscar/dc/compiladores/trab4/Batalha.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trab4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BatalhaParser}.
 */
public interface BatalhaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#lista_batalha}.
	 * @param ctx the parse tree
	 */
	void enterLista_batalha(BatalhaParser.Lista_batalhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#lista_batalha}.
	 * @param ctx the parse tree
	 */
	void exitLista_batalha(BatalhaParser.Lista_batalhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#lista_pokemon}.
	 * @param ctx the parse tree
	 */
	void enterLista_pokemon(BatalhaParser.Lista_pokemonContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#lista_pokemon}.
	 * @param ctx the parse tree
	 */
	void exitLista_pokemon(BatalhaParser.Lista_pokemonContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#lista_selvagem}.
	 * @param ctx the parse tree
	 */
	void enterLista_selvagem(BatalhaParser.Lista_selvagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#lista_selvagem}.
	 * @param ctx the parse tree
	 */
	void exitLista_selvagem(BatalhaParser.Lista_selvagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#mensagem_final}.
	 * @param ctx the parse tree
	 */
	void enterMensagem_final(BatalhaParser.Mensagem_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#mensagem_final}.
	 * @param ctx the parse tree
	 */
	void exitMensagem_final(BatalhaParser.Mensagem_finalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(BatalhaParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(BatalhaParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(BatalhaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(BatalhaParser.TipoContext ctx);
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
	 * Enter a parse tree produced by {@link BatalhaParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(BatalhaParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(BatalhaParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#nivel}.
	 * @param ctx the parse tree
	 */
	void enterNivel(BatalhaParser.NivelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#nivel}.
	 * @param ctx the parse tree
	 */
	void exitNivel(BatalhaParser.NivelContext ctx);
	/**
	 * Enter a parse tree produced by {@link BatalhaParser#vida}.
	 * @param ctx the parse tree
	 */
	void enterVida(BatalhaParser.VidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BatalhaParser#vida}.
	 * @param ctx the parse tree
	 */
	void exitVida(BatalhaParser.VidaContext ctx);
}