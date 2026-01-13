package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Funcionario;

import java.util.Arrays;

public class FuncionarioTest01 {
  public static void main(String[] args){

      Funcionario funcionario01 = new Funcionario();

      funcionario01.setNome("Dominic Toreto");
      funcionario01.setIdade(35);
      funcionario01.setSalarios(new double[]{1000,2500, 3000, 5000, 7300});

      funcionario01.imprime();

      // System.out.println(Arrays.toString(funcionario01.getSalarios()));
  }
}
