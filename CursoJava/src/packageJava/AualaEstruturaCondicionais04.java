package packageJava;

public class AualaEstruturaCondicionais04 {
    public  static void main(String[]args){
//Exercicio queremos saber quando vamos pagar na Holanda em 2020,
// baseado no meu salario aual



        //Variaveis
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;

        //Condicao
        if(salarioAnual <= 34.713){
            valorImposto = salarioAnual* primeiraFaixa;
        }else if(salarioAnual >= 34.713 && salarioAnual<=68.588) {
           valorImposto = salarioAnual*segundaFaixa;
        }else {
            valorImposto = salarioAnual*terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
