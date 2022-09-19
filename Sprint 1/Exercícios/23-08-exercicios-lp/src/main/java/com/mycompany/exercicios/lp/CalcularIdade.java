package com.mycompany.exercicios.lp;

import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Metodo met = new Metodo();
        
        System.out.println("Informe sua idade:");
        Integer idadeInfo = leitor.nextInt();
        met.classificaIdade(idadeInfo);
        
    }
}
