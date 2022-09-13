package com.mycompany.exercicios.lp;

public class Bolo {
    String sabor;
    Double valor; 
    Integer quantidadeVendida;
    Double faturado = 0.0;
    void comprarBolo(Integer quantidadeDesejada){
    Integer validacao = 0;
    validacao = quantidadeDesejada + quantidadeVendida;
        if (validacao >= 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        }else if (valor < 30.00 || valor > 50.00) {
            System.out.println("Valor inválido");
        }else if (!sabor.equals("chocolate") && !sabor.equals("morango")&& !sabor.equals("abacaxi")) {
            System.out.println("Sabor inválido");
        }
        else{
            System.out.println(quantidadeDesejada+" bolo(s) comprado(s)");
            quantidadeVendida += quantidadeDesejada;
            faturado += valor * quantidadeDesejada;
        }
    }
    
    void exibirRelatorio(){
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f",sabor,quantidadeVendida,faturado));
    }
}
