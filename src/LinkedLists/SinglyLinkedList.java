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
            newNode.next = head.next;

        this.head = newNode;
        size++;

    }

    @Override
    public void insertEnd(T data){}
    @Override
    public T search(T value){return value;}
    @Override
    public void reverse(T head){}
    @Override
    public void delete(T target){}

    @Override
    public void print(){
        Node<T> current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public void printInReverse(T head){}

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
