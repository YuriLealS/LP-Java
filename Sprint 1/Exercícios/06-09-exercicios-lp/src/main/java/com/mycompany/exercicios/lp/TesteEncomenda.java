package com.mycompany.exercicios.lp;

public class TesteEncomenda {
    public static void main(String[] args) {
        Encomenda enc = new Encomenda();
        
        enc.calcularFrete("p", "Rua AAAA", "Rua BBBB", 100.00 , 20.00, 0.0);
    }
}
