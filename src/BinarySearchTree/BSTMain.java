package BinarySearchTree;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] values = {5,4,3,7,2,9};
        for(int v: values) {
            bst.insert(v);
        }
        System.out.print("PreOrder: ");
        bst.preOrderTraversal();
        System.out.print("\nInOrder: ");
        bst.inOrderTraversal();
        System.out.print("\nPostOrder: ");
        bst.postOrderTraversal();
        System.out.println("\nContains 7? " + bst.search(7));
        System.out.println("Contains 10? " + bst.search(10));
        System.out.println("Total nodes: " + bst.countNodes(bst.root));
        System.out.println("Total sum of nodes: " + bst.reduce(bst.root));
        System.out.println("Height: " + bst.height(bst.root));
        bst.deleteElement(3);
        bst.inOrderTraversal();
        System.out.println("\nMinor: " + bst.getMin(bst.root));
        System.out.println("Minor: " + bst.getMax(bst.root));
        bst.reverseBST();
        bst.inOrderTraversal();
        System.out.println("\nHeight: " + bst.height(bst.root));
        bst.deleteBST();
        System.out.println("\n");
        System.out.println(bst.isEmpty());
        bst.inOrderTraversal();
    }
}
