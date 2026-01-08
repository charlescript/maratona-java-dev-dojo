package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {

    // Dado o valor de um carro, descubra em quantas partes ele pode ser parcelado
    // Condição valorParcela >= 1000;
    public static void main(String[] args){
          double valorBem = 30000;
          int count = 0;
          double vlParcela = 0;

          if (valorBem <= 100000){
            vlParcela = valorBem / 100;  // Máximo de 100 meses para pagar ou 8 anos e 3 meses para pagar.
            count = 100;

          } else if (valorBem <= 1000000){
            vlParcela = valorBem / 300;    // Máximo 300 meses ou 25 anos para pagar
            count = 300;

          } else {
            vlParcela = valorBem / 400;  // Máximo de 33 anos e 3 meses a pagar
            count = 400;
          }

          do {
              if(vlParcela < 1000) {
                count -= 3;
                vlParcela = valorBem / count;
                // System.out.println(count + " parcela = "+ vlParcela);
              }else {
                System.out.println("Valor da parcela: " + vlParcela);
                System.out.println("Parcelado em: " + count + " vezes");
                break;
              }

          } while(count >= 0);
    }

}
