package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {

  public static void main(String[] args){
    divisao(1,0);
    System.out.println("Código finalizado");
  }

  /**
   *
   * @param a -> dividendo
   * @param b -> divisor não pode ser 0
   * @return
   * @throws IllegalArgumentException caso b seja zero
   */

  private static int divisao(int a, int b) throws IllegalArgumentException {
    if(b == 0) {
      throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
    }
    return a/b;
  }

}
