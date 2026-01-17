package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome){
      this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores){
        this(nome);
        this.jogadores = jogadores;
    }

    public void imprime(){
        System.out.println("Time: " + this.nome);
        if(jogadores == null) return;
        for(int i = 0; i < jogadores.length; i++){
            System.out.println("Jogador: " + jogadores[i].getNome());
        }
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Jogador[] getJogadores(){
        return jogadores;
    }

    public void setJogador(Jogador[] jogadores){
        this.jogadores = jogadores;
    }


}
