package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
  public static void main(String[] args) {
    // + - / *
    System.out.println("Operadores aritméticos: ");
    int numero01 = 10;
    int numero02 = 20;
    double resultado = ((double)numero01 / numero02); //type casting
    System.out.println("Valor: " + resultado);

    System.out.println("__________________________________");

    // Operador de resto -> MOD %
    System.out.println("Operador módulo captura resto:");
    int resto = 21 % 7;
    System.out.println("Módulo: " + resto);

    System.out.println("__________________________________");

    /** < > | <= |  >= |  == | !=
     * */
    System.out.println("Operador boleano, true ou false: ");
    boolean isDezMaiorQueVinte = 10 > 20;
    boolean isDezMenorQueVinte = 10 < 20;
    boolean isDezIgualVinte = 10 == 20;
    boolean isDezIgualDez = 10 == 10;
    boolean isDezDiferenteDez = 10 != 10;
    System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
    System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
    System.out.println("isDezIgualVinte: " + isDezIgualVinte);
    System.out.println("isDezIgualDez: " + isDezIgualDez);
    System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);

    System.out.println("__________________________________");
  }
}
