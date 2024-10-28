package LinkedLists;

public interface LinkedLists<T> {
    void insertStart(T data);
    void insertEnd(T data);
    T search(T value);
    void reverse(T head);
    void delete(T target);
    void print();
    void printInReverse(T head);
    boolean isEmpty();
}
