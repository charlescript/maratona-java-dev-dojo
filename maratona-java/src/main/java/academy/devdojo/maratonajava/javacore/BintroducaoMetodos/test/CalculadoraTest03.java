package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println("Double -> " + result);

        int result2 = (int) calculadora.divideDoisNumeros(20, 2);  // Casting forçando o retorno Double em Int
        System.out.println("Int com Casting -> " + result2);
    }

}
