package com.mycompany.exercicios.lp;

public class TreinadorPokemon {
    
    private Integer nivel = 0;
    private String treinador;

    public String getTreinador() {
        return treinador;
    }

    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }
    
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    
    public Integer getNivel() {
        return nivel;
    }
    
    public void treinarPokemon(Pokemon poke){
        poke.setForca(poke.getForca() + (poke.getForca() * 0.1));
        poke.setDoces(poke.getDoces() + 10);
        nivel++;
    }
    
    public void evoluirPokemon(Pokemon poke, String evo){
        if (poke.getDoces() >= 50) {
            poke.setDoces(poke.getDoces()-50);
            nivel+=10;
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", poke.getNome(), evo));
            poke.setNome(evo);
        } else System.out.println("Não foi possível realizar operação");
        
    }
}
