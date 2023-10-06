package Theory.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue" + numbers);

        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        int removedNumber = numbers.poll();
        System.out.println("Removed element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);

    }
}
