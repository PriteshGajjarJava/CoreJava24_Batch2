import java.util.*;
class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(13);
        queue.add(4);
        queue.add(29);
        queue.add(16);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}