public class QueueExample {
    public static void main(String[] args) {
        // Example usage of Queue
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        
        // Adding elements to the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        
        // Displaying the queue
        System.out.println("Queue: " + queue);
        
        // Removing an element from the queue
        int removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);
        
        // Displaying the queue after removal
        System.out.println("Queue after removal: " + queue);

        // Checking the front element of the queue
        int frontElement = queue.peek();

        // accessing the front element
        System.out.println("Front Element: " + frontElement);
    }

    
}
