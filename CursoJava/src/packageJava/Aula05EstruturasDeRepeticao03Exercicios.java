package packageJava;

public class Aula05EstruturasDeRepeticao03Exercicios {
    public static void main(String[] args) {
        //Imprima os primeiros 25 numeros de um dado valor.
        //EX 50
        int valorMax = 50;
        for(int i = 0; i<valorMax;i++){
            if(i > 25){
                break;//comando para parar um laco de repeticao
            }
            System.out.println(i);
        }

    }
}
