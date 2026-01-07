package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {

  public static void main(String[] args){
      // Utilizando Switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
      // Considerando 1 como domingo

    int dia = 8;

    if(dia < 1 || dia > 7){
      System.out.println("Valor inserido deve ser de 1 a 7.");
      System.exit(0);
    }

    switch(dia) {
      case 1:
        System.out.println("Final de semana.");
      break;

      case 7:
        System.out.println("Final de semana.");
      break;

      default:
        System.out.println("Dia útil");
    } // Fim switch

  } // Fim método main

}// Fim class
