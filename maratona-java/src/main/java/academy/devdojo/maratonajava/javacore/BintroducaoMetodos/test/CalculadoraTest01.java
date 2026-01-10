package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();

    calculadora.somaDoisNumeros();
    calculadora.subtraiDoisNumeros();
    System.out.println("Finalizando CalculadoraTeste01");
  }
}
