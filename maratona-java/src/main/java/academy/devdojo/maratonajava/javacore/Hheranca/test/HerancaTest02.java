package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço de memórioa para o objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com falores default ou o que for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor é executado da superclasse
      // 6 - Alocado espaço de memórioa para o objeto da subclasse
      // 7 - Cada atributo de subclasse é criado e inicializado com falores default ou o que for passado
      // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
      // 9 - Construtor é executado da subclasse

    public static void main(String[] args){
       Endereco endereco = new Endereco("Rua 18 das oliveiras", "11654-877");
       Funcionario funcionario = new Funcionario("Dexter", "12345678-91", endereco, 16500.00);
    }
}
