package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocoinicializacao.dominio.Anime;

public class AnimeTest {
   public static void main(String[] args){
     Anime anime = new Anime("One Punch Man");

     System.out.println(anime.getNome() + "\n Episodios: ");
     for(int episodios : anime.getEpisodios()){
       System.out.print(episodios + " ");
     }

   }
}
