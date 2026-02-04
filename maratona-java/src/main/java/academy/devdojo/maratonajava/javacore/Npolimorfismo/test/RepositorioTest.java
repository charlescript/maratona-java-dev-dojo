package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
   public static void main(String[] args){
      RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
      repositorioBancoDeDados.salvar();

      Repositorio repositorio = new RepositorioBancoDeDados();
      repositorio.salvar();

      Repositorio repositorio2 = new RepositorioArquivo();
      repositorio2.salvar();

      Repositorio repositorio3 = new RepositorioMemoria();
      repositorio3.salvar();

      List<String> list = new LinkedList<>();
      list.add("Goku");
      list.add("Vedita");
      list.add("Kuririn");
      System.out.println(list);
   }
}
