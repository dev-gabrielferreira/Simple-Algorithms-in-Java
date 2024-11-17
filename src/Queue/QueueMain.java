package Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        System.out.println(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Size: " + queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.contains(3));
        System.out.println(queue.isEmpty());
        queue.dequeue();
        System.out.println("Size: " + queue.size());
        queue.clear();
        System.out.println(queue.isEmpty());

    }
}
