import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("starting number:");
        int n = scanner.nextInt();
        System.out.println("enter the ending number:");
        int m = scanner.nextInt();
        for (int i = n; i <= m; i++) {
            System.out.println("Iteration: " + i);
        }
        scanner.close();
    }
    
}
