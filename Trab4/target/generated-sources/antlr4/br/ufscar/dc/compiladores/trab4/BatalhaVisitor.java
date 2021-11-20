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
	 * Visit a parse tree produced by {@link BatalhaParser#lista_batalha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_batalha(BatalhaParser.Lista_batalhaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#lista_pokemon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_pokemon(BatalhaParser.Lista_pokemonContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#lista_selvagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_selvagem(BatalhaParser.Lista_selvagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#mensagem_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMensagem_final(BatalhaParser.Mensagem_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(BatalhaParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(BatalhaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcao(BatalhaParser.AcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(BatalhaParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#nivel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNivel(BatalhaParser.NivelContext ctx);
	/**
	 * Visit a parse tree produced by {@link BatalhaParser#vida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVida(BatalhaParser.VidaContext ctx);
}