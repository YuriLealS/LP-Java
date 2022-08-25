package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class Jorge {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Integer calorias;
        Integer tempo;
        System.out.println("Quanto tempo você passou se aquecendo?(em minutos)");
        Integer aquecimento = leitor.nextInt();
        System.out.println("Quanto tempo você passou fazendo exercícios aeróbicos? (em minutos)");
        Integer aerobicos = leitor.nextInt();
        System.out.println("Quanto tempo você passou fazendo musculação? (em minutos)");
        Integer muscula = leitor.nextInt();
        tempo = (aquecimento + aerobicos + muscula);
        calorias = (aquecimento * 12 + aerobicos * 20 + muscula * 25);
        System.out.println("Olá, Jorge. Você fez um total de "+ tempo +" minutos de exercícios e perdeu cerca de "+ calorias +" calorias");
    }
}
