package packageJava;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[]args){

        //idade < 15 categoria Infantil
        //idade >= 15 && idade < 18 categoria Juvenil
        // idade >=18 categoria adulto

        int idade = 17;
        String categoria;

        if(idade < 15){
            categoria = "categoria Infantil";
            System.out.println("categoria Infantil");

        }else if (idade >= 15 && idade <18){
            categoria = "categoria Jovem";
            System.out.println("Categori Juvenil");
        }else {
            categoria = "categoria adulto";
            System.out.println("categoria adulto");
        }
    }
}
