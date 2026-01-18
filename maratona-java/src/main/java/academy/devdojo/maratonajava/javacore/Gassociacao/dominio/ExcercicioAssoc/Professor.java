package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExcercicioAssoc;

public class Professor {
    String nome;
    String especialidade;
    Seminario[] seminarios;

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios){
      this(nome, especialidade);
      this.seminarios = seminarios;
    }

    public String getNome(){
      return nome;
    }

    public void setNome(String nome){
      this.nome = nome;
    }

    public String getEspecialidade(){
      return especialidade;
    }

    public void setEspecialidade(String especialidade){
      this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios(){
      return seminarios;
    }

    public void setSeminarios(Seminario[] seminario){
      this.seminarios = seminario;
    }
}
