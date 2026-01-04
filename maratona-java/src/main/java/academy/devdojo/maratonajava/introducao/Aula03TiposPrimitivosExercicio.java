package academy.devdojo.maratonajava.introducao;

import java.time.LocalDate;


/**
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

 Eu <nome>, morando no endereço <endereço>,
 confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {

  public static void main(String[] args) {
    String nome = "Charles";
    String endereco = "Rua Vergueiro Steidel, Embaré Santos";
    double salario = (double)2500.00F;
    LocalDate dataRecebimentoSalario = LocalDate.of(2025, 2, 15);
    String relatorio = "Eu " +nome+ ", morando no endereço " +endereco+ ", confirmo que recebi o salário de R$" +salario+ ", na data " +dataRecebimentoSalario;

    System.out.println(relatorio);
  }

}
