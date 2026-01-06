package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

public class Aula05EstruturasCondicionais02 {


    public static void main(String[] args){
      // idade < 15 categoria infatil
      // idade >= 15 && idade < 18 juvenil
      // idade >= 18 adulto
      int idade = 20;
      String categoria = "";

      if(idade < 15) {
          categoria = "Categoria Infantil";
      } else if(idade >= 15 && idade < 18){
          categoria = "Categoria Juvenil";
      } else {
          categoria = "Categoria Adulto";
      }

      System.out.println(categoria);
    }

}
