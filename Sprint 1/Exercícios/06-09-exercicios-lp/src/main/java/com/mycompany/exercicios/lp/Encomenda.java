package com.mycompany.exercicios.lp;

public class Encomenda {
    
    void calcularFrete(String tamanho, String enderecoRemetente, String enderecoDestinatario, Double distancia, Double valorEncomenda, Double frete){

        if (tamanho.equals("P") || tamanho.equals("p")) {
                frete = valorEncomenda * 0.01;
        } else if (tamanho.equals("M") || tamanho.equals("m")) {
                frete = valorEncomenda * 0.03;
        } else if (tamanho.equals("G") || tamanho.equals("g")) {
                frete = valorEncomenda * 0.05;
        }else System.out.println("Tamanho inválido");
        
        if (distancia <= 50.00) {
            frete *= 3;
        }else if (distancia <= 200.00 && distancia > 50.00 ) {
            frete *= 5;            
        }else if (distancia > 200.00) {
            frete *= 7;
        }
        System.out.println(frete);
    }
}
