package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
  public static void main(String[] args){
     Cliente cliente1 = new Cliente("Tenchihan", TipoCliente.PESSOA_FISICA);
     Cliente cliente2 = new Cliente("Goku", TipoCliente.PESSOA_JURIDICA);
     Cliente cliente3 = new Cliente("Vegeta", TipoCliente.PESSOA_FISICA);
     Cliente cliente4 = new Cliente("Freeza", TipoCliente.PESSOA_JURIDICA);
     Cliente cliente5 = new Cliente("Family Tech", TipoCliente.HOLDING_FAMILIAR);

     System.out.println(cliente1);
     System.out.println(cliente2);
     System.out.println(cliente3);
     System.out.println(cliente4);
     System.out.println(cliente5);

  }
}
