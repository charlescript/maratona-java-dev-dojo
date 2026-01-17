package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
   private String nome;
   private Professor[] professores;

   public Escola(String nome){
      this.nome = nome;
   }

   public Escola(String nome, Professor[] professor){  // Sobrecarga construtor
     this(nome); // Referencio o primeiro construtor de 1 parametro
     this.professores = professor;
   }

   public void imprime(){
     System.out.println("Escola: " + this.nome);
     if(professores == null) return;

     for(int i = 0; i<professores.length; i++){
       System.out.println("Professor: " + professores[i].getNome());
     }
   }

   public String getNome(){
      return nome;
   }

   public void setNome(String nome){
      this.nome = nome;
   }

   public Professor[] getProfessores(){
     return professores;
   }

   public void setProfessor(Professor[] professores){
      this.professores = professores;
   }
}
