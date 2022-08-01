package packageJava;

public class Aula06EstruturaRExerSwithi {
    public static void main(String[] args) {
        //Utilizando o switch dado os valores de 1 a 7, imprime se e dia util ou final
        // de semana
        // Considerando  1 como Dumingo

        byte dia = 10;
        switch (dia){
            case 1 :
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                System.out.println("Opcao invalida");
                break;

        }
    }
}
