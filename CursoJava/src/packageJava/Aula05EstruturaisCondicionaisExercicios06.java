package packageJava;

public class Aula05EstruturaisCondicionaisExercicios06 {
    public static void main(String[] args) {
        //Exercicios
        //Utilizando o Switch, Dados os valores de 1 a 7, imprima se e dia util ou final de semana
        //Considerando o Domingo

    byte dia = 5;
    switch (dia){
        case 1:
        case 7:
            System.out.println("FDS");
            break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
            System.out.println("Dias utis");
            break;
        default:
            System.out.println("Opcao Invalida");
            break;


    }


    }
}
