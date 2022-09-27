package com.mycompany.exercicios.lp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaFrutas {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<String> frutas = new ArrayList();
        frutas.add("abacaxi");
        frutas.add("banana");
        frutas.add("maçã");
        frutas.add("pêra");

        System.out.println("Digite uma fruta: ");
        String fruta = leitor.nextLine();

        Boolean verdade = true;
        for (int i = 0; i < frutas.size(); i++) {
            if (frutas.get(i).equals(fruta)) {
                verdade = true;
                break;
            } else {
                verdade = false;
            }
        }

        if (verdade) {
            System.out.println("A fruta " + fruta + " existe na lista");
        } else {
            System.out.println("A fruta " + fruta + " não existe na lista");
        }

    }
}
