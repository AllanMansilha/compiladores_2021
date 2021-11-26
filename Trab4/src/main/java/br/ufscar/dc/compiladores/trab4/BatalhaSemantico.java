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
                BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "Número máximo de pokemons na equipe é 3");
            }
            else{
                // Tratamento para inserir o nome do tipo no arquivo de saída
                switch (tipo) {
                    case FOGO:
                        tipoDiv = "Fogo";
                        break;
                    case AGUA:
                        tipoDiv = "Agua";
                        break;
                    case GRAMA:
                        tipoDiv = "Grama";
                        break;
                    default:
                        //tipoDiv = "Classe inválida";
                        tipoDiv = "Invalido";
                        BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, tipoDiv);
                        break;
                }
                codigoPokemon ++;
                String vida = ctx.Vida().getText();
                
                tabela.adicionar(nomePokemon, tipo, Integer.parseInt(vida), codigoPokemon);
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
                BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "Nenhum pokemon na equipe para lutar");
            }
            else{
                if(codigoPokemon > 3){
                    BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "Já existe um pokemon selvagem para lutar");
                }
                else{
                    // Tratamento para inserir o nome do tipo no arquivo de saída
                    switch (tipo) {
                        case FOGO:
                            tipoDiv = "Fogo";
                            break;
                        case AGUA:
                            tipoDiv = "Agua";
                            break;
                        case GRAMA:
                            tipoDiv = "Grama";
                            break;
                        default:
                            //tipoDiv = "Classe inválida";
                            tipoDiv = "Invalido";
                            BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, tipoDiv);
                            break;
                    }
                    codigoPokemon = 4;
                    String vida = ctx.Vida().getText();

                    tabela.adicionar(nomePokemon, tipo, Integer.parseInt(vida), codigoPokemon);
                    
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
                BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon " + nomePokemon + " não esta no campo de batalha");
            }
            else{ 
                int vida = tabela.verificarVida(nomePokemon);
                
                if(vida <= 0){
                    BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon " + nomePokemon + " não tem vida para lutar");
                }   
            }
        }
        else{
            BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon" + nomePokemon + "não esta na equipe");
        }
        
        return super.visitCmdLutar(ctx);
    }
    
    @Override
    public Void visitCmdTrocar(BatalhaParser.CmdTrocarContext ctx){
        
        String nomePokemon = ctx.Nome().getText();
        
        if(tabela.existe(nomePokemon)){
            int codigo = tabela.verificarCodigo(nomePokemon);
            if(codigo == 1){
                BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon " + nomePokemon + " já está no campo de batalha");
            }
            else{ 
                int vida = tabela.verificarVida(nomePokemon);
                
                if(vida <= 0){
                    BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon " + nomePokemon + " não tem vida para trocar");
                }   
            }
        }
        else{
            BatalhaSemanticoUtils.adicionarErroSemantico(ctx.start, "O pokemon" + nomePokemon + "não esta na equipe");
        }
        return super.visitCmdTrocar(ctx);
    }

}
