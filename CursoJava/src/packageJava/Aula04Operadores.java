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


        //OPERADORES LOGICOS:

        // && (AND) || (or)
        int idade = 29;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade > 38 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 38 && salario > 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMaiorQueTrinta);


    // Operador OR (Desde que uma das condicoes seja verdadeira retorna true)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation|| valorTotalContaPoupanca > valorPlaystation;
    System.out.println("isPlaystationCincoCompravel " +isPlaystationCincoCompravel);


    //Operadores de atribuicao = += -= *= /= %=
        double bonus = 1800;//1800
        bonus += 1000;//2800
        bonus -= 1000;//2800-100=1800
        bonus *= 1000;//
        bonus /= 1000;
        bonus %= 1000;
        System.out.println(bonus);

    // ++ --
        int contador = 0;
        contador +=1; //contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        System.out.println(contador);

    }
}
