package collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Zaur");
        queue.offer("Vit");
        queue.offer("Zan");
        queue.offer("Pau");
        queue.offer("Rau");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println("first " + queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek()); // null
        System.out.println(queue.poll()); // null
    }
}
