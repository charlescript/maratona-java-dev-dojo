package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest01 {
    public static void main(String[] args){
        Endereco endereco = new Endereco("Rua 3", "01234-207");

        Pessoa pessoa = new Pessoa("Liriane", "123.456.789-77", endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Mr Robot", "123.456.789-77", endereco, 17500.00);
        funcionario.imprime();

        funcionario.relatorioPagamento();
    }
}
