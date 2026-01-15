package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
      Anime anime = new Anime("Dragon Ball Z","TV", 12, "Artes Marciais", "Akira Toryama");

      anime.imprime();
    }
}
