package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Ronaldo Fenomeno","Atacante");
        Jogador jogador2 = new Jogador("Neymar JR", "Atacante");
        Time time1 = new Time("Brasil");

        Jogador jogador3 = new Jogador("Cristiano Ronaldo", "Atacante");
        Jogador jogador4 = new Jogador("Pepe", "Zagueiro");
        Jogador jogador5 = new Jogador("João Félix", "Meia" );
        Time time2 = new Time("Portugal");

        Jogador[] jogadoresBrasil = {jogador1, jogador2};
        Jogador[] jogadoresPortugal = {jogador3, jogador4, jogador5};

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        time1.setJogador(jogadoresBrasil);

        jogador3.setTime(time2);
        jogador4.setTime(time2);
        jogador5.setTime(time2);
        time2.setJogador(jogadoresPortugal);

        System.out.println("----------Jogadores----------");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
        jogador4.imprime();
        jogador5.imprime();
        System.out.println("----------Times----------");
        time1.imprime();
        System.out.println("----------Times----------");
        time2.imprime();
    }
}
