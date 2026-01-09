package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args){

        int[] array = {1,2,3};
        int[][] arrayInt = new int[4][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[] {1,2,3};
        arrayInt[2] = new int[] {1,2,3,4,5,6};
        arrayInt[3] = array;

        int[][] arrayInt2 = { {0,0}, {1,2,3}, {1,2,3,4,5,6} };  //   =   int[][] arrayInt2 = new int[3][];

        for(int[] arrBase: arrayInt){
            System.out.println("\n---------------");
            for(int num : arrBase){
              System.out.print(num + "  ");
            }
        }

        System.out.println("\n####################\n\n  ArrayInt2");

        for(int[] arrBase: arrayInt2){
          System.out.println("\n---------------");
          for(int num : arrBase){
            System.out.print(num + "  ");
          }
        }

    }
}
