package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
      Anime anime = new Anime("Dragon Ball Z","TV", 12, "Artes Marciais");
      Anime anime2 = new Anime("Dragon Ball Super", "TV", 15, "Artes Marciais");
      Anime anime3 = new Anime();

      anime.imprime();
      anime2.imprime();
      anime3.imprime();
    }
}
