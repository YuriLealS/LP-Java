package com.mycompany.exercicios.lp;

public class Empregado {
    
    void reajustarSalario(String nome, String cargo, Double pctg, Double salario){
        System.out.println("Salário antes do reajuste: " + salario);
        salario += salario * (pctg / 100);
        System.out.println("nome: " + nome + "\ncargo: " + cargo + "\nsalario reajustado: " + salario);
    }
    
}
