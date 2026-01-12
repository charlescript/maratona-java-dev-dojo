package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;
public class ImpressoraEstudante {

  public void imprime(Estudante estudante){
    System.out.println("-----------PRINTER------------------");

    System.out.println(estudante.nome);
    System.out.println(estudante.sexo);
    System.out.println(estudante.idade);

    estudante.nome = "Gohan";
  }
}
