import java.util.Scanner;
public class multiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number and range for which you want the multiplication table: ");
        int number = scanner.nextInt();
        int range = scanner.nextInt();
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
    }
}
