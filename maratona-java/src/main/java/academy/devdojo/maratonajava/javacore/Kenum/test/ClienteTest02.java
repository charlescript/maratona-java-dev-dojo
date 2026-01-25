package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente2;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest02 {
  public static void main(String[] args){
    Cliente2 cliente1 = new Cliente2("Marieta", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
    Cliente2 cliente2 = new Cliente2("Libra", TipoCliente.PESSOA_JURIDICA, TipoPagamento.PIX);
    Cliente2 cliente3 = new Cliente2("BTP", TipoCliente.HOLDING_FAMILIAR, TipoPagamento.CREDITO);

    System.out.println(cliente1);
    System.out.println(cliente2);
    System.out.println(cliente3);
    System.out.println("Desconto: " + TipoPagamento.BOLETO.calcularDesconto(100));
    System.out.println("Desconto2: " + TipoPagamento.PIX.calcularDesconto(100));

    TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
    TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");

    System.out.println("TipoCliente1: " + tipoCliente.getNomeRelatorio());
    System.out.println("TipoCliente2: " + tipoCliente2);

  }
}
