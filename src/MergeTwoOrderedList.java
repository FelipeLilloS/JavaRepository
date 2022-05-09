/*
import java.io.*;
import java.util.LinkedList;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import java.util.*;

class LinkedListNodeSingly {
    public int data;
    public LinkedListNodeSingly next;

    public LinkedListNodeSingly(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class LinkedListSingly {
    public LinkedListNodeSingly head;
    public LinkedListNodeSingly tail;

    public LinkedListSingly() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        LinkedListNodeSingly node = new LinkedListNodeSingly(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }
        this.tail = node;
    }

}

class PrintList {

    public static void printList(LinkedListNodeSingly node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;
            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

}

class Solucionario {


     * Complete the 'MergeTwoOrderedList' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST l1
     *  2. INTEGER_SINGLY_LINKED_LIST l2



     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *


    public static LinkedListNodeSingly MergeTwoOrderedList(LinkedListNodeSingly l1, LinkedListNodeSingly l2) {
        LinkedListNodeSingly ListaOrdenada = null;

        if(l1 == null) { // Si mi lista1 uno esta vacia, pasa a la lista2 //
            return l2;
        } else if(l2 == null) { // Si mi lista1 uno esta vacia, pasa a la lista2 //
            return l1;
        }

                                // Ordena de menor a mayor //
        if(l1.data < l2.data) { // Si mi l1 es menor, lo agrega  //
            ListaOrdenada = l1;
            l1 = l1.next;
        } else {  // Si mi l2 es menor, lo agrega  //
            ListaOrdenada = l2;
            l2 = l2.next;
        }

        LinkedListNodeSingly Puntero_Nodo = ListaOrdenada; // ¿? //
        while( l1 != null && l2 != null ) {
            if(l1.data < l2.data) {
                Puntero_Nodo.next = l1; // Agrega l1 y cambia a l1.next //
                l1 = l1.next;
            } else {
                Puntero_Nodo.next = l2; // Agrega l2 y cambia a l2.next //
                l2 = l2.next;
            }
            Puntero_Nodo = Puntero_Nodo.next; // Cuando l1 y l2 son iguales ? //
        }

        if( l1 == null ) {
            Puntero_Nodo.next= l2;
        } else {
            Puntero_Nodo.next= l1;
        }
        return ListaOrdenada;
    }

}

public class MergeTwoOrderedList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedListSingly l1 = new LinkedListSingly();

        int l1Count = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, l1Count).forEach(i -> {
            try {
                int l1Item = Integer.parseInt(bufferedReader.readLine().trim());

                l1.insertNode(l1Item);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        LinkedListSingly l2 = new LinkedListSingly();

        int l2Count = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, l2Count).forEach(i -> {
            try {
                int l2Item = Integer.parseInt(bufferedReader.readLine().trim());

                l2.insertNode(l2Item);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        LinkedListNodeSingly result = Solucionario.MergeTwoOrderedList(l1.head, l2.head);

        PrintList.printList(result, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/