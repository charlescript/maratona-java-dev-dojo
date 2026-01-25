package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;

public class Desenvolvedor extends Funcionario {

  public Desenvolvedor(String nome, double salario){
    super(nome, salario);
    calculaBonus();
  }

  @Override
  public void calculaBonus(){
    this.salario = this.salario + (this.salario * 0.05);
  }

  public String toString(){
    return "Desenvolvedor{ " +
            "nome='" + nome + '\'' +
            "salario='" + salario + '\'' +
            "}";
  }
}
