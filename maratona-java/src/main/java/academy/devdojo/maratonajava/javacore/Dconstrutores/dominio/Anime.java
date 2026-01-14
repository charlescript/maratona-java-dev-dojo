package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
  private String nome;
  private String tipo;
  private int episodios;
  private String genero;

  public Anime(String nome, String tipo, int episodios, String genero){
    this.nome = nome;
    this.tipo = tipo;
    this.episodios = episodios;
    this.genero = genero;
  }

  public Anime() {

  }

  public void init(String nome, String tipo, int episodios){
      this.nome = nome;
      this.tipo = tipo;
      this.episodios = episodios;
  }

  /** Método init com sobrecarga */
  public void init(String nome, String tipo, int episodios, String genero){
      this.init(nome, tipo, episodios);
      this.genero = genero;
  }

  public void imprime(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Episódio: " + this.episodios);
    System.out.println("Genero: " + this.genero);
    System.out.println("-----------------------------");
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getTipo(){
    return this.tipo;
  }

  public void setEpisodios(int episodios) {
    this.episodios = episodios;
  }

  public int getEpisodios(){
    return this.episodios;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getGenero() {
    return this.genero;
  }

}
