import java.util.Scanner;

public class areaofcircle {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        double radius, area, circumference;

        radius = scanner.nextDouble();

        area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);

        System.out.println("Now we calculate the circumference");

        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of the circle is: " + circumference);

        scanner.close();
    }
}

