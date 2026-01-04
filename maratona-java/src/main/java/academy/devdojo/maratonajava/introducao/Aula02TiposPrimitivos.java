package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long numeroGrande = (long)155.23;
        double salarioDouble = 2500.0D;
        float salarioFloat = (float) 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; /**
         * Traduz o decimal para tabela ASCII
         */


        System.out.println("Idade: " + age + " anos.");
        System.out.println(falso);
        System.out.println("CHAR: " + caractere);
        System.out.println("Age: type cast: " + age);
        System.out.println("Número grande: " + numeroGrande);
    }
}
