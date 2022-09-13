package com.mycompany.exercicios.lp;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado emp = new Empregado();
        Empregado emp2 = new Empregado();
        
        emp.reajustarSalario("João", "Analista de sistemas", 15.0, 5400.00);
        emp2.reajustarSalario("Yuri", "Estagiário", 10.0, 2000.00);
    }
}
