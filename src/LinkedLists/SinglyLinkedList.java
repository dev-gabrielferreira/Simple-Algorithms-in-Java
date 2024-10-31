package LinkedLists;

public class SinglyLinkedList<T> implements LinkedLists<T>{
    private Node<T> head;
    private int size = 0;

    @Override
    public void insertStart(T data){
        Node<T> newNode = new Node<>(data);

        if(isEmpty())
            newNode.next = null;
        else
            newNode.next = head;

        this.head = newNode;
        size++;

    }

    @Override
    public void insertEnd(T data){
        Node<T> el = new Node<>(data);

        if(isEmpty())
            head = el;
        else {
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = el;
        }

    }

    @Override
    public boolean search(T value){
        Node<T> current = head;

        while(current != null) {
            if(current.data == value)
                return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public void reverse(){
        Node<T> curr = head;
        Node<T> prev = null;

        while(curr != null) {
            Node<T> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        this.head = prev;
    }

    @Override
    public void delete(T target){
        Node<T> curr = head;

        while(curr.next != null){
            if(curr.next.data == target){
                Node<T> tmp = curr.next;
                curr.next = tmp.next;
                break;
            }else{
                curr = curr.next;
            }
        }
    }

    @Override
    public void print(){
        Node<T> current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    @Override
    public void printInReverse(){
        reverse();
        print();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
