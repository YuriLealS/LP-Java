package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class DescontoProgressivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Metodo met = new Metodo();
        
        System.out.println("Informe o valor: ");
        Double valor = leitor.nextDouble();
        System.out.println("Informe a quantidade: ");
        Integer qtdd = leitor.nextInt();
        Double mostrar = met.calcularDesconto(valor, qtdd);
        met.exibirNotaFiscal(valor, qtdd, mostrar);
    }
}
