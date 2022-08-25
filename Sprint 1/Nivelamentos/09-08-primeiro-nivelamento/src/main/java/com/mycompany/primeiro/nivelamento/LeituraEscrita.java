package com.mycompany.primeiro.nivelamento;

import java.util.Scanner;

public class LeituraEscrita {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        
        String nome = leitor.nextLine();
        
        System.out.println("Digite sua idade: ");
        
        Integer idade = leitor.nextInt();
        
        System.out.println("Digite sua altura: ");
        
        Double altura = leitor.nextDouble();
        
        System.out.println("Seu nome é " + nome + " você tem " + idade +
                " anos e " + altura + " de altura.");
    }
}
