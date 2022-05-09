/*
class BinarySearchTreeNode {
    public int data;
    public BinarySearchTreeNode left;
    public BinarySearchTreeNode right;

    BinarySearchTreeNode (int nodeData) {
        this.data = nodeData;
        this.left = null;
        this.right = null;
    }

    public String toString() {
        return "El valor es: " + data;
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


    //altura arbol
    int altura;
    String[] niveles;

    public void imprimirNivel() {
        niveles = new String[altura + 1];

        imprimirNivel(root, 0);
        for (int i = 0; i < niveles.length; i++) {
            System.out.println(niveles[i] + " En nivel: " + i);
        }
    }

    private void imprimirNivel(BinarySearchTreeNode pivote, int nivel2) {
        if (pivote != null) {
            niveles[nivel2] = pivote.data + ", " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
            imprimirNivel(pivote.right, nivel2 + 1);
            imprimirNivel(pivote.left, nivel2 + 1);
        }
    }
}

public class RecorrerPorNivelArbol {
}

 */
