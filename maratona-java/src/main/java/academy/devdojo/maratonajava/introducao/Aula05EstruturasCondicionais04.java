package academy.devdojo.maratonajava.introducao;

/** I want to know how much i have to pay in the Netherlands 2025 based o my annual salary */
// Intervalo Salarial Anual 	Alíquota de Imposto sobre o Salário
/** Até €38.441 ->	35,82%  |
    De €38.441 a €76.817 ->	37,48%  |
    Acima de €76.817 ->	49,5%  | */

public class Aula05EstruturasCondicionais04 {

  public static void main(String[] args){
      double salary = 77000;
      double taxedSalary = 0;
      double taxAmount = 0;

      double firstContribuition = 0.3582;
      double secondContribuition = 0.3748;
      double thirdContribuition = (0.495);
      double taxRate;

      if(salary <= 38441) {
          taxRate = firstContribuition;
      } else if(salary <= 76817){
          taxRate = secondContribuition;
      } else {
          taxRate = thirdContribuition;
      }

      taxedSalary = salary - (salary * taxRate);
      taxAmount = salary * taxRate;

      System.out.println("Salário bruto: €:" + salary);
      System.out.println("Imposto retido: €:" + taxAmount);
      System.out.println("Salário liquido: €:" + taxedSalary);
  }
}
