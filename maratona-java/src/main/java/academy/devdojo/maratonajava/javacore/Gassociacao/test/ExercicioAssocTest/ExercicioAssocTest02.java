package academy.devdojo.maratonajava.javacore.Gassociacao.test.ExercicioAssocTest;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExcercicioAssoc.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExcercicioAssoc.Seminario;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExcercicioAssoc.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExcercicioAssoc.Aluno;


public class ExercicioAssocTest02 {
  public static void main(String[] args){

    Local local1 = new Local("Av. Brig. Faria Lima, 3064 - Itaim Bibi, São Paulo - SP, 01451-001");

    Aluno aluno1 = new Aluno("Dexter", 20);
    Aluno aluno2 = new Aluno("Dimmy Neutron", 25);
    Aluno aluno3 = new Aluno("Vegeta", 30);
    Aluno aluno4 = new Aluno("Goku", 29);

    Aluno[] alunosSeminario1 = {aluno1, aluno2};
    Aluno[] alunosSeminario2 = {aluno3, aluno4};

    Seminario seminario1 = new Seminario("Java e seus paradigmas.", local1, alunosSeminario1);
    Seminario seminario2 = new Seminario("Arquitetura REST APIs em Java", local1, alunosSeminario2);

    aluno1.setSeminario(seminario1);
    aluno2.setSeminario(seminario1);
    aluno3.setSeminario(seminario2);
    aluno4.setSeminario(seminario2);

    Seminario[] seminarios_1 = {seminario1};
    Seminario[] seminarios_2 = {seminario1, seminario2};

    Professor professor1 = new Professor("Antonio", "Java", seminarios_1);
    Professor professor2 = new Professor("Chapolim", "POO", seminarios_2);

    professor1.imprime2();
    System.out.println("#############################");
    professor2.imprime2();
  }
}
