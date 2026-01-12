package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a, b);

        System.out.println("\nDentro CalculadoraTeste04");
        System.out.println("Num1: " + a);
        System.out.println("Num2: " + b);
    }

}
