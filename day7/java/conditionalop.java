import java.util.Scanner;
public class conditionalop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        if (number > secondNumber) {
            System.out.println(number + " is greater than " + secondNumber);
        } else if (number == secondNumber) {
            System.out.println(number + " is equal to " + secondNumber);
        } else {
            System.out.println(number + " is not greater than " + secondNumber);
        
        scanner.close();
    }
}
    }
