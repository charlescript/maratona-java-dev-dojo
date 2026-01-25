package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;

public class Desenvolvedor extends Funcionario {

  public Desenvolvedor(String nome, double salario){
    super(nome, salario);
  }

  public String toString(){
    return "Desenvolvedor{ " +
            "nome= " + '\'' +
            "salario= " + '\'' +
            "}";
  }
}
