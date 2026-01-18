package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExcercicioAssoc;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome){
      this.nome = nome;
    }

    public Professor(String nome, String especialidade){
        this(nome);
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios){
      this(nome, especialidade);
      this.seminarios = seminarios;
    }

    public void imprime(){
      if(especialidade == null) return;
      System.out.println("Professor: " + getNome() + " é especialista em: " + getEspecialidade());
      for(Seminario seminario : seminarios){
        System.out.println(" e ministrará em: " + seminario.getTitulo());
      }
      System.out.println("\n");
    }

    public void imprime2(){
      if(this.seminarios == null) return;
      System.out.println("## Seminários Cadastrados ##");
      for(Seminario seminario : this.seminarios){
        System.out.println("Professor: " + this.nome);
        System.out.println("Seminário: " + seminario.getTitulo());
        System.out.println("Local: "+ seminario.getLocal().getEndereco());
        if(seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
        System.out.println("** Alunos **");
        for(Aluno aluno : seminario.getAlunos() ){
          System.out.println("Aluno: " + aluno.getNome() + " idade: " + aluno.getIdade());
        }
        System.out.println("//////////////////////////////////");
      }
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
