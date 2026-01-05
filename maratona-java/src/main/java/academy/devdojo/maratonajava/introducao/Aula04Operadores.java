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

    /** Operadores lógicos
     *  && -> (AND) E
     *  OR -> OU
     *  !  -> (NOT) negação
     */
    int idade = 29;
    float salario = 3500F;
    boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
    boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
    System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
    System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

    System.out.println("__________________________________");

    // Utilizando opeardor OR -> ||
    double valorTotalContaCorrente = 200;
    double valorTotalContaPoupanca = 30000;
    float valorPlaystation = 5000F;

    boolean isPlaystationCincoCompravel = (valorTotalContaCorrente > valorPlaystation) || (valorTotalContaPoupanca > valorPlaystation);
    System.out.println("Comprar playstation 5: " + isPlaystationCincoCompravel);

    System.out.println("__________________________________");



  }
}
