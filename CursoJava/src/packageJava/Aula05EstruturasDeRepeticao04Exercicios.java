package packageJava;

public class Aula05EstruturasDeRepeticao04Exercicios {
    public static void main(String[] args) {
        // Dado o valor de um carro, descobre em quantos ele pode ser parcelado
        // Condicao valorParcela >= 1000
        // i = parcela
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal/parcela;

                    if(valorParcela >= 1000){
                        System.out.println("Parcela"+parcela+ "R$" +valorParcela);
                    }else{
                        break;
                    }
            System.out.println("Parcela" +valorParcela);
        }

    }
}
