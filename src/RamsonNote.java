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

class Result {


     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note


    //
    ArrayList<String> arrLetras = new ArrayList<>();
        String sol= " ";

        for (int i = 0; i < note.size() ; i++) {
            String frase = note.get(i);
            arrLetras.add(frase);
        }

        for(int i = 0;i < magazine.size(); i++) {
            String fraseComp = magazine.get(i);
            if( arrLetras.contains(fraseComp) ){
                sol= "No";
            } else {
                sol = "Yes";
            }
        }
        System.out.println(sol);
     //

    public static void checkMagazine(List<String> magazine, List<String> note) {
                        /* Write your code
        HashMap<String,Integer> map = new HashMap<>();

        for(String i: magazine) {
            if( map.containsKey(i) ) {
                map.put(i,map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }

        for(String j: note) {
            if(map.containsKey(j) && map.get(j) > 0) {
                map.put(j,map.get(j)-1);
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}

public class RamsonNote {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .collect(toList());

        Result.checkMagazine(magazine, note);
        bufferedReader.close();
    }
}

 */