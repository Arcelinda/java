package packageJava.test;

import packageJava.JavaOrientadoObject.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); // Criamos uma variavel do tipo Pessoa e referenciamos-las a uma pessoa(objecto), do tipo pessoa
        p1.nome= "Arcy";
        p1.idade= 30;
        p1.sexo='F';

        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.sexo);
        System.out.println(p1);
    }
}
