public class HashMapEx {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        
        // Adding elements to the HashMap
        map.put("Alice", 1);
        map.put("Avi", 2);
        map.put("Anjali", 3);
        
        // Displaying the HashMap
        System.out.println("HashMap: " + map);
        
        // Accessing an element
        System.out.println("Value for 'Alice': " + map.get("Alice"));
        
        // Checking if a key exists
        System.out.println("Contains key 'Alice': " + map.containsKey("Alice"));
        
        // Removing an element
        map.remove("Anjali");
        System.out.println("After removing 'Anjali': " + map);
        // Iterating through the HashMap
        System.out.println("Iterating through HashMap:");
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // update the value of a key
        map.put("Alice", 4);
        map.put("avi",10);
        System.out.println("After updating 'Alice': " + map);

    }
}
