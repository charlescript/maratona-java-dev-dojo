package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {
  public String nome;
  public int idade;
  public double[] salarios;

  Locale localeBR = new Locale("pt", "BR");
  NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

  public void imprime(){
    System.out.println("---------------Employees------------------------");
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);

      if(salarios == null) {
        return;
      }

      System.out.print("Salários: ");
      for (double salario : salarios) {
        System.out.print(dinheiro.format(salario) + " | ");
      }
      imprimeMediaSalario();
  }// Fim imprime

  public void imprimeMediaSalario(){
      if(salarios == null){
        return;
      }
      double soma = 0;
      for(double salary: salarios){
        soma += salary;
      }
      double mediaSalarial = soma / salarios.length;
      System.out.println("\nMédia dos "+salarios.length + " salários: " + dinheiro.format(mediaSalarial));
  }

}
