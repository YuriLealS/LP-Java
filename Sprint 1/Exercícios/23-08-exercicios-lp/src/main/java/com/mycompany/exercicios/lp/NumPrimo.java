package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Metodo met = new Metodo();
        System.out.println("Informe um número inteiro: ");
        Integer num = leitor.nextInt();
        met.verificarPrimo(num);
    }
}
