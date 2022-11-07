package com.learn.Node;


 class Node {
    Node left;
    Node right;
    int value;
    public Node(int i) {
        value=i;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }
}

public class BinaryTree {

    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }
    public BinaryTree(int key) {
        this.root = root;
    }
    public BinaryTree() {
        this.root = null;
    }

    Node find(int n) {
        return find(root, n);
    }
    Node find(Node node, int n) {
        if (node == null)
            return null;
        if (node.value == n)
            return node;
        if (node.value > n)
            return find(node.left, n);
        if (node.value < n)
            return find(node.right, n);

        return null;
    }

    Node findIterative(int n) {
        return findIterative(root, n);
    }

    Node findIterative(Node node, int n) {
        Node x = node;
        while (x != null) {
            if (x.value == n)
                return x;
            if (x.value < n ) {
                if (x.right != null)
                    x = x.right;
                else return null;
            }
            if (x.value > n) {
                if (x.left != null)
                    x = x.left;
                else return null;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root= new Node(1);

        tree.root.left= new Node(2);
        tree.root.right= new Node(3);

        tree.root.right.left= new Node(4);
        tree.root.right.right= new Node(-1);

        System.out.println(tree.find(4));


    }

}
