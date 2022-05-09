/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

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

class BinarySearchTree {
    public BinarySearchTreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insertNode(int nodeData) {
        this.root = this.insertNode(this.root, nodeData);
    }

    private BinarySearchTreeNode insertNode(BinarySearchTreeNode root, int nodeData) {
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
}

class BinarySearchTreePrintHelper {
    public static void printInorder(BinarySearchTreeNode root, String sep, BufferedWriter bufferedWriter) throws IOException {
        if (root == null) {
            return;
        }

        BinarySearchTreePrintHelper.printInorder(root.left, sep, bufferedWriter);

        if (root.left != null) {
            bufferedWriter.write(sep);
        }

        bufferedWriter.write(String.valueOf(root.data));

        if (root.right != null) {
            bufferedWriter.write(sep);
        }

        BinarySearchTreePrintHelper.printInorder(root.right, sep, bufferedWriter);
    }
}

class Respuesta {


     * Complete the 'kthSmallest' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_BINARY_SEARCH_TREE root
     *  2. INTEGER k



     * For your reference:
     *
     * BinarySearchTreeNode {
     *     int data;
     *     BinarySearchTreeNode left;
     *     BinarySearchTreeNode right;
     * }
     *

    public static int cont = 0;
    public static int valor;

    public static int kthSmallest(BinarySearchTreeNode root, int k) {
        Map<Integer,Integer> DatoF = new HashMap<>();
        if (root == null) {
            return 0;
        }
        kthSmallest(root.left,k);
        cont++;
        if( cont == k) {
            valor = root.data;
        }

        // System.out.println(root.data + " " + cont + "| ");
        kthSmallest(root.right,k);
        return valor;
    }

}

public class KElementoMenor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        BinarySearchTree root = new BinarySearchTree();

        int rootCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, rootCount).forEach(i -> {
            try {
                int rootItem = Integer.parseInt(bufferedReader.readLine().trim());

                root.insertNode(rootItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Respuesta.kthSmallest(root.root, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/