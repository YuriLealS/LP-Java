package exercicios.pkg23.pkg08;

public class Metodo {
    
    Double media(Double num1, Double num2){
        return (num1 + num2) / 2;
    }
    
    Double qtdSalMin (Double salario){
        return salario / 1100.0;
    }
    
    String classes (Double qtdSal){
        String classe = "";
        if (qtdSal < 2.0) {
            classe = "Classe E";
        } else if (qtdSal >= 2.0 && qtdSal < 4.0 ) {
            classe = "Classe D";
        } else  if (qtdSal >= 4.0 && qtdSal < 10.0) {
           classe = "Classe C";
        } else if (qtdSal >= 10.0 && qtdSal < 20.0) {
            classe = "Classe B";
        } else if (qtdSal >= 20.0) {
            classe = "Classe A";
        }
        return classe;
    }
    
    String classificaIdade (Integer idade){
        String classificacao = "";
        if (idade <= 2) {
            classificacao = "Bebê";
        } else if (idade > 2 && idade <= 11) {
            classificacao = "Criança";
        } else if (idade > 11 && idade <= 19) {
            classificacao = "Adolescente";
        } else if (idade > 19 && idade <= 30) {
            classificacao = "Jovem";
        } else if (idade > 30 && idade <= 60) {
            classificacao = "Adulto";
        } else {
            classificacao = "Idoso";
        } return classificacao;
    }
}
