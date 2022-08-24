package com.mycompany.exercicios.lp;
    
import java.util.Scanner;

public class BolsaFilhos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Integer filhos;
        System.out.println("Informe quantos filhos você tem de 0-3 anos");
        Integer menor = leitor.nextInt();
        System.out.println("Informe quantos filhos você tem de 4-16 anos");
        Integer medio = leitor.nextInt();
        System.out.println("Informe quantos filhos você tem de 17-18 anos");
        Integer maior = leitor.nextInt();
        filhos = (menor + medio + maior);
        Double valor;
        valor = (menor * 25.12 + medio * 15.88 + maior * 12.44);
        System.out.println("Você tem um total de " + filhos + " filhos e vai receber R$" + valor + " de bolsa");
    }
}
