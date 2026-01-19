package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest01 {
    public static void main(String[] args){
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01234-207");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Liriane");
        pessoa.setCpf("123.456.789-77");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Mr Robot");
        funcionario.setCpf("123.456.789-77");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(17500.00);

        funcionario.imprime();
    }
}
