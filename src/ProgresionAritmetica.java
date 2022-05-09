/*
import javax.crypto.spec.PSource;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

class Resultado {


     * Complete the 'isArithmeticProgression' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts INTEGER_ARRAY arr as parameter.


    public static boolean isArithmeticProgression(List<Integer> arr) {
        int sumresta=0;
        int diff = 0;
        boolean answer;
        Collections.sort(arr);
        int pos1 = arr.get(0);
        int pos2 = arr.get(1);
        //System.out.println(arr.toString());

        if(arr.size() == 0) {
            return false;
        } else if (arr.size() == 2) {
            return true;
        }

        for (int i = 0; i < arr.size()-1; i++) {
            diff = Math.abs(pos2 - pos1);
            if( Math.abs( arr.get(i+1) - arr.get(i) ) == diff ) {
                sumresta++;
            }
        }

        if( sumresta == arr.size() - 1 ) {
            answer = true;
        } else {
            answer= false;
        }
        return answer;
    }

}

public class ProgresionAritmetica {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        boolean res = Resultado.isArithmeticProgression(arr);

        bufferedWriter.write(String.valueOf(res ? "True" : "False"));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

 */