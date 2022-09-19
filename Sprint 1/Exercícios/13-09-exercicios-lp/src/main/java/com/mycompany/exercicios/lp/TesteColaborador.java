package com.mycompany.exercicios.lp;

public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colab1 = new Colaborador();
        Colaborador colab2 = new Colaborador();
        RecursosHumanos rh1 = new RecursosHumanos();

        //setando os valores dos colaboradores
        colab1.setNome("Yuri");
        colab1.setCargo("Estagiário");
        colab1.setSalario(2000.00);

        colab2.setNome("Diogo");
        colab2.setCargo("Estagiário");
        colab2.setSalario(1800.00);

        //Mostrando os dados que foram setados
        System.out.println(colab1.getCargo());
        System.out.println(colab1.getNome());
        System.out.println(colab1.getSalario());

        System.out.println(colab2.getCargo());
        System.out.println(colab2.getNome());
        System.out.println(colab2.getSalario());
        
        //Promovendo os colaboradores
        rh1.promoverColaborador(colab1, "Programador JR", 4500.00);
        rh1.promoverColaborador(colab2, "Programador JR", 1000.00);

        rh1.reajustarSalario(colab1, 500.00);

        System.out.println("\nNome: " + colab1.getNome());
        System.out.println("Cargo: " + colab1.getCargo());
        System.out.println("Salário: " + colab1.getSalario());

        System.out.println("\nNome: " + colab2.getNome());
        System.out.println("Cargo: " + colab2.getCargo());
        System.out.println("Salário: " + colab2.getSalario());

        System.out.println("\nTotal promovidos: " + rh1.getTotalPromovidos());
        System.out.println("Total reajustes: " + rh1.getTotalSalariosReajustados());

    }
}
