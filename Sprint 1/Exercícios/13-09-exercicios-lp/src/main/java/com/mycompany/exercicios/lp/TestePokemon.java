package com.mycompany.exercicios.lp;

public class TestePokemon {

    public static void main(String[] args) {
        Pokemon charmander = new Pokemon();
        Pokemon squirtle = new Pokemon();
        TreinadorPokemon ash = new TreinadorPokemon();

        charmander.setNome("Charmander");
        charmander.setForca(12.0);
        charmander.setTipo("Fogo");

        squirtle.setNome("Squirtle");
        squirtle.setForca(10.0);
        squirtle.setTipo("Água");
        
        ash.setTreinador("Ash");

        for (int i = 1; i <= 5; i++) {
            ash.treinarPokemon(charmander);
        }

        System.out.println(charmander.getNome());
        System.out.println(charmander.getDoces());
        System.out.println(String.format("%.2f", charmander.getForca()));
        System.out.println(charmander.getTipo());

        ash.evoluirPokemon(charmander, "Charmeleon");
        System.out.println(charmander.getNome());
        System.out.println(charmander.getDoces());
        System.out.println(String.format("%.2f", charmander.getForca()));
        System.out.println(charmander.getTipo());

        for (int i = 1; i <= 2; i++) {
            ash.treinarPokemon(squirtle);
        }

        System.out.println(squirtle.getNome());
        System.out.println(squirtle.getDoces());
        System.out.println(String.format("%.2f", squirtle.getForca()));
        System.out.println(squirtle.getTipo());

        ash.evoluirPokemon(squirtle, "Wartorttle");

        System.out.println("Nome do Treinador: "+ash.getTreinador());
        System.out.println("Nível do treinador: "+ash.getNivel());

    }
}
