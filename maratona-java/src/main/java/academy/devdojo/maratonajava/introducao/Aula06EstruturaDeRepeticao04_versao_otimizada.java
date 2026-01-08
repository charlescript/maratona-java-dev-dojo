package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04_versao_otimizada {

  // Dado valor de um carro ou bem, descubra em quantas partes ele pode ser parcelado
  // Condição valorParcela >= 1000

  public static void main(String[] args) {
      double valorTotal = 30000;
      for (int parcela = 1; parcela <= valorTotal; parcela++) {
          double valorParcela = valorTotal / parcela;
          if (valorParcela < 1000) {
            break;
          }
          //System.out.println("Parcelar em " + parcela + "x -> R$ " + valorParcela);
          System.out.printf("Parcelado em %d vezes -> R$ %.2f%n", parcela, valorParcela);
      }
  }
}