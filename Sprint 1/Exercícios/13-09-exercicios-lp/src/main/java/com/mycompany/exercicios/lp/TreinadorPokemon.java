package com.mycompany.exercicios.lp;

public class TreinadorPokemon {
    
    
    private Integer nivel;
    
    
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    
    public Integer getNivel() {
        return nivel;
    }
    
    public void treinarPokemon(Pokemon poke, TreinadorPokemon nivel){
        poke.setForca(poke.getForca() + (poke.getForca() * 0.1));
        poke.setDoces(poke.getDoces() + 10);
        nivel.setNivel(nivel.getNivel() + 1);
    }
}
