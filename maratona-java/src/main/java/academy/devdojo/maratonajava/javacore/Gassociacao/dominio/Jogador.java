package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private String posicao = "A definir";
    private Time time;

    public Jogador(String nome){
        this.nome = nome;
    }

    public Jogador(String nome, String posicao){
      this(nome);
      this.posicao = posicao;
    }

    public void imprime() {
        System.out.println("Jogador: " + this.nome);
        System.out.println("Posição: " + this.posicao);
        if(time != null) {
          System.out.println("Time: " + time.getNome());
        }

       System.out.println("--------------------------------");
    }

    public Time getTime(){
      return time;
    }

    public void setTime(Time time){
      this.time = time;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getPosicao(){
      return posicao;
    }

    public void setPosicao(){
      this.posicao = posicao;
    }

}
