package Stack;

import java.util.ArrayList;

public class Stack<T> {
    private final ArrayList<T> list = new ArrayList<>();

    public void push(T value) {
        list.add(value);
    }

    public void pop() {
        if(!isEmpty())
            list.removeLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public T peek() {
        return list.getLast();
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    public boolean contains(T value) {
        return list.contains(value);
    }
}
