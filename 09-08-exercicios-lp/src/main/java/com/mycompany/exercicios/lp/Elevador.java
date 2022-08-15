package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Qual limite de peso do elevador?");
        Double peso = leitor.nextDouble();
        System.out.println("Qual o limite de pessoas?");
        Integer pessoas = leitor.nextInt();
        System.out.println("Qual o peso da primeira pessoa que entrou?");
        Double prim = leitor.nextDouble();
        System.out.println("Qual o peso da segunda pessoa que entrou?");
        Double seg = leitor.nextDouble();
        System.out.println("Qual o peso da terceira pessoa que entrou?");
        Double terc = leitor.nextDouble();
        Double pesototal = (prim + seg + terc);
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "+pessoas+" pessoas.\n" +
"O peso total no elevador é de "+ pesototal +", sendo que ele suporta " + peso);

        
    }
}
