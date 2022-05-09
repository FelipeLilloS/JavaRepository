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

public class NumeroComputadores {
    public static int laptopRentals(ArrayList<ArrayList<Integer>> times) {
         //Enter your code here
        List<Integer> start = new LinkedList<>();
        List<Integer> end = new LinkedList<>();

        for (int i = 0; i < start.size() ; i++) {
            start.add(times.get(i).get(0));
            end.add(times.get(i).get(1));
        }

        Collections.sort(start);
        Collections.sort(end);
        // Start tiene que ser menor que end, asi se genera el intervalo como [s,e]

        int j = 0, result = 0, current = 0;
        int k = 0;
        while( j < times.size() ){
            if(start.get(j) == end.get(k)){
                current++;
                j++;
                if(result < current) {
                    result = current;
                }
            } else {
                current--;
                k++;
            }
        }


        return result;
    }


    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();

        ArrayList<ArrayList<Integer>> times = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < n; i++) {
            int start = stdin.nextInt();
            int end = stdin.nextInt();

            times.add(new ArrayList(Arrays.asList(start, end)));
        }

        int result = laptopRentals(times);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
*/