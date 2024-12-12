package BinarySearchTree;

public class BinarySearchTree {
    public Node root = null;

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

    public boolean search(int value) {
        Node curr = root;

        while(curr != null) {
            if(value > curr.value)
                curr = curr.right;
            else if(value < curr.value)
                curr = curr.left;
            else
                return true;
        }

        return false;
    }

    private void reverse(Node root) {
        if(root != null) {
            reverse(root.left);
            reverse(root.right);
            Node tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
    }
    public void reverseBST() {
        reverse(root);
    }

    public void deleteBST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private Node delete(int target, Node node) {
        if (node == null) return null;

        if (target < node.value) {
            node.left = delete(target, node.left);
        } else if (target > node.value) {
            node.right = delete(target, node.right);
        } else {
            if (node.left == null || node.right == null) {
                return (node.left != null) ? node.left : node.right;
            }

            Node successor = getSuccessor(node);
            node.value = successor.value;
            node.right = delete(successor.value, node.right);
        }
        return node;
    }

    private Node getSuccessor(Node node) {
        Node tmp = node.right;
        while (tmp != null && tmp.left != null) {
            tmp = tmp.left;
        }
        return tmp;
    }

    public void deleteElement(int target) {
        this.root = delete(target, root);
    }

    public int height(Node root) {
        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }
}
