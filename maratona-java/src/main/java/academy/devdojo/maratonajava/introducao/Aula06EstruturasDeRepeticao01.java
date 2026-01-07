package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
  public static void main(String[] args) {

    // while, do while, forq

    int count = 0;
    while(count < 10) {
      System.out.println("-> " + (++count) );

      // count = count + 1;
      // count += 1;
      //count++;
    }

    System.out.println("-------------------------------");

    count = 0;
    do {
        System.out.println("Dentro Do-While: "  + (++count) );
    } while(count < 10);

    System.out.println("-------------------------------");

    for(count = 0; count <= 10; count++) {
        System.out.println("FOR: " + count);
    }

  }
}
