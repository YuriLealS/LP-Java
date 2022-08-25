package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Olá "+ nome +"! Qual seu ano de nascimento?");
        Integer anonasc = leitor.nextInt();
        System.out.println("Em 2030 você terá" + (2030 - anonasc));
    }
}
