package packageJava;

public class Aula05EstruturasCondicionais {

    public static void main(String[] args){

        //Sintaxe
        int idade = 15;
 //Verefica se o utilizador pode ou nao comprar uma bebida alcolica
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcolica  ");
        }else {
            System.out.println("Nao autorizado a comprar bebida");
        }


        if(!isAutorizadoComprarBebida){ //! negacao

        }
        System.out.println("Nao Autorizado a comprar bebida alcolica");
    }
}
