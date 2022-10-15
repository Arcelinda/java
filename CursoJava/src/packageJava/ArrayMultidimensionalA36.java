package packageJava;

public class ArrayMultidimensionalA36 {
    public static void main(String[] args) {
        // Faz o array q representa os meses e
        // o segundo representa dias
        // Posicao do priimeiro depende do segundo
        // A Multi sao arrays de varias dimensoes

        int []dias[] = new int [3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i< dias.length;i++){
            for (int j = 0;j< dias[0].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-----------------------Aula Foritch----------------------");
        for(int [] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }

        }
    }
}
