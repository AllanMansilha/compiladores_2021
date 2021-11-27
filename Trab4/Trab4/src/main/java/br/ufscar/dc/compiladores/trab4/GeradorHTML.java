package br.ufscar.dc.compiladores.trab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GeradorHTML {
    
    public static StringBuffer arquivo = new StringBuffer();
    public static String caminhoArquivo;
    // Lista que separa cada div do site pelo pokemon correto
    public static List<String> divPokemon = new ArrayList<String>();
    public static int vidaEquipe;
    public static int vidaSelvagem;
    
    public static void AdicionaString(String texto) {
        arquivo.append(texto).append("\n");
    }
    
    public static String getTexto() {
        return arquivo.toString();
    }
    
    public static void AddVidaEquipe(int vida){
        vidaEquipe = vida;
    }
    
    public static void AddVidaSelvagem(int vida){
        vidaSelvagem = vida;
    }
    
        // O arquivo é criado com toda a estrutura de início do HTML e CSS
    public static void criaArquivo(String caminho) {
        caminhoArquivo = caminho;
        arquivo.append("<html>\n" +
                "    <head>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "        <title>Batalha Pokemon!!</title>\n" +
                "        <style type=\"text/css\">\n" +
                "            body {\n" +
                "                background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2_fNuhKOVPZVbpSRbphshHh4NZDqYbB4jWrIRAlE0ylq56bb9Fhe4Hp_R4iFIntoCx74&usqp=CAU');\n" +
                "            }\n" +
                "            td {\n" +
                "                vertical-align: top;\n" +
                "            }\n" +
                "            #box {\n" +
                "                align:center; \n"+
                "                margin-left: 100px;\n" +
                "                width: 400px;\n" +
                "                min-height: 600px;\n" +
                "                max-height: 1500px;\n" +
                "                border-style: solid;\n" +
                "                border-color: #A0522D;\n" +
                "                border-width: thin;\n" +
                "                border-radius: 10px;\n" +
                "                margin: 10px;\n" +
                "                padding: 10px;\n" +
                "                text-align: center;\n" +
                "                color: #74e72e;\n" +
                "                font-family: Courier New;\n" +
                "                font-weight: bold;\n" +
                "                background-image: url('https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/e483edbf-4b49-42e8-a684-cdf17c4f227f/ddea3kc-76d83018-ad2a-4147-8654-44b97b1c79ce.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2U0ODNlZGJmLTRiNDktNDJlOC1hNjg0LWNkZjE3YzRmMjI3ZlwvZGRlYTNrYy03NmQ4MzAxOC1hZDJhLTQxNDctODY1NC00NGI5N2IxYzc5Y2UucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.D60h0LFN6zjxBZIdBxAEQ09VhEzJs0A6oEw68xl9KsI');\n" +
                "                background-size: cover;\n" +
                "            }\n" +
                "\n" +
                "            #erros {\n" +
                "                margin: 0 auto;\n" +
                "                border-style: solid;\n" +
                "                border-color: #69ff2d;\n" +
                "                border-width: thin;\n" +
                "                border-radius: 10px;\n" +
                "                margin: 10px;\n" +
                "                padding: 10px;\n" +
                "                text-align: center;\n" +
                "                color: #74e72e;\n" +
                "                font-family: Courier New;\n" +
                "                font-weight: bold;\n" +
                "                background-color: #000000;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip {\n" +
                "                position: relative;\n" +
                "                display: inline-block;\n" +
                "                cursor: help;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip .tooltiptext {\n" +
                "                visibility: hidden;\n" +
                "                width: 120px;\n" +
                "                text-align: center;\n" +
                "                border-radius: 6px;\n" +
                "                padding: 5px 0;\n" +
                "                position: absolute;\n" +
                "                z-index: 1;\n" +
                "                top: -5px;\n" +
                "                left: 105%;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip:hover .tooltiptext {\n" +
                "                visibility: visible;\n" +
                "            }\n" +
                "        </style>\n" +
                "    </head>\n" +
                "         \n" +
                "    <body>\n" +
                "        <table>\n" +
                "            <tr>\n");    }
    
     // Cria div de 1 pokemon
    public static void adicionaDiv(String info) {
        divPokemon.add(info);
    }
    
    // Faz concatenação em div de 1 pokemon
    public static void appendDiv(int codigo, String infoNova) {
        String infoAnterior = divPokemon.get(codigo);
        String infoConcat = infoAnterior.concat(infoNova);
        divPokemon.set(codigo, infoConcat);
    }
    
     // Grava o texto gerado no arquivo de saída
    public static void gravaArquivo() {
        for(int i = 0; i < divPokemon.size(); i++) {
            appendDiv(i, "                </td></div>\n\n");
            arquivo.append(divPokemon.get(i));
        }
        
        if(vidaEquipe>vidaSelvagem){
            arquivo.append("<td><div id=\"erros\">"
                    + "<h1><font color=\"#74e72e\" font-family: 'Courier New'>"
                    + "Você venceu! :D \n <br><br>"
                    + "<img src=\"https://gonintendo.com/system/file_uploads/uploads/000/021/982/medium/tumblr_inline_ncao5z05Xn1riz28f.jpg\" width=\"425\" height=\"325\"></img></td></div>\n\n");
        }
        else{
            if(vidaEquipe != 0){
                arquivo.append("<td><div id=\"erros\">"
                        + "<h1><font color=\"#74e72e\" 	font-family: 'Courier New'>" 
                        + "Você perdeu! :( \n <br><br>" 
                        + "<img src=\"https://images.vice.com/motherboard/content-images/article/no-id/1481668843485843.jpg\" width=\"425\" height=\"325\"></img></td></div>\n\n");
        
            }
        }    
        
        arquivo.append("            </tr>\n" +
                "    </body>\n" +
                "</html>");

        try {
            Files.writeString(Paths.get(caminhoArquivo), getTexto());
        } catch (IOException e) {
        }

        System.exit(0);

    }
}
