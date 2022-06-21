package packageJava;

public class Aula05EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        //while, do while, for
        //while sintaxe: o que colocamos la dentro, precisa de res em boolean
        int count = 0;
        int i =0;

        while (count <10){
            System.out.println(count);
            count++;
        }
        //do while
        do {
            System.out.println("dentro do do-while"+count);
            count++;
        }while (count<10);

        //For
        for(i=0;i<10;i++){
            System.out.println("For "+i);
        }
    }
}
