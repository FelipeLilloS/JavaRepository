/*

import java.util.*;
import java.io.*;

class NodeC {
    NodeC left;
    NodeC right;
    int data;

    NodeC(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class ProfundidadArbol {


    class Node
        int data; // la clave del nodo
        Node left; // referencia al hijo izquierdo
        Node right; // referencia al hijo derecho

public static int getHeight(Node root) {
        // Escriba su codigo aqui.
        if(root == null){
        return 0;
        }
        int Izquierda = getHeight(root.left);
        int Derecha = getHeight(root.right);
        return (Izquierda > Derecha) ? (Izquierda + 1) : (Derecha + 1);
        }

public static Node insert(Node root, int data) {
        if(root == null) {
        return new Node(data);
        } else {
        Node cur;
        if(data <= root.data) {
        cur = insert(root.left, data);
        root.left = cur;
        } else {
        cur = insert(root.right, data);
        root.right = cur;
        }
        return root;
        }
        }

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
        int data = scan.nextInt();
        root = insert(root, data);
        }
        scan.close();
        int height = getHeight(root);
        System.out.println(height);
        }
        }

 */