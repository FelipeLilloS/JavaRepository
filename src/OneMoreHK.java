/*
import java.io.*;
import java.util.ArrayList;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class NododeLinkedListSingly {
    public int data;
    public NododeLinkedListSingly next;

    public NododeLinkedListSingly(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class LinkedListSinggly {
    public NododeLinkedListSingly head;
    public NododeLinkedListSingly tail;

    public LinkedListSinggly() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        NododeLinkedListSingly node = new NododeLinkedListSingly(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListImprimir {
    public static void printList(NododeLinkedListSingly node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}

class RespuestaSolucionario {


     * Complete the 'OneMore' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST head as parameter.



     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *


    public static NododeLinkedListSingly OneMore(NododeLinkedListSingly head) {
        ArrayList<Integer> Numbers = new ArrayList<>();
        NododeLinkedListSingly temp = head;

        while(temp != null) {
           Numbers.add(temp.data);
           temp = temp.next;
        }

        System.out.println("------ Arreglo Inicial -------");
        for (int value: Numbers) {
            System.out.print( value + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        ArrayList<Integer> NumbersPlusOne = new ArrayList<>();
        int plus = 1;
        for (int i = 0; i < Numbers.size(); i++) {
            int numplus = Numbers.get(i);
            numplus += plus;
            NumbersPlusOne.add(numplus);
        }

        System.out.println("------ Arreglo PlusOne -------");
        for (int value: NumbersPlusOne) {
            System.out.print( value + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        int sizeNumbers = NumbersPlusOne.size();
        System.out.println("Largo Arreglo: " + sizeNumbers);
        int NumFinal = NumbersPlusOne.get(sizeNumbers-1);
        System.out.println("Numero Final: " + NumFinal);

        int num = 0;
        for (int i = Numbers.size() - 1; i >= 0; i--) {
            if( NumbersPlusOne.get(i) == 10 ) {
                int numPlus= NumbersPlusOne.get(i);
                NumbersPlusOne.set( i,num );
                NumbersPlusOne.set( i-1,numPlus+plus );
            }
        }

        System.out.println("--------------");
        for (int p: NumbersPlusOne) {
            System.out.print( p + " ");
        }

        return temp;
    }

}

public class OneMoreHK {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedListSinggly l1 = new LinkedListSinggly();

        int l1Count = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, l1Count).forEach(i -> {
            try {
                int l1Item = Integer.parseInt(bufferedReader.readLine().trim());

                l1.insertNode(l1Item);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        NododeLinkedListSingly result = RespuestaSolucionario.OneMore(l1.head);

        SinglyLinkedListImprimir.printList(result, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

 */