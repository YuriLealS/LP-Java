package com.mycompany.exercicios.lp;

public class App {

    public static void main(String[] args) {

        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();

        bolo1.sabor = "chocolate";
        bolo1.valor = 50.00;
        bolo1.quantidadeVendida = 0;

        bolo2.sabor = "banana";
        bolo2.valor = 50.00;
        bolo2.quantidadeVendida = 0;

        bolo3.sabor = "morango";
        bolo3.valor = 150.00;
        bolo3.quantidadeVendida = 0;

//        Comprar certo
        for (int i = 1; i <= 5; i++) {
            bolo1.comprarBolo(5);
        }
        bolo1.exibirRelatorio();
        System.out.println("\n");
//        É pra dar erro no nome
        bolo2.comprarBolo(100);
        bolo2.exibirRelatorio();
        System.out.println("\n");
//        É pra dar erro na quantidade
        bolo3.comprarBolo(101);
        bolo3.exibirRelatorio();

    }
}
