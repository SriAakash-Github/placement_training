
import java.util.Scanner;

public class simplecalc {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter first number: ");
         int number1 = scanner.nextInt();

         System.out.print("Enter second number: ");
         int number2 = scanner.nextInt();

         System.out.println("Addition: " + (number1 + number2));
         System.out.println("Subtraction: " + (number1 - number2));
         System.out.println("Multiplication: " + (number1 * number2));
         System.out.println("Division: " + (number1 / number2));

            System.out.println("Enter principal amount: ");
            float principal = scanner.nextFloat();
            System.out.println("Enter rate of interest: ");
            float rate = scanner.nextFloat();
            System.out.println("Enter time (in years): ");
            float time = scanner.nextFloat();
            float simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple Interest: " + simpleInterest);

         scanner.close();
    }
}
