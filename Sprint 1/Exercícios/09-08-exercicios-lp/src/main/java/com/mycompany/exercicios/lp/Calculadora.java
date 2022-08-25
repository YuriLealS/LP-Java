package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe um número");
        Double num1 = leitor.nextDouble();
        System.out.println("Informe outro número");
        Double num2 = leitor.nextDouble();
        System.out.println("a soma é: "+ (num1 + num2));
        System.out.println("a subtração é: "+ (num1 - num2));
        System.out.println("a multiplicação é: "+ (num1 * num2));
        System.out.println("a divisão| é: "+ (num1 / num2));

    }
}
