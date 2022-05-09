
/*
import java.io.*;
import java.util.*;

class BinarySearchTreeNode {
    public int data;
    public BinarySearchTreeNode left;
    public BinarySearchTreeNode right;

    BinarySearchTreeNode (int nodeData) {
        this.data = nodeData;
        this.left = null;
        this.right = null;
    }
}

class ABB {
    public BinarySearchTreeNode root;

    public ABB() {
        this.root = null;
    }

    public BinarySearchTreeNode getRoot () {
        return root;
    }

    public void insertNode(int nodeData) {
        this.root = this.insertNode(this.root, nodeData);
    }

    private BinarySearchTreeNode insertNode(BinarySearchTreeNode root, int nodeData) {
        BinarySearchTreeNode nuevo = new BinarySearchTreeNode(nodeData);
        if (root == null) {
            root = new BinarySearchTreeNode(nodeData);
        } else {
            if (nodeData <= root.data) {
                root.left = this.insertNode(root.left, nodeData);
            } else {
                root.right = this.insertNode(root.right, nodeData);
            }
        }

        return root;
    }

    public static void printPostOrder(BinarySearchTreeNode root) {
        if (root == null) {
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void printInOrder(BinarySearchTreeNode root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    public static void printPreOrder(BinarySearchTreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public int search(BinarySearchTreeNode root, int key) {
        if ( root == null) {
            return 0;
        }

        if ( root.data == key) {
            return 1;
        }

        if (root.data < key) {
            return search(root.right, key);
        }

        return search(root.left, key);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ABB root = new ABB();

        for (int i = 0; i < n ; i++) {
            root.insertNode(scan.nextInt());
        }
        int k = scan.nextInt();

        for (int i = 0; i < k; i++) {
            int x = scan.nextInt();
            System.out.println(root.search(root.root, x ));
        }
        root.printInOrder(root.root);
        System.out.println();
        root.printPreOrder(root.root);
        System.out.println();
        root.printPostOrder(root.root);
    }
}

 */
