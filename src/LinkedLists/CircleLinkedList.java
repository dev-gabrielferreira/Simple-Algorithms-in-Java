package LinkedLists;

public class CircleLinkedList<T> implements LinkedLists<T> {
    private Node<T> head = null;
    private int size = 0;

    public void insertEnd(T target) {
        Node<T> el = new Node<>(target);
        if(isEmpty()){
            head = el;
        }else{
            Node<T> current = head;
            while(current.next != head){
                current = current.next;
            }
            current.next = el;
        }

        el.next = head;
        size++;
    }

    public void insertStart(T target) {
        Node<T> el = new Node<>(target);
        if(isEmpty()){
            head = el;
            el.next = head;
        }else{
            Node<T> current = head;
            while(current.next != head) {
                current = current.next;
            }
            Node<T> tmp = head;
            head = el;
            el.next = tmp;
            current.next = head;
        }
        size++;
    }

    public boolean search(T value) {
        Node<T> current = head;

        while(current.next != head) {
            if(current.data == value)
                return true;

            current = current.next;
        }
        return false;
    }

    public void delete(T target) {
        if(size == 1) {
            head = null;
            size--;
            return;
        }

        if(head.data == target) {
            Node<T> current = head;

            while(current.next != head){
                current = current.next;
            }

            head = head.next;
            current.next = head;
            size--;
            return;
        }

        Node<T> current = head;
        while(current.next != head) {
            if(current.next.data == target) {
                Node<T> tmp = current.next;
                current.next = tmp.next;
                size--;
                break;
            } else {
                current = current.next;
            }
        }
    }

    public void print() {
        if(head == null) return;

        Node<T> current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void reverse() {
        Node<T> current = head;
        Node<T> prev = null;
        do {
            Node<T> next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        } while(current != head);

        head.next = prev;
        head = prev;
    }

    public void printInReverse() {
        reverse();
        print();
    }
}
