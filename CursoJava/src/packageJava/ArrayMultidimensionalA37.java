package packageJava;

public class ArrayMultidimensionalA37 {
    public static void main(String[] args) {

        // Fazer refencia do array
        int [][] arryInt = new int[3][];
        //for(int[] arrayBase: arryInt){
        //  for(int num:arrayBase){
        // System.out.println(num);
        //  }
        // }
// Aqui percorremos um array de 1 dimensao
       /* int []notas = new int[3];
        notas[0] = 10;
        notas[2] = 11;
        for(int i =0; i< notas.length; i++){
            System.out.println(notas[i]);
        }
        for(int nota:notas){
            System.out.println(nota);
        }*/
        //Foreach
        // Aqui percorremos um array de 2 dimensao
        int [][] alunos = new int[4][];
        for(int []aluno: alunos){
            System.out.println(aluno);
        }
    }

}
