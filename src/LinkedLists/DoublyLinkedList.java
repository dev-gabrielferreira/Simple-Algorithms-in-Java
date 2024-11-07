package LinkedLists;

public class DoublyLinkedList<T> implements LinkedLists<T> {
    private Node<T> head = null;
    private int size = 0;

    public void insertEnd(T value) {
        Node<T> el = new Node<>(value);
        if(isEmpty()){
            head = el;
            size++;
            return;
        }

        Node<T> current = head;
        while(current.next != null){
            current = current.next;
        }

        el.prev = current;
        current.next = el;
        size++;
    }

    public void insertStart(T value) {
        Node<T> el = new Node<>(value);
        if(head == null){
            head = el;
            size++;
            return;
        }

        Node<T> tmp = head;
        head = el;
        el.next = tmp;
        tmp.prev = el;
        size++;
    }

    public void print() {
        Node<T> current = head;

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void printInReverse() {
        Node<T> current = head;

        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

        public boolean isEmpty() {
            return this.size == 0;
        }

        public boolean search(T value){
            Node<T> current = head;

            while(current != null) {
                if(current.data == value)
                    return true;
                current = current.next;
            }
            return false;
        }

        public void reverse(){
            Node<T> current = head;
            Node<T> prev = null;

            while(current != null) {
                Node<T> next = current.next;
                current.prev = current;
                current.next = prev;
                prev = current;
                current = next;
            }

            head = prev;
        }

        public void delete(T target) {
            Node<T> current = head;

            if(head.data == target) {
                head = head.next;
                head.prev = null;
                return;
            }

            while(current.next != null) {
                if (current.next.data == target) {
                    Node<T> tmp = current.next;
                    if (current.next.next != null) {
                        current.next = current.next.next;
                        current.next.prev = tmp;
                        break;
                    }
                    current.next = null;
                } else {
                    current = current.next;
                }
            }
    }
}
