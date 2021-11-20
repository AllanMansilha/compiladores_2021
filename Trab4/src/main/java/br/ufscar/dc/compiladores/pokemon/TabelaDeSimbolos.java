/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.pokemon;

/**
 *
 * @author amanda
 */

import java.util.HashMap;
import java.util.Map;
import java.util.List;
        
public class TabelaDeSimbolos {
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;

    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    public void inserir(String nome) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
}