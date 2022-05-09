/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Rotacion_Arreglos {

    public static void main(String[] args) throws IOException {
        Scanner scan= new Scanner(System.in);

        int n = scan.nextInt(); // Largo Arreglo
        int[] Arr = new int[n];
        int d = scan.nextInt(); // Cantidad de rotaciones.

        for (int i = 0; i < n; i++) {
            int N = scan.nextInt();
            Arr[i] = N;
        }

        while(d > 0) {
            int first= Arr[0];
            int j=0;
            for (j = 0; j < n-1; j++) {
                Arr[j] = Arr[j+1];
            }
            Arr[j] = first;
            d--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }


    }
}
*/