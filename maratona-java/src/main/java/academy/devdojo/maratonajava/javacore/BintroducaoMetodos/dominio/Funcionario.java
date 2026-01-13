package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {
  private String nome;
  private int idade;
  private double[] salarios;
  private double media;

  Locale localeBR = new Locale("pt", "BR");
  NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double[] getSalarios(){
    return this.salarios;
  }

  public void setSalarios(double[] salarios){
    this.salarios = salarios;
  }

  public double getMedia(){
    return media;
  }


  public void imprime(){
    System.out.println("---------------Employees------------------------");
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);

      if(salarios == null) {
        return;
      }

      System.out.print("Salários: ");
      for (double salario : salarios) { //foreach para cada giro
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
      this.media = (soma / salarios.length);
      System.out.println("\nMédia dos "+salarios.length + " salários: " + dinheiro.format(media));
  }

}
