package packageJava;

public class Aula02TiposPrimitivos {
    public static void main(String[]args){
        // int, double, float, char, bute, short, long, boolean
        int idade = 10;
        double salario = 2500;
        float salarioFloat = (float) 2500;
        short idadeShort = 10;
        char sexo = 'F';
        boolean verdadeiro = true;
        String nome = "Arcy";


        System.out.println("A idade e " +idade+ "anos");/*ele apanha o valor alocado na
        na memoria, quando nao utilizamos as aspas duplas*/
        System.out.println(true);
        System.out.println("char " +sexo);
        System.out.println("oi meu nome e   " +nome);
    }

}