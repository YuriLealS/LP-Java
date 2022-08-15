package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
        Double preco;
        Double troco;
        System.out.println("Informe o valor do produto:");
        Double produto = leitor.nextDouble();
        System.out.println("Informe quantos foram vendidos:");
        Integer qtd = leitor.nextInt();
        System.out.println("Quanto o cliente pagou?");
        Double pago = leitor.nextDouble();
        preco = (produto * qtd);
        troco  = (pago - preco);
        System.out.println("Seu troco será de R$" + troco);
    }
}
