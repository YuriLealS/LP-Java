package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
//        Crie uma classe Java chamada "CadastroUsuario" que:
//        Seja executável
//        Solicite o login do cliente
//        Solicite a senha do cliente
//        Solicite a quantidade de vezes que o usuário aceita errar a senha antes do bloqueio
//        Exiba uma frase como esta: "Seu login é L e sua senha é S. Você tem T tentativas antes de ser bloqueado" 
//        Use interpolação

        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Informe seu login: ");
        String login = leitor.nextLine();
        System.out.println("Informe sua senha: ");
        String senha = leitor.nextLine();
        System.out.println("Quantas chances você quer para fazer login?");
        Integer chance = leitor.nextInt();
        System.out.println("Seu login é " + login + " e sua senha é " + senha + 
                ". Você tem " + chance + " tentativas antes de ser bloqueado");
    }
}
