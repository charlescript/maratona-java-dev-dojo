package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

  public static void main(String[] args){
    Computador computador = new Computador("DELL i9", 9700.00);
    Tomate tomate = new Tomate("Italiano", 2.50);
    Televisao tv = new Televisao("Samsung 50\" ", 4200);

    CalculadoraImposto.calcularImposto(computador);
    System.out.println("-----------------------------------");
    CalculadoraImposto.calcularImposto(tomate);
    System.out.println("-----------------------------------");
    CalculadoraImposto.calcularImposto(tv);
  }

}
