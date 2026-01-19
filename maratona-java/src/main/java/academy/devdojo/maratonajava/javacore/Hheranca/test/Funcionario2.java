package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class Funcionario2 extends Pessoa {

    public void imprime(){
      /** Acesso direto ao atributo [ nome ], da classe [ Pessoa ] pelo fato de extender a classe [ Pessoa ]
       e o modificador de acesso ser [ protected ] */
      this.nome = "Funcionario2";

      System.out.println(this.nome);
    }

    public static void main(String[] args){
       Funcionario2 f = new Funcionario2();
       f.imprime();
    }

}
