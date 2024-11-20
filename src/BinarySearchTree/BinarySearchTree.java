package BinarySearchTree;

public class BinarySearchTree {
    private Node root = null;

    public void insert(int val) {
        Node el = new Node(val);
        Node curr = root;
        if(root == null) {
            root = el;
            return;
        }

        while(true) {
            if(val < curr.value) {
                if(curr.left == null) {
                    curr.left = el;
                    break;
                } else {
                    curr = curr.left;
                }
            } else {
                if(curr.right == null) {
                    curr.right = el;
                    break;
                } else {
                    curr = curr.right;
                }
            }
        }
    }

    private void preOrder(Node r) {
        if(r != null) {
            System.out.println(r.value);
            preOrder(r.left);
            preOrder(r.right);
        }
    }

    public void preOrderTraversal() {
        preOrder(root);
    }
}
