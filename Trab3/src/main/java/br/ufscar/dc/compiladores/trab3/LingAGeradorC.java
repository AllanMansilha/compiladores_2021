package br.ufscar.dc.compiladores.trab3;

import br.ufscar.dc.compiladores.trab3.TabelaDeSimbolos.TipoLingA;

public class LingAGeradorC extends LingABaseVisitor<Void>{

    StringBuilder saida;
    TabelaDeSimbolos tabela;

    public LingAGeradorC() {
        saida = new StringBuilder();
        this.tabela = new TabelaDeSimbolos();
    }

    @Override
    public Void visitPrograma(LingAParser.ProgramaContext ctx) {
        saida.append("#include <stdio.h>\n");
        saida.append("#include <stdlib.h>\n");
        saida.append("\n");
        visitDeclaracoes(ctx.declaracoes());

        saida.append("\n");
        saida.append("int main() {\n");
        visitCorpo(ctx.corpo());
        saida.append("\nreturn 0;\n");
        saida.append("}\n");
        return null;
    }
    
    @Override
    public Void visitDeclaracoes(LingAParser.DeclaracoesContext ctx){
        
        for(LingAParser.Decl_local_globalContext c : ctx.decl_local_global()){
            visitDecl_local_global(c);
        }
        
        return null;
    }
    
    @Override
    public Void visitDecl_local_global(LingAParser.Decl_local_globalContext ctx){
        
        if(ctx.declaracao_global()!=null){
            visitDeclaracao_global(ctx.declaracao_global());
        }else{
            visitDeclaracao_local(ctx.declaracao_local());
        }
        return null;
    }
    
    @Override
    public Void visitDeclaracao_local(LingAParser.Declaracao_localContext ctx) {
        String nomeVar = null;
        String strTipoVar = ctx.variavel().tipo().getText();
        TabelaDeSimbolos.TipoLingA tipoVar = TabelaDeSimbolos.TipoLingA.INVALIDO;
        switch (strTipoVar) {
            case "inteiro":
                tipoVar = TabelaDeSimbolos.TipoLingA.INTEIRO;
                strTipoVar = "int";
                break;
            case "real":
                tipoVar = TabelaDeSimbolos.TipoLingA.REAL;
                strTipoVar = "float";
                break;
            case "literal":
                tipoVar = TabelaDeSimbolos.TipoLingA.LITERAL;
                strTipoVar = "char";
                break;
            case "^literal":
                tipoVar = TabelaDeSimbolos.TipoLingA.LITERAL;
                strTipoVar = "char*";
                break;
            case "^inteiro":
                tipoVar = TabelaDeSimbolos.TipoLingA.INTEIRO;
                strTipoVar = "int*";
                break;
            case "^real":
                tipoVar = TabelaDeSimbolos.TipoLingA.REAL;
                strTipoVar = "float*";
                break;
            case "logico":
                tipoVar = TabelaDeSimbolos.TipoLingA.REAL;
                strTipoVar = "int";
                break;
            case "^logico":
                tipoVar = TabelaDeSimbolos.TipoLingA.REAL;
                strTipoVar = "int*";
                break;
            case "registro":
                tipoVar = TabelaDeSimbolos.TipoLingA.REGISTRO;
                strTipoVar = "struct ";
            default:
                // Nunca irá acontecer, pois o analisador sintático
                // não permite
                break;
        }
        
         // Podemos adicionar na tabela de símbolos sem verificar
        // pois a análise semântica já fez as verificações
        tabela.inserir(nomeVar, tipoVar);
        for(LingAParser.IdentificadorContext ic: ctx.variavel().identificador()){
            nomeVar = ic.getText();// ctx.variavel().identificador().get(0).IDENT().get(0).getText();
            if(strTipoVar.equals("char")){
            saida.append(strTipoVar + " " + nomeVar + "[80];\n");
            }else{
                saida.append(strTipoVar + " " + nomeVar + ";\n");
            }
        }
        
        return null;
    }
    
    @Override
    public Void visitCmdatribuicao(LingAParser.CmdatribuicaoContext ctx) {
        String var = ctx.identificador().getText();
        
        if(ctx.PONTEIRO()!=null){
            saida.append("*");
        }else{
            saida.append(var+"=");
            //visitExpressao(ctx.expressao());
            saida.append(ctx.expressao().getText()+";\n");
            
        }
        
        
        return null;
    }
    
    @Override
    public Void visitExpressao(LingAParser.ExpressaoContext ctx){
        visitTermo_logico(ctx.termo_logico(0));
        for(LingAParser.Termo_logicoContext termoLogico : ctx.termo_logico()){
            saida.append(" || ");
            visitTermo_logico(termoLogico);
        }
        
        return null;
    }
    
    @Override 
    public Void visitTermo_logico(LingAParser.Termo_logicoContext ctx){
        visitFator_logico(ctx.fator_logico(0));
        
        for(LingAParser.Fator_logicoContext fatorLogico : ctx.fator_logico()){
            saida.append(" && ");
            visitFator_logico(fatorLogico);
        }
        
        return null;
        
    }
    
