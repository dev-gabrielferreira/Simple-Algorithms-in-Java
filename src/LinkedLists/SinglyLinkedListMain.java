package LinkedLists;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insertStart(1);
        list.insertStart(2);
        list.insertEnd(3);
        list.print();
        System.out.println(list.search(3));
        System.out.println(list.search(4));
        list.reverse();
        list.print();
        list.printInReverse();
        list.delete(3);
        list.print();
    }
}
