package com.mycompany.exercicios.lp;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um número de 0 à 10: ");
       
        Integer numero = leitor.nextInt();
        Integer sorteado = ThreadLocalRandom.current().nextInt(0, 11);
        
        
        Integer tent = 0;
        while(numero != sorteado){
            System.out.println("O número sorteado foi: " + sorteado);
            System.out.println("Poxa, não foi dessa vez, mas você pode tentar novamente: ");
            sorteado = ThreadLocalRandom.current().nextInt(0, 11);
            numero = leitor.nextInt();
            tent++;
            
        }
        
        if(tent <= 3){
            System.out.println("O número sorteado foi: " + sorteado);
            System.out.println("Você é MUITO sortudo");
        }else if(tent > 3 && tent <= 10){
            System.out.println("O número sorteado foi: " + sorteado);
            System.out.println("Você é sortudo");
        }else{
            System.out.println("O número sorteado foi: " + sorteado);
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
