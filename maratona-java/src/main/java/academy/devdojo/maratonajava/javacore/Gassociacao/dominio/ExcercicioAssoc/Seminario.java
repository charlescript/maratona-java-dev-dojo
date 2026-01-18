package academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ExcercicioAssoc;

public class Seminario {
  private String titulo;
  private Aluno[] alunos;
  private Local local;

  public Seminario(String titulo, Local local){
    this.titulo = titulo;
    this.local = local;
  }

  public Seminario(String titulo, Local local,  Aluno[] alunos){
    this(titulo, local);
    this.alunos = alunos;
  }

  public void imprime(){
    System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Titulo seminário: " + titulo);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Local seminário: " + local.getEndereco());
    if(alunos == null) return;
    for(Aluno aluno : alunos){
      System.out.println("Nome aluno: " + aluno.getNome());
      System.out.println("Idade aluno: " + aluno.getIdade());
      System.out.println("Seminário: " + aluno.getSeminario().getTitulo());
      System.out.println("----------------------------------");
    }
  }

  public String getTitulo(){
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Aluno[] getAlunos(){
     return alunos;
  }

  public void setAlunos(Aluno[] alunos){
    this.alunos = alunos;
  }

  public Local getLocal(){
    return local;
  }

  public void setLocal(Local local){
    this.local = local;
  }
}
