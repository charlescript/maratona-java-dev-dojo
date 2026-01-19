package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

  private double salario;

  public Funcionario (String nome){
    super(nome);
  }

  public Funcionario(String nome, String cpf){
    super(nome, cpf);
  }

  public Funcionario(String nome, String cpf, Endereco endereco){
    super(nome, cpf, endereco);
  }

  public Funcionario(String nome, String cpf, Endereco endereco, double salario){
    this(nome, cpf, endereco);
    this.salario = salario;
  }

  @Override
  public void imprime(){
    super.imprime();
    System.out.println("Salário: RS " + this.salario);
  }

  public void relatorioPagamento() {
    System.out.println("Eu " + this.nome + " recebi um salário de " + this.salario);
  }

  public double getSalario(){
      return salario;
    }

    public void setSalario(double salario){
      this.salario = salario;
    }
}
