package com.mycompany.exercicios.lp;

public class Termometro {
    
    Double temperaturaMax = 0.0;
    Double temperaturaMin = 1000000000000000000000000000000000000000000000000000000000000000000000000000.0;
    
    void aumentaTemperatura( Double temperaturaAtual){
        
        if (temperaturaAtual > temperaturaMax) {
            temperaturaMax = temperaturaAtual;
        }
        System.out.println("A temperatura maxíma é: " + temperaturaMax + "°C");

    }
    void diminuiTemperatura(Double temperaturaAtual){
    
        if (temperaturaAtual < temperaturaMin) {
            temperaturaMin = temperaturaAtual;
        }
        System.out.println("A temperatura mínima é: " + temperaturaMin + "°C");

    }
    void exibeFahreinheit(Double temperaturaAtual){
        
        Double convertida;
        convertida  = temperaturaAtual * 9 / 5 + 32 ;
        System.out.println("Convertida para Fahreinheit: " + convertida + "°F");
    }

}
