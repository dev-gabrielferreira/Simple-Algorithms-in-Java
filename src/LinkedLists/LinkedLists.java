package LinkedLists;

public interface LinkedLists<T> {
    void insertStart(T data);
    void insertEnd(T data);
    boolean search(T value);
    void reverse();
    void delete(T target);
    void print();
    void printInReverse();
    boolean isEmpty();
}
