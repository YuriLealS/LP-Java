package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer resultado = 1;
        
        System.out.println("Informe um número:");
        Integer num = leitor.nextInt();
        System.out.println("Informe o numero que quer elevá-lo:");
        Integer expoente = leitor.nextInt();
        
        for (int i = 0; i < expoente; i++) {
            resultado = resultado * num;
        }
        
        
        System.out.println(num + " elevado à " + expoente + " é igual a: " + resultado);
    }
}
