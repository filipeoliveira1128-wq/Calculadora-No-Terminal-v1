import java.util.Scanner;

public class CalculadoraNoTerminal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean restart = true;
    while (restart){

    System.out.println("CALCULADORA NO TERMINAL");

    int actionUser;

    do {
      System.out.println("Escolha um número para [1]adição, [2]subtração, [3]multiplicação [4]divisão.");
      actionUser = scanner.nextInt();


      if (actionUser < 1 || actionUser > 4) {
        System.out.println("Por favor, escolha um número válido de 1 a 4.");
      }

    } while (actionUser < 1 || actionUser > 4);

    switch (actionUser) {
      case 1:
        System.out.println("ADIÇÃO");
        System.out.print("Digite um número: ");
        int addend1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int addend2 = scanner.nextInt();

        int sum = addend1 + addend2;

        System.out.println(addend1 + " + " + addend2 + " = " + sum);
        break;

      case 2:
        System.out.println("SUBTRAÇÃO");
        System.out.print("Digite um número: ");
        int minuend = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int subtrahend = scanner.nextInt();

        int difference = minuend - subtrahend;

        System.out.println(minuend + " - " + subtrahend + " = " + difference);
        break;

      case 3:
        System.out.println("MULTIPLICAÇÃO");
        System.out.print("Digite um número: ");
        int factor1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int factor2 = scanner.nextInt();

        int product = factor1 * factor2;

        System.out.println(factor1 + " x " + factor2 + " = " + product);
        break;

      case 4:
        System.out.println("DIVISÃO");
        System.out.print("Digite um número: ");
        int dividend = scanner.nextInt();

        int divisor;
        do {
          System.out.print("Digite outro número: ");
          divisor = scanner.nextInt();

          if (divisor == 0){
            System.out.print("Não é possível dividir por 0. Tente um número válido. ");
          }
        } while (divisor == 0);

        double quotient = (double) dividend / divisor;

        System.out.println(dividend + " ÷ " + divisor + " = " + quotient);
        break;
      default:
        System.out.println("Número inválido.");

    }
      System.out.print("Fazer novo cálculo? (s/n): ");
      String calculateAgain = scanner.next();

      if (calculateAgain.equalsIgnoreCase("s")){
        restart = true;
      }
      else {
        restart = false;
        System.out.println("ENCERRANDO...");

      }
    }
    scanner.close();
  }
}
