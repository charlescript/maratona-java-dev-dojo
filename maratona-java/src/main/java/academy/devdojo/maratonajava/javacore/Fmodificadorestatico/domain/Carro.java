package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;  // O static faz com que esse valor esteja ligado diretamente a classe, ou seja todos os objetos instanciados herdaram esse valor

    public Carro(String nome, double velocidadeMaxima){
      this.nome = nome;
      this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
      System.out.println("-----------------------------");
      System.out.println("Nome: " + getNome());
      System.out.println("Velocidade máxima: " + getVelocidadeMaxima());
      System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public static double getVelocidadeLimite(){
      return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
      Carro.velocidadeLimite = velocidadeLimite;
    }


    public String getNome(){
      return nome;
    }

    public void setNome(String nome){
      this.nome = nome;
    }

    public double getVelocidadeMaxima(){
      return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima){
      this.velocidadeMaxima = velocidadeMaxima;
    }

}
