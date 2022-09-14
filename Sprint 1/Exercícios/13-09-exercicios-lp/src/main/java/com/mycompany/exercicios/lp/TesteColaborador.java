package com.mycompany.exercicios.lp;

public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colab1 = new Colaborador();
        Colaborador colab2 = new Colaborador();
        RecursosHumanos rh1 = new RecursosHumanos();

        colab1.setNome("Yuri");
        colab1.setCargo("Estagiário");
        colab1.setSalario(2000.00);

        colab2.setNome("Diogo");
        colab2.setCargo("Estagiário");
        colab2.setSalario(1800.00);

        System.out.println(colab1.getCargo());
        System.out.println(colab1.getNome());
        System.out.println(colab1.getSalario());

        System.out.println(colab2.getCargo());
        System.out.println(colab2.getNome());
        System.out.println(colab2.getSalario());

        rh1.promoverColaborador(colab1, "Programador JR", 4500.00);
        rh1.promoverColaborador(colab2, "Programador JR", 1000.00);

        rh1.reajustarSalario(colab1, 500.00);

        System.out.println(colab1.getCargo());
        System.out.println(colab1.getNome());
        System.out.println(colab1.getSalario());

        System.out.println(colab2.getCargo());
        System.out.println(colab2.getNome());
        System.out.println(colab2.getSalario());

        System.out.println("Total promovidos: " + rh1.getTotalPromovidos());
        System.out.println("Total reajustes: " + rh1.getTotalSalariosReajustados());

    }
}
