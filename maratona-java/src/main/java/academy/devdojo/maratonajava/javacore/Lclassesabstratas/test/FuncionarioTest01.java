package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;

public class FuncionarioTest01 {
  public static void main(String[] args){

      Gerente gerente = new Gerente("Nakaroto", 8000);
      Desenvolvedor desenvolvedor = new Desenvolvedor("Charles", 4800);

      System.out.println(gerente);
      System.out.println(desenvolvedor);
      desenvolvedor.imprime();
  }
}
