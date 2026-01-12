package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;

public class EstudanteTest02 {
  public static void main(String[] args){
      Estudante estudante01 = new Estudante();
      Estudante estudante02 = new Estudante();
      Estudante estudante03 = new Estudante();

      estudante01.nome = "Vegeta";
      estudante01.idade = 37;
      estudante01.sexo = 'M';

      estudante02.nome = "Goku";
      estudante02.idade = 36;
      estudante02.sexo = 'M';

      estudante03.nome = "Kuririn";
      estudante03.idade = 32;
      estudante03.sexo = 'M';

      estudante01.imprime();
      estudante02.imprime();
      estudante03.imprime();
  }
}
