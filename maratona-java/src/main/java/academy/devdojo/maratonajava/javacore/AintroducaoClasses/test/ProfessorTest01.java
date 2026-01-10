package academy.devdojo.maratonajava.javacore.AintroducaoClasses.test;

import  academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio.Professor;

public class ProfessorTest01 {

      public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Pierluigi Piazzi";
        professor.idade = 72;
        professor.sexo = 'M';

        System.out.println("\nNome professor: " + professor.nome +
                           "\nIdade: " + professor.idade +
                           "\nSexo: " + professor.sexo
        );

      }

}
