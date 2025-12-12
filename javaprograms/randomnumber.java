public class randomnumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("Random Number: " + randomNum);
        double randomDouble = Math.random() * (max - min) + min;
        System.out.println("Random Double: " + randomDouble);
    }
}
