package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class AutenticacaoLogin {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Insira seu login:");
        String login =  leitor.nextLine();
        System.out.println("Insira sua senha");
        String senha =  leitor.nextLine();
        
        while(!login.equals("admin") || !senha.equals("#Bandtec")){
            System.out.println("Login e/ou senha inválidos");
            System.out.println("Insira novamente seu login:");
            login =  leitor.nextLine();
            System.out.println("Insira novamente sua senha:");
            senha =  leitor.nextLine();
        }
        System.out.println("Logado com sucesso!!");
    }
}
