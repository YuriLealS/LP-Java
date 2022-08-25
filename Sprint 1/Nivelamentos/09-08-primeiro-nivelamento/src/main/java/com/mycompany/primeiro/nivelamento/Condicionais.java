package com.mycompany.primeiro.nivelamento;

public class Condicionais {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 42;
        
        if(numero01 > numero02){
            System.out.println(numero01 + " é maior que " + numero02);
        }else if(numero01 < numero02){
            System.out.println(numero01 + " é menor que " + numero02);
        }else{
            System.out.println(numero01 + " é igual a " + numero02);
        }
        
        Boolean bloqueado = true;
        
        if (bloqueado) {
            System.out.println("Usuário Bloqueado");
        } else{
            System.out.println("Usuário Desbloqueado");
        }
        
        String nome01 = "Yuri";
        String nome02 = "YUri";
        
        if(nome01.equals(nome02)){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }
        
        if(nome01.equalsIgnoreCase(nome02)){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }
    }
}
