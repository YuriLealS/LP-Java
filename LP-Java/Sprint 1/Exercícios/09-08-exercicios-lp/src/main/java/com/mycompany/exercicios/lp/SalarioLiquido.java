package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Informe seu salário bruto:");
        Double bruto = leitor.nextDouble();
        System.out.println("Quanto você gasta de condução diariamente?");
        Double conducao = leitor.nextDouble();
        Double vt = (conducao * 2 * 22);
        Double descontos = (bruto * 0.1)+(bruto * 0.2) + vt;
        Double liquido = (bruto - descontos);
        System.out.println("Seu salário bruto é R$"+ bruto +", tem um total de R$"+ descontos +" em descontos e receberá um líquido de R$"+liquido);
    }
}
