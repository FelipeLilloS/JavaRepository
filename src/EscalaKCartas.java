/*

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
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

class Result {


     * Complete the 'ScaleOfW' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY hand
     *  2. INTEGER w


    public static ArrayList<int[]> arr = new ArrayList<>();
    public static int count=0;
    public static int[] arreglo;

    public static boolean ScaleOfW(List<Integer> hand, int w) {
        if( hand.size() % w != 0) { // no se repartir en manos de w total de cartas //
            return false;
        }
        arreglo = new int[w];

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < hand.size(); j++) {
                int valor = hand.get(j);
                if( count != w && arreglo.length < w ) {
                    arreglo[j] = valor;
                }
                if(count == w) {
                    count = 0;
                }
            }
            System.out.println(arr);
            arr.get(arreglo[i]);
        }
        return true;
    }

}

public class EscalaKCartas {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int w = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> hand = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        boolean res = Result.ScaleOfW(hand, w);

        bufferedWriter.write(String.valueOf(res ? "True" : "False"));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

*/