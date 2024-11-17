package Queue;

import java.util.ArrayList;

public class Queue<T> {
    private final ArrayList<T> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(T value) {
        return list.contains(value);
    }

    public void enqueue(T value) {
        list.add(value);
    }

    public void dequeue() {
        if(!isEmpty())
            list.removeFirst();
    }

    public T peek() {
        try {
            return list.getFirst();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }
}
