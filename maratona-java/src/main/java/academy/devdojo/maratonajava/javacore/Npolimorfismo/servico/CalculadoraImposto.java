package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

  public static void calcularImposto(Produto produto){
    System.out.println("Relatório de imposto: ");
    double imposto = produto.calcularImposto();
    System.out.println("Nome produto: " + produto.getNome());
    System.out.println("Valor: " + produto.getValor());
    System.out.println("Imposto recolhido: " + imposto);
  }

}
