public class arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int [] arr = new int[25];
         for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        System.out.println("Array elements:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        } 
    }
}