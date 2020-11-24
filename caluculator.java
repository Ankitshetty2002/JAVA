import java.util.Scanner;

public class SwitchCalculator
{

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter two numbers: ");

    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();

    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = scan.next().charAt(0);

    double result;

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;

      case '-':
        result = num1 - num2;
        break;

      case '*':
        result = num1 * num2;
        break;

      case '/':
        result = num1 / num2;
        break;

      default:
        System.out.printf("You have entered wrong operator");
        return;
    }

    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}