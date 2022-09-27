package com.mycompany.exercicios.lp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNumeros {

    public static void main(String[] args) {
        Integer num = 1;
        Integer pares = 0;
        Integer impares = 0;
        Integer soma = 0;
        Integer menor = 999999999;
        Integer maior = 0;
        do {
            List<Integer> listaNumerica = new ArrayList();
            Scanner leitor = new Scanner(System.in);
            System.out.println("Informe um número: ");
            num = leitor.nextInt();
            if (num != 0) {
                listaNumerica.add(num);
            }
            if (num != 0 && num < menor) {
                menor = num;
            }
            if (num != 0 && num > maior) {
                maior = num;
            }
            if (num != 0) {
                soma += num;
            }
            if (num != 0 && num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            System.out.println("Caso digitar o número 0, a lista encerrará");
        } while (num != 0);

        System.out.println("Quantidade de numeros pares: " + pares);
        System.out.println("Quantidade de numeros impares: " + impares);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);

    }
}
