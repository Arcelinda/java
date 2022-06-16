package packageJava;

public class Aula04Operadores {
    public static void main(String[]args){
        // + - / *
        int num1 = 18;
        int num2 = 28;
        double resultado = num1 / num2;
        System.out.println(resultado);

        //%
        int resto = 21 % 7;
        System.out.println(resto);
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDez = 10D !=10;

        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte " +isDezIgualVinte);
        System.out.println("isDezDiferenteDez " +isDezIgualVinte);


        //OPERADORES LOGICOS

        // && (AND) || (or)
        int idade = 35;
        float salario = 35000F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 38 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 38 && salario > 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMaiorQueTrinta);

    }
}
