package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class CalculoPesoIdeal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Metodo met = new Metodo();
        
        System.out.println("Infome seu sexo (use M ou F):");
        String sexo = leitor.nextLine();
        System.out.println("Informe sua altura:");
        Double altura = leitor.nextDouble();
        met.calculaPesoIdeal(sexo, altura);
    }
}
