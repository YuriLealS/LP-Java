package exercicios.pkg23.pkg08;

import java.util.Scanner;

public class CalcularMedia {
      public static void main(String[] args) {
      Scanner leitor = new Scanner (System.in);
      Metodo met = new Metodo (); 
        
      System.out.println("Infome a primeira nota: ");
      Double nota1 = leitor.nextDouble();
      System.out.println("Informe a segunda nota: ");
      Double nota2 = leitor.nextDouble();
      Double media = met.media(nota1, nota2);
      System.out.println("A sua média é: " + media);
    }
}

