/*
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class SinglyLinkedListNode {
    public int data;
    public LinkedListNodeSingly next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public LinkedListNodeSingly head;
    public LinkedListNodeSingly tail;

    public SinglyLinkedList() {
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

class SinglyLinkedListPrintHelper {
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

class ResultZ {


     * Complete the 'bin2dec' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_SINGLY_LINKED_LIST head as parameter.



     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *


    public static int bin2dec(LinkedListNodeSingly head) {
        ArrayList<Integer> list = new ArrayList<>();
        int numDec = 0;

        while (head != null) {
            list.add(head.data);
            head = head.next;
        }
        Collections.reverse(list);

        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            numDec += ( list.get(i) ) * Math.pow(2,num);
            num++;
        }

        return numDec;
    }

}

public class Bin2DecHK {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedListSingly list = new LinkedListSingly();
        int listCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, listCount).forEach(i -> {
            try {
                int listItem = Integer.parseInt(bufferedReader.readLine().trim());

                list.insertNode(listItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = ResultZ.bin2dec(list.head);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/

