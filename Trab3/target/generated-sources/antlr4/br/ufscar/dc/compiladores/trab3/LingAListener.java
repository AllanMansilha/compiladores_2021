// Generated from br/ufscar/dc/compiladores/trab3/LingA.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trab3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LingAParser}.
 */
public interface LingAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LingAParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LingAParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LingAParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(LingAParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(LingAParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(LingAParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(LingAParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(LingAParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(LingAParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(LingAParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(LingAParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(LingAParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(LingAParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(LingAParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(LingAParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LingAParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LingAParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(LingAParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(LingAParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(LingAParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(LingAParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(LingAParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(LingAParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(LingAParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(LingAParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(LingAParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(LingAParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(LingAParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(LingAParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(LingAParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(LingAParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(LingAParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(LingAParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(LingAParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(LingAParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LingAParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LingAParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#cmdleia}.
	 * @param ctx the parse tree
	 */
	void enterCmdleia(LingAParser.CmdleiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#cmdleia}.
	 * @param ctx the parse tree
	 */
	void exitCmdleia(LingAParser.CmdleiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#cmdescreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdescreva(LingAParser.CmdescrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#cmdescreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdescreva(LingAParser.CmdescrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#cmdse}.
	 * @param ctx the parse tree
	 */
	void enterCmdse(LingAParser.CmdseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#cmdse}.
	 * @param ctx the parse tree
	 */
	void exitCmdse(LingAParser.CmdseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#cmdcaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdcaso(LingAParser.CmdcasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#cmdcaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdcaso(LingAParser.CmdcasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#cmdpara}.
	 * @param ctx the parse tree
	 */
	void enterCmdpara(LingAParser.CmdparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#cmdpara}.
	 * @param ctx the parse tree
	 */
	void exitCmdpara(LingAParser.CmdparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#cmdenquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdenquanto(LingAParser.CmdenquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#cmdenquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdenquanto(LingAParser.CmdenquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#cmdfaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdfaca(LingAParser.CmdfacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#cmdfaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdfaca(LingAParser.CmdfacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#cmdatribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdatribuicao(LingAParser.CmdatribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#cmdatribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdatribuicao(LingAParser.CmdatribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#cmdchamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdchamada(LingAParser.CmdchamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#cmdchamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdchamada(LingAParser.CmdchamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#cmdretorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdretorne(LingAParser.CmdretorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#cmdretorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdretorne(LingAParser.CmdretorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(LingAParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(LingAParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(LingAParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(LingAParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(LingAParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(LingAParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(LingAParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(LingAParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(LingAParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(LingAParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(LingAParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(LingAParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(LingAParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(LingAParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(LingAParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(LingAParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(LingAParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(LingAParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(LingAParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(LingAParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(LingAParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(LingAParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(LingAParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(LingAParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(LingAParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(LingAParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(LingAParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(LingAParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(LingAParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(LingAParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(LingAParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(LingAParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LingAParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LingAParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(LingAParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(LingAParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(LingAParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(LingAParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(LingAParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(LingAParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(LingAParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(LingAParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LingAParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(LingAParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LingAParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(LingAParser.Op_logico_2Context ctx);
}