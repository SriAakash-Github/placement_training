import java.util.Scanner;
public class areaofTriangle {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        System.out.println("Enter the length of triangle.");  
        double length = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
        double volume = (1.0/2.0) * base * height * length;
        System.out.println("The volume of the triangle is: " + volume);
        scanner.close();
    }
}
