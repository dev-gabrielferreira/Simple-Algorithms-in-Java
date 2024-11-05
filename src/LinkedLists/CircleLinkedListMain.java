package LinkedLists;

public class CircleLinkedListMain {
    public static void main(String[] args) {
        CircleLinkedList<Integer> list = new CircleLinkedList<Integer>();
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertStart(3);
        list.print();
        System.out.println(list.search(3));
        System.out.println(list.search(4));
        list.delete(3);
        list.delete(2);
        list.delete(1);
        list.delete(4);
        list.print();
        list.printInReverse();
    }
}
