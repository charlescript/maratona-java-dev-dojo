package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
   public static void main(String[] args){
      abreConexao();
      abreConexao2();
   }

   public static String abreConexao(){
      try{
         System.out.println("Abrindo arquivo");
         //throw new RuntimeException("Na escrita do arquivo houve erro...");
         System.out.println("Escrevendo dados no arquivo");
         return "conexão aberta";
      } catch (Exception e){
         e.printStackTrace();
      }finally {
         System.out.println("Fechando recurso liberado pelo SO\n");
      }
      return null;
   }

   public static void abreConexao2(){
      try{
         System.out.println("Abrindo arquivo");
         //throw new RuntimeException("Na escrita do arquivo houve erro...");
         System.out.println("Escrevendo dados no arquivo");
         throw new RuntimeException();
      }finally {
         System.out.println("Fechando recurso liberado pelo SO");
      }
   }

}
