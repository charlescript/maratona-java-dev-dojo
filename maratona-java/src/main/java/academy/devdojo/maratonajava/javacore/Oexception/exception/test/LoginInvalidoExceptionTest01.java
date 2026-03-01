package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {

   public static void main(String[] args) {

      try {
        logar();
      } catch(LoginInvalidoException e) {
        e.printStackTrace();
      }
   }

   private static void logar() throws LoginInvalidoException {
     Scanner teclado = new Scanner(System.in);
     String usernameDb = "Goku";
     String senhaDb = "ssj";

     System.out.println("Usuário: ");
     String usernameDigitado = teclado.next();

     System.out.println("Senha: ");
     String senhaDigitada = teclado.next();

     if( !usernameDb.equals(usernameDigitado) || !senhaDb.equals(senhaDigitada) ){
        throw new LoginInvalidoException("Usuário ou senha inválidos");
     }

     System.out.println("Usuário logado com sucesso");

   }
}
