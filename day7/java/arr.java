
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements we want");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println("Accessing elements of array: ");
            for (int j = 0; j < numbers.length; j++) {
                System.out.println(j + " " + numbers[j] + " ");
            }
        System.out.println("Even Numbers Array Elements:");
        for(int i=0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
            System.out.println(numbers[i] + " ");
        }   
    }

        System.out.println("ODD Numbers Array Elements:");
        for(int i=0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
            System.out.println(numbers[i] + " ");
        }   
    
    
    }

        }
    }
