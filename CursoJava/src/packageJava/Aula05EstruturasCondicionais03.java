package packageJava;

public class Aula05EstruturasCondicionais03 {

    public static void main(String[]args){

        //Exercicio Recebendo uma mensagem se demos
        //Fazer doacao ou nao

        //Doar se o Salario > 5888

        double salario = 6888;
        //String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        //String mensagemNovoDoar = "Ainda nao tenho condicao para doa";

        //Operador Ternario
        //(condicao) ? verdadeiro:falso

        String resultado = salario > 5888 ? "Eu vou doar 588 pro DevDojo" : "Ainda nao tenho condicoes para doar";

        /*if(salario > 5888){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNovoDoar;
        }
        System.out.println(resultado);*/
    }
}
