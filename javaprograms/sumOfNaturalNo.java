import java.util.Scanner;

// public class sumOfNaturalNo {
//     static double averageOfNaturalNo(int sum, int num) {
//         return (float) sum / num;
//     }
public class sumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        System.out.println("Average = " + (float)sum / n);

        sc.close();
    }
}
