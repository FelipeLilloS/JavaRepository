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

public class Solution {
    public static int laptopRentals(ArrayList<ArrayList<Integer>> times) {
        Enter your code here

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