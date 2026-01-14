package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
      Anime anime = new Anime();

      anime.init("Dragon Ball Super", "TV", 12);
      anime.init("Dragon Ball Super", "TV", 12, "Artes Marciais");

      anime.imprime();
    }
}
