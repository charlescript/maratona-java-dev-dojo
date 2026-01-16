package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Charles R");
        Jogador jogador2 = new Jogador("Cristiano R");
        Jogador jogador3 = new Jogador("Ronaldo");

        // Jogador[] jogadores = new Jogador[3];
        // Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(int i = 0; i<jogadores.length; i++){
          jogadores[i].imprime();
        }

        /**  foreach
         for(Jogador jogador : jogadores){
          jogador.imprime();
        }
         */
    }
}
