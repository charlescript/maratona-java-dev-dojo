package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
  public static void main(String[] args){
      Funcionario funcionario = new Funcionario("Zoro", 2500);
      Gerente gerente = new Gerente("Nakaroto", 5000);

      System.out.println(funcionario);
      System.out.println(gerente);
  }
}
