/*
import java.util.*;

class rArraySort {
    private ArrayList<Integer> array;
    private Random generator;

    public rArraySort() {
        generator = new Random();
        array = new ArrayList<Integer>();
    }

    public ArrayList<Integer> get() {
        return array;
    }

    public void set(ArrayList<Integer> arr) {
        array = arr;
    }

    public void generate() {
        int i = 0;
        for (i = 0; i < 10; i++) {
            array.add(i, (generator.nextInt() % 20));
        }
    }

    public void sortArray() {
        // Ordenar el arreglo con una forma de ordenar //
        int[] aux = new int[array.size()];
        int temp = 0;

        for (int z = 0; z < array.size(); z++) {
            aux[z] = array.get(z);
        }

        for (int i = 0; i < aux.length; i++) {
            for (int j = 1; j < (aux.length - i); j++) {
                if (aux[j - 1] < aux[j]) {
                    temp = aux[j - 1];
                    aux[j - 1] = aux[j];
                    aux[j] = temp;
                }
            }
        }
    }

    public void print() {
        for (Integer x : array) {
            System.out.print(x + " ");
        }
        System.out.print("\n\n");
    }

}

class aQueue {
    private rArraySort a;

    public rArraySort getArray() {
        return a;
    }

    public void qInit() {
        a.generate();
    }

    public aQueue() {
        a = new rArraySort();
        a.generate();
    }

    public int dequeue() {
        // Implementar como sacar el elemento que esta a la cabeza de la cola //
        return 1;
    }

}

public class Ejercicio2LABEDA {

    public static void main(String[] args) {
        aQueue aQ = new aQueue();
        aQ.qInit();
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println(i + ": " + aQ.dequeue());
        }
    }
}
*/
