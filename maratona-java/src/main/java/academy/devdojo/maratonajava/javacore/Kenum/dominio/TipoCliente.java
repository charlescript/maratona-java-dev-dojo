package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
   PESSOA_FISICA(1, "Pessoa Física"),
   PESSOA_JURIDICA(2, "Pessoa Jurídica"),
   HOLDING_FAMILIAR(3, "Holding Familiar");

   private int valor;
   private String nomeRelatorio;

   TipoCliente(int valor, String nomeRelatorio){
      this.valor = valor;
      this.nomeRelatorio = nomeRelatorio;
   }

   public int getValor(){
      return valor;
   }

   public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
      for(TipoCliente tipoCliente : values() ){
         if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
            return tipoCliente;
         }
      }
      return null;
   }

   public String getNomeRelatorio(){
      return nomeRelatorio;
   }

}
