package com.mycompany.exercicios.lp;

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
    
//    String classificaIdade(Integer idade){
//        String classificacao = "";
//        if (idade <= 2) {
//            classificacao = "Bebê";
//        } else if (idade > 2 && idade <= 11) {
//            classificacao = "Criança";
//        } else if (idade > 11 && idade <= 19) {
//            classificacao = "Adolescente";
//        } else if (idade > 19 && idade <= 30) {
//            classificacao = "Jovem";
//        } else if (idade > 30 && idade <= 60) {
//            classificacao = "Adulto";
//        } else {
//            classificacao = "Idoso";
//        } return classificacao;
//}
    
        public static void classificaIdade(Integer idade){
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
        } System.out.println(classificacao);
}
        
        Double calcularDesconto (Double valor, Integer qtdd){
            if (qtdd == 1) {
                valor = (valor - valor * 0.1) * qtdd;
            } else if (qtdd == 2) {
                valor = (valor - valor * 0.2) * qtdd;                
            } else if (qtdd >= 3) {
                valor = (valor - valor * 0.3) * qtdd;                
            }
            return valor;
        }
        
        void exibirNotaFiscal (Double valor, Integer qtdd, Double mostrar){
            System.out.println("-----------------------");
            System.out.println(String.format("Valor do produto R$ %.2f", valor));
            System.out.println("Quantidade: " + qtdd);
            System.out.println("-----------------------");
            System.out.println(String.format("Valor com desconto: R$ %.2f",mostrar));
        }
        
       public static void calculaPesoIdeal(String sexo, Double altura){
        Double ideal = 0.0;
        if ("f".equals(sexo)) {
            ideal = (62.1 * altura) - 44.7;
        } else if ("m".equals(sexo)) {
            ideal = (72.7 * altura) - 58;
        }System.out.println(String.format("Seu peso ideal é %.2f" ,ideal));
       }
       
       public static void verificarPrimo (Integer num) {
           Integer resto = 0;
           if (num > 0) {
               for (int i = 1; i <= num; i++) {
                   if (num % i == 0) {
                   resto++;
                   }
               }
            if (resto > 2) {
               System.out.println("Não é primo");
           } else {
               System.out.println("É primo");
           }
           }
       }
}
