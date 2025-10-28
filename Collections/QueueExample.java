package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue example with LinkedList
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        System.out.println("Queue: " + queue);
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Queue after removal: " + queue);
        System.out.println("Head of the queue: " + queue.peek());
    }
}
