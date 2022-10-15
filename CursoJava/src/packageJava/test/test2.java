package packageJava.test;

import packageJava.JavaOrientadoObject.Pessoa;

public class test2 {
    public static void main(String[] args) {
        Pessoa p2 = new Pessoa();// Criar Object sem referencia
        System.out.println(p2.idade);
        System.out.println(p2.nome);
        System.out.println(p2.sexo);
    }
}
