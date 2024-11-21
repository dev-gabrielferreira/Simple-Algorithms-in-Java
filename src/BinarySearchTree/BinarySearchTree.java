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
            System.out.print(r.value + " ");
            preOrder(r.left);
            preOrder(r.right);
        }
    }

    public void preOrderTraversal() {
        preOrder(root);
    }

    private void inOrder(Node r) {
        if(r != null) {
            inOrder(r.left);
            System.out.print(r.value + " ");
            inOrder(r.right);
        }
    }

    public void inOrderTraversal() {
        inOrder(root);
    }

    private void postOrder(Node r) {
        if(r != null) {
            postOrder(r.left);
            postOrder(r.right);
            System.out.print(r.value + " ");
        }
    }

    public void postOrderTraversal() {
        postOrder(root);
    }
}
