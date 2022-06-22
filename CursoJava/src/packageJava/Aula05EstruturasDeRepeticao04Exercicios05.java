package packageJava;

public class Aula05EstruturasDeRepeticao04Exercicios05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descobre em quantos ele pode ser parcelado
        // Condicao valorParcela >= 1000
        // i = parcela
        double valorTotal = 30000;
        for (int parcela=(int) valorTotal;parcela>=1; parcela--){

            double valorParcela = valorTotal/parcela;
            if(valorParcela < 1000){
                continue;
            }

            System.out.println("Parcela"+parcela+ "R$" +valorParcela);
        }
    }
}
