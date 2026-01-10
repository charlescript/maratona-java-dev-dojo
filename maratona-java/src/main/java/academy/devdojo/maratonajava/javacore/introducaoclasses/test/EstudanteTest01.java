package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
      Estudante estudante1 = new Estudante();
      estudante1.nome = "Dovahkiin";
      estudante1.idade = 29;
      estudante1.sexo = 'M';

      System.out.println("Nome: " + estudante1.nome);
      System.out.println("Idade: " + estudante1.idade);
      System.out.println("Sexo: " + estudante1.sexo);
      System.out.println(estudante1);
    }
}
