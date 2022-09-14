package com.mycompany.exercicios.lp;
public class RecursosHumanos {
    
    private Integer totalPromovidos = 0;
    private Integer totalSalariosReajustados = 0;
    
    public void reajustarSalario(Colaborador colab, Double valorReajuste){
        
        colab.setSalario(colab.getSalario() + valorReajuste);
        totalSalariosReajustados++;
    }
    
    public void promoverColaborador(Colaborador colab, String novoCargo, Double novoSalario) {
        if (colab.getSalario() <= novoSalario) {
            
            colab.setSalario(novoSalario);
            colab.setCargo(novoCargo);
            totalPromovidos++;
        }else
            System.out.println("Operação inválida");
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    
}
