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

class Resultadozx {


     * Complete the 'findAllMirrorNumbers' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts INTEGER n as parameter.

    public static List<String> findAllMirrorNumbers(int n) {

        return List.of();
    }

}

public class Ejercicio1EDDA {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> res = Resultadozx.findAllMirrorNumbers(n);

        Collections.sort(res);

        bufferedWriter.write(
                res.stream()
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
*/