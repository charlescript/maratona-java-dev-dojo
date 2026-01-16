package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
  private String nome;
  /**private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12}; */
  private static int[] episodios;
  // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
  // 1 - Alocado espaço de memórioa para o objeto
  // 2 - Cada atributo de classe é criado e inicializado com falores default ou o que for passado
  // 3 - Bloco de inicialização é executado
  // 4 - Construtor é executado

  static { // Bloco de inicialização
      System.out.println("Dentro do bloco de inicialização estático 1 ");
      episodios = new int[100];
      for(int i = 0; i<episodios.length; i++){
        episodios[i] = i+1;
      }
  }

  static {
    System.out.println("Dentro do bloco de inicialização estático 2");
  }

  static {
    System.out.println("Dentro do bloco de inicialização estático 3");
  }

  {
    System.out.println("Dentro do bloco de inicialização não estático");
  }

  public Anime(String nome){
    this.nome = nome;
  }


  public Anime(){
      /**
      for(int i = 0; i < Anime.episodios.length; i++){
        System.out.print(episodios[i] + ", ");
      }
      */

      System.out.println("--------------------------------------");

      for(int episodios : Anime.episodios){
        System.out.print(episodios + ", ");
      }
      System.out.println();
  }


  public String getNome(){
    return this.nome;
  }

  public int[] getEpisodios(){
    return this.episodios;
  }
}
