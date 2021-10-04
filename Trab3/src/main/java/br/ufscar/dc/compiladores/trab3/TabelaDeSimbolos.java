package br.ufscar.dc.compiladores.trab3;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    
    public enum TipoLingA{
        INTEIRO,
        REAL,
        LITERAL,
        LOGICO,
        REGISTRO,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos{
        String nome;
        TipoLingA tipo;
        
        private EntradaTabelaDeSimbolos(String nome, TipoLingA tipo){
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
     
    public TabelaDeSimbolos(){
        this.tabela= new HashMap<>();
    }
    
    public void inserir(String nome, TipoLingA tipo){
       tabela.put(nome, new EntradaTabelaDeSimbolos(nome,tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoLingA verificar(String nome){
        return tabela.get(nome).tipo;
    }
    
}
