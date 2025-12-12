package PatternProbs;
public class pattern1 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) { // Loop for each row
            for (int j = 1; j <= i; j++) { // Loop for printing stars in each row
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); 
        }
    }
}
