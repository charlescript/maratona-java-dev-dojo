package academy.devdojo.maratonajava.javacore.Gassociacao.test.ExercicioAssocTest;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExcercicioAssoc.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExcercicioAssoc.Seminario;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExcercicioAssoc.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExcercicioAssoc.Aluno;


public class ExercicioAssocTest01 {
   public static void main(String[] args){

      Local local1 = new Local("Av. Brig. Faria Lima, 3064 - Itaim Bibi, São Paulo - SP, 01451-001");

      Seminario seminario1 = new Seminario("Java e seus paradigmas.", local1);
      Seminario seminario2 = new Seminario("Arquitetura REST APIs em Java", local1);

      Professor professor1 = new Professor("Antonio", "Java");
      Professor professor2 = new Professor("Chapolim", "POO");

      Aluno aluno1 = new Aluno("Dexter", 20, seminario1);
      Aluno aluno2 = new Aluno("Dimmy Neutron", 25, seminario1);
      Aluno aluno3 = new Aluno("Vegeta", 30, seminario2);
      Aluno aluno4 = new Aluno("Goku", 29, seminario2);

      Aluno[] alunosSeminario1 = {aluno1, aluno2};
      Aluno[] alunosSeminario2 = {aluno3, aluno4};
      seminario1.setAlunos(alunosSeminario1);
      seminario2.setAlunos(alunosSeminario2);

      Seminario[] professor1Seminarios = {seminario1};
      Seminario[] professor2Seminarios = {seminario1, seminario2};
      professor1.setSeminarios(professor1Seminarios);
      professor2.setSeminarios(professor2Seminarios);

      seminario1.imprime();
      seminario2.imprime();
      System.out.println("##############################");
      System.out.println("##############################");
      professor1.imprime();
      professor2.imprime();
   }
}
