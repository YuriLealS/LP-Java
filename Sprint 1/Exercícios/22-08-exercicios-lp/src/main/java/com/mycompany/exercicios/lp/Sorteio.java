package com.mycompany.exercicios.lp;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        Integer foiSorteado = 0;
        Integer par = 0;
        Integer impar = 0;
        Integer prim = 0;
        
        System.out.println("Informe um número de 1 à 100:");
        Integer informado = leitor.nextInt();
        
        for (int i = 1; i <= 200; i++) {
            
            Integer numSorteado = ThreadLocalRandom.current().nextInt (1, 101);
            
            if(numSorteado == informado && prim == 0){
                prim = i;
                foiSorteado++;
            }else if (numSorteado == informado) {
                foiSorteado++;
            }
            
            if (numSorteado %2 == 0) {
                par++;
            }else{
                impar++;
            }
            
        }
        
        System.out.println("Foram sorteados: " + par + " números pares \n"
        + impar + " números impares \n seu número foi sorteado pela primeira vez em: "
        + prim + "\n  e foi sortado " + foiSorteado + " vezes");
    }
}
