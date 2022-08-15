package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Informe seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Informe sua primeira nota:");
        Double nota1 = leitor.nextDouble();
        System.out.println("Informe sua segunda nota:");
        Double nota2 = leitor.nextDouble();
        System.out.println("Olá, "+ nome +". Sua média foi de " + (nota1 + nota2)/2 );
    }
}
