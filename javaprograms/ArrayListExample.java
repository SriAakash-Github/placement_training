import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList: " + numbers);
        System.out.println("This is a unsorted Arraylist" + numbers);
        Collections.sort(numbers);
        System.out.println("This is a sorted Arraylist" + numbers);
        // using binary search
        int pos = Collections.binarySearch(numbers, 20);
        System.out.println("Position of 20 in the sorted ArrayList: " + pos);
        // using min() and max() methods
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Minimum value in the ArrayList: " + min);
        System.out.println("Maximum value in the ArrayList: " + max);
        // using shuffle() method
        Collections.shuffle(numbers);
        System.out.println("ArrayList after shuffling: " + numbers);

    }

    
}
