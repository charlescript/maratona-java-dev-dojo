package academy.devdojo.maratonajava.javacore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio.Carro;

/**
 * Crie uma classe carro com os seguintes atributos
 * Nome, Modelo, Ano
 * Em seguida, crie dois objetos distintos e imprima seus valores.
 * */

public class CarroTest01 {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setNome("Lamborghini gallardo");
        carro1.setModelo("SuperLeggera (LP 570-4)");
        carro1.setAno(2012);

        carro2.setNome("Ferrari");
        carro2.setModelo("812 Superfast");
        carro2.setAno(2023);

        carro2 = carro1;


        System.out.println("Carro1: \nNome: " + carro1.getNome() +
                            "\nModelo: " + carro1.getModelo() +
                            "\nAno: " + carro1.getAno()
        );

        System.out.println("################################\n");

        System.out.println("Carro2: \nNome: " + carro2.getNome() +
                         "\nModelo: " + carro2.getModelo() +
                         "\nAno: " + carro2.getAno()
        );


    }
}
