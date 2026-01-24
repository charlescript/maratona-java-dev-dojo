package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
  public static void main(String[] args){
     Cliente cliente1 = new Cliente("Marieta", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
     Cliente cliente2 = new Cliente("Libra", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.PIX);
     Cliente cliente3 = new Cliente("BTP", TipoCliente.HOLDING_FAMILIAR, Cliente.TipoPagamento.CREDITO);

     System.out.println(cliente1);
     System.out.println(cliente2);
     System.out.println(cliente3);

  }
}
