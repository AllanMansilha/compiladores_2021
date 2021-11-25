package br.ufscar.dc.compiladores.trab4;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    
    public enum Tipo {
        FOGO,
        AGUA,
        GRAMA,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        Tipo tipo;
        int nivel;
        int vida;
        int codigo;

        private EntradaTabelaDeSimbolos(String nome, Tipo tipo, int nivel, int vida, int codigo) {
            this.nome = nome;
            this.tipo = tipo;
            this.nivel = nivel;
            this.vida = vida;
            this.codigo = codigo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, Tipo tipo, int nivel, int vida, int codigo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo, nivel, vida, codigo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public Tipo verificar(String nome) {
        return tabela.get(nome).tipo;
    }
    
    public int verificarNivel(String nome) {
        return tabela.get(nome).nivel;
    }
    
     public int verificarVida(String nome) {
        return tabela.get(nome).vida;
    }
     
    public int verificarCodigo(String nome) {
        return tabela.get(nome).codigo;
    }
}