     @Override
    public Void visitFator_logico(LingAParser.Fator_logicoContext ctx){
        if(ctx.NEGACAO()!=null){
            saida.append("!");
        }
        
        visitParcela_logica(ctx.parcela_logica());
        return null;
    }
    
     @Override
    public Void visitParcela_logica(LingAParser.Parcela_logicaContext ctx){
        
        if(ctx.FALSO()!=null){
            saida.append("false");
        }else if(ctx.VERDADEIRO()!=null){
            saida.append("true");
        }else{
            visitExp_relacional(ctx.exp_relacional());
        }
        return null;
    }
    
    @Override
    public Void visitExp_relacional(LingAParser.Exp_relacionalContext ctx){
        String arit1=ctx.exp_aritmetica().get(0).getText();
        saida.append(arit1);
        if(ctx.op_relacional()!=null){
            switch(ctx.op_relacional().getText()){
                case "=" :
                    saida.append("==");
                    break;
                case "<>":
                    saida.append("!=");
                    break;
                default:
                    saida.append(ctx.op_relacional().getText());
            }
            
        }
        saida.append(ctx.exp_aritmetica(1).getText());
        return null;
    }
    
    @Override
    public Void visitCmdse(LingAParser.CmdseContext ctx) {
        saida.append("if(");
        visitExpressao(ctx.expressao());
        saida.append("){\n");
        for(LingAParser.CmdContext c: ctx.cmdse()){
            visitCmd(c)};
        if (ctx.SENAO() != null) { // tem else
            saida.append("}else{\n");
            for(LingAParser.CmdContext c: ctx.cmd()){
                visitCmd(c);
            }
        }
        saida.append("}\n");
        return null;
    }
    
    @Override
    public Void visitCmdleia(LingAParser.CmdleiaContext ctx) {
        saida.append("scanf(\"");
        String aux="";
        for(LingAParser.IdentificadorContext ic : ctx.identificador()){
            TipoLingA tipo = LingASemanticoUtils.verificarTipo(LingASemantico.escoposAninhados.obterEscopoAtual(), ic);
            
            switch (tipo) {
            case INTEIRO:
                aux = "%d\", &";
                break;
            case REAL:
                aux = "%f\", &";
                break;
            case LITERAL:
                aux = "%s\", ";
                break;
            }
            saida.append(aux+ic.getText());
            
        }
        saida.append(");\n");
        return null;
    }

     @Override
    public Void visitCmdenquanto(LingAParser.CmdenquantoContext ctx) {
        saida.append("while(");
        visitExpressao(ctx.expressao());
        saida.append("){\n");
        for(LingAParser.CmdContext cmdC : ctx.cmd()){
            visitCmd(cmdC);
        }
        saida.append("}\n");
        return null;
    }
    
    @Override 
    public Void visitCmdpara(LingAParser.CmdparaContext ctx) {
        saida.append("for( ").append(ctx.IDENT().getText()).append(" = ").append(ctx.exp_aritmetica().get(0).getText()).append("; ").append(ctx.IDENT().getText()).append(" <= ").append(ctx.exp_aritmetica(1).getText()).append("; ").append(ctx.IDENT().getText()).append("++ ){\n");
        for(LingAParser.CmdContext cmdC : ctx.cmd()){
            visitCmd(cmdC);
        }
        saida.append("}\n");

        return null;
    }
    
    @Override
    public Void visitCmdfaca(LingAParser.CmdfacaContext ctx){
        saida.append("do{" + "\n");
        for(LingAParser.CmdContext cmdC : ctx.cmd()){
            visitCmd(cmdC);
        }
        saida.append("} while( ");
        visitExpressao(ctx.expressao());
        saida.append(");" + "\n");
        
        return null;
    }
    
    @Override
    public Void visitCmdescreva(LingAParser.CmdescrevaContext ctx) {
        saida.append("printf(\"");
        String aux="";
        for(LingAParser.ExpressaoContext ec : ctx.expressao()){
            TipoLingA tipo = LingASemanticoUtils.verificarTipo(LingASemantico.escoposAninhados.obterEscopoAtual(), ec);
            
            switch (tipo) {
            case INTEIRO:
                aux += ","+ec.getText();
                saida.append("%d");
                break;
            case REAL:
                aux += ","+ec.getText();
                saida.append("%f");
                break;
            case LITERAL:
                if(LingASemantico.escoposAninhados.obterEscopoAtual().existe(ec.getText())){
                     aux += ","+ec.getText();
                     saida.append("%s");
                }else{
                     String aux2= ec.getText().split("\"")[1];
                     saida.append(aux2);
                }
                
                break;
            }
            
            
        }
        saida.append("\""+aux);
        saida.append(");\n");
         
        return null;
    }
 

}
