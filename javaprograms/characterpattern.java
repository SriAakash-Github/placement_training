public class characterpattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { 
                char ch = (char) ('A' + j - 1); 
                System.out.print(ch); 
            }
            System.out.println(); 
        }
    }
    
}
