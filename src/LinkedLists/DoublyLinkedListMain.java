package LinkedLists;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.insertEnd(1);
        list.insertEnd(2);
        list.insertStart(3);
        list.insertStart(0);
        list.delete(3);
//        list.print();
//        list.printInReverse();
        list.reverse();
        list.print();
    }
}
