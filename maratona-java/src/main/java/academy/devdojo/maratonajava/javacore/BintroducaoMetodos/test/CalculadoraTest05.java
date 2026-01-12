package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {

      Calculadora calculadora = new Calculadora();
      int[] numeros = {10,20,15,30,50};

      //calculadora.somaArray(new int[] {1,2,3,4,5});
      calculadora.somaArray(numeros);
      calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
