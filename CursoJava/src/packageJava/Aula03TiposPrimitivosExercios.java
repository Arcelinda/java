package packageJava;
/* Crie variaveis para os campos descritos abaixo entre <>
    <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereco <endereco>,
    confirmo que recebi o salario de <salario>, na data <data>

*/
public class Aula03TiposPrimitivosExercios {
    public static void main(String[]args){
        //Variaveis
        String nome = "Arcelinda";
        String morada = "Boa-Entradinha";
        double salario = 50.50;
        String dataRecebimento = "01/05/2022";

        //System.out.println("Eu" +nome", morando no endereco" +morada"confirmo que recebi o salario de " +salario+ ", na data +data");
        String relatorio = "Eu, "+nome+", morando no endereco "+morada+ "confirmo que recebi o salario "+salario+", na data "+dataRecebimento;

        System.out.println(relatorio);
    }


}
