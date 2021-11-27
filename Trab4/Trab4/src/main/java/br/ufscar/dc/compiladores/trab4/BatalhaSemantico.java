package br.ufscar.dc.compiladores.trab4;

import br.ufscar.dc.compiladores.trab4.TabelaDeSimbolos.Tipo;

public class BatalhaSemantico extends BatalhaBaseVisitor<Void> {
    
    TabelaDeSimbolos tabela;
    // Inteiro para verificar quantos pokemons tem em uma equipe
    int codigoPokemon = 0;
    
    @Override
    public Void visitPrograma(BatalhaParser.ProgramaContext ctx) {
        tabela = new TabelaDeSimbolos();

        return super.visitPrograma(ctx);
    }
    
    @Override
    public Void visitDeclaracao_equipe(BatalhaParser.Declaracao_equipeContext ctx){
        
        if (ctx.Nome() != null) {
            Tipo tipo = BatalhaSemanticoUtils.verificarTipo(tabela, ctx);
            String tipoDiv;
            String nomePokemon = ctx.Nome().getText();
            
            if (codigoPokemon>3) {
                GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                    "Número máximo de pokemons na equipe é 3!</div>\n");
                //BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "Número máximo de pokemons na equipe é 3");
            }
            else{
                // Tratamento para inserir o nome do tipo no arquivo de saída
                switch (tipo) {
                    case FOGO:
                        tipoDiv = "<img src = \'https://64.media.tumblr.com/68879c0cd61fde0e6ac5aca46d0d04e5/tumblr_mmi88btyBi1spn836o5_400.png'width=\"25\" height=\"25\">\n";
                        break;
                    case AGUA:
                        tipoDiv = "<img src = \'https://64.media.tumblr.com/23fcc303266711c0e7fa2c6ecc506bbb/tumblr_mmi88btyBi1spn836o10_400.png'width=\"25\" height=\"25\">\n";
                        break;
                    case GRAMA:
                        tipoDiv = "<img src = \'https://www.pngkey.com/png/full/353-3532551_pokemon-snivy.png'width=\"25\" height=\"25\">\n";
                        break;
                    default:
                        //tipoDiv = "Classe inválida";
                        tipoDiv = "<img src = \'https://64.media.tumblr.com/e9d0327e72bfa3daa733ac06b5fb4d25/tumblr_mmi88btyBi1spn836o1_400.png'width=\"25\" height=\"25\">\n";
                        GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                            "O tipo do pokemon " + nomePokemon + " é invalido</div>\n");
                        //BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, tipoDiv);
                        break;
                }
                
                codigoPokemon ++;
                String vida = ctx.Vida().getText();
                
                tabela.adicionar(nomePokemon, tipo, Integer.parseInt(vida), codigoPokemon);
                
                if(codigoPokemon == 1){
                    String div = "                <td><div id=\"box\">\n"
                            + "                    <br><br>"
                            + "<h1><font color=\"#74e72e\" 	font-family: 'Courier New'>" + nomePokemon + "     " + tipoDiv+ "</font></h1>\n"
                            + "                    <font color=\"#ffffff\">HP</font> "  + vida + "<p><p><p>\n";
                    GeradorHTML.adicionaDiv(div);
                    GeradorHTML.AddVidaEquipe(Integer.parseInt(vida));
                }
            }
            
        }
        return super.visitDeclaracao_equipe(ctx);
    }
    
    @Override
    public Void visitDeclaracao_selvagem(BatalhaParser.Declaracao_selvagemContext ctx){
        
        if (ctx.Nome() != null) {
            Tipo tipo = BatalhaSemanticoUtils.verificarTipo(tabela, ctx);
            String tipoDiv;
            String nomePokemon = ctx.Nome().getText();
            
            if (codigoPokemon==0){
                GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                    "Nenhum pokemon na equipe para batalhar!</div>\n");
                //BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "Nenhum pokemon na equipe para lutar");
            }
            else{
                if(codigoPokemon > 3){
                    GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                        "Já existe um pokemon selvagem para batalhar!</div>\n");
                    //BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "Já existe um pokemon selvagem para lutar");
                }
                else{
                    // Tratamento para inserir o nome do tipo no arquivo de saída
                    switch (tipo) {
                    case FOGO:
                        tipoDiv = "<img src = \'https://64.media.tumblr.com/68879c0cd61fde0e6ac5aca46d0d04e5/tumblr_mmi88btyBi1spn836o5_400.png'width=\"25\" height=\"25\">\n";
                        break;
                    case AGUA:
                        tipoDiv = "<img src = \'https://64.media.tumblr.com/23fcc303266711c0e7fa2c6ecc506bbb/tumblr_mmi88btyBi1spn836o10_400.png'width=\"25\" height=\"25\">\n";
                        break;
                    case GRAMA:
                        tipoDiv = "<img src = \'https://www.pngkey.com/png/full/353-3532551_pokemon-snivy.png'width=\"25\" height=\"25\">\n";
                        break;
                    default:
                        //tipoDiv = "Classe inválida";
                        tipoDiv = "<img src = \'https://64.media.tumblr.com/e9d0327e72bfa3daa733ac06b5fb4d25/tumblr_mmi88btyBi1spn836o1_400.png'width=\"25\" height=\"25\">\n";
                        GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                            "O tipo do pokemon " + nomePokemon + " é invalido</div>\n");
                        //BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, tipoDiv);
                        break;
                    }
                    codigoPokemon = 4;
                    String vida = ctx.Vida().getText();

                    tabela.adicionar(nomePokemon, tipo, Integer.parseInt(vida), codigoPokemon);
                    
                    String div = "                <td><div id=\"box\">\n"
                            + "                    <br><br>"
                            + "<h1><font color=\"#74e72e\" 	font-family: 'Courier New'>" + nomePokemon + "     " + tipoDiv+ "</font></h1>\n"
                            + "                    <font color=\"#ffffff\">HP</font> "  + vida + "<p><p><p>\n";
                    GeradorHTML.adicionaDiv(div);
                    GeradorHTML.AddVidaSelvagem(Integer.parseInt(vida));                    
                }
            }      
        }
        
        return super.visitDeclaracao_selvagem(ctx);
    }
    
    @Override
    public Void visitCmdLutar(BatalhaParser.CmdLutarContext ctx){
        
        String nomePokemon = ctx.Nome().getText();
        
        if(tabela.existe(nomePokemon)){
            int codigo = tabela.verificarCodigo(nomePokemon);
            if(codigo != 1){
                GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                    "O pokemon " + nomePokemon + " não esta no campo de batalha!</div>\n");
                //BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon " + nomePokemon + " não esta no campo de batalha");
            }
            else{ 
                int vida = tabela.verificarVida(nomePokemon);
                
                if(vida <= 0){
                    GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                        "O pokemon " + nomePokemon + " não tem vida vida para batalhar!</div>\n");
                    //BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon " + nomePokemon + " não tem vida para lutar");
                }   
            }
        }
        else{
            GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                "O pokemon " + nomePokemon + " não esta na equipe!</div>\n");
            //BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon" + nomePokemon + "não esta na equipe");
        }
        
        return super.visitCmdLutar(ctx);
    }
    
    @Override
    public Void visitCmdTrocar(BatalhaParser.CmdTrocarContext ctx){
        
        String nomePokemon = ctx.Nome().getText();
        
        if(tabela.existe(nomePokemon)){
            int codigo = tabela.verificarCodigo(nomePokemon);
            if(codigo == 1){
                GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                    "O pokemon " + nomePokemon + " já esta no campo de batalha!</div>\n");
                //BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon " + nomePokemon + " já está no campo de batalha");
            }
            else{ 
                int vida = tabela.verificarVida(nomePokemon);
                
                if(vida <= 0){
                    GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                        "O pokemon " + nomePokemon + " não tem vida para trocar!</div>\n");
                    //BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon " + nomePokemon + " não tem vida para trocar");
                }   
            }
        }
        else{
            GeradorHTML.AdicionaString("                    <div id=\"erros\">" + 
                "O pokemon " + nomePokemon + " não esta na equipe!</div>\n");
            //BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon" + nomePokemon + "não esta na equipe");
        }
        return super.visitCmdTrocar(ctx);
    }

}
