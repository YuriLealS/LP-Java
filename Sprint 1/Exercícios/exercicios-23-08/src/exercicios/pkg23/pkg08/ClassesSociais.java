package exercicios.pkg23.pkg08;

import java.util.Scanner;

public class ClassesSociais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Metodo met = new Metodo();
         System.out.println("Informe sua renda: ");
         Double renda = leitor.nextDouble();
         System.out.println(renda);
         Double qtdSalarios = met.qtdSalMin(renda);
         System.out.println(String.format("Você recebe em média: %.2f salários mínimos", qtdSalarios));
         String resultado = met.classes(qtdSalarios);
         System.out.println("Você pertence a: " + resultado);
        }
    }
