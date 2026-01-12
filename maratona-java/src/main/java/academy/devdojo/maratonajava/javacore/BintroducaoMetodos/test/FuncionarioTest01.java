package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
  public static void main(String[] args){

      Funcionario funcionario01 = new Funcionario();

      funcionario01.nome = "Dominic Toreto";
      funcionario01.idade = 35;
      funcionario01.salarios = new double[]{1000,2500, 3000, 5000, 7300};

      funcionario01.imprime();

  }
}
