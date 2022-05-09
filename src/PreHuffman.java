/*
import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.joining;

class SolucionEjercicio {


     * Complete the 'SortByFreq' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.

    public static String SortByFreq(String s) {
        Map<Character,Integer> freqValue = new HashMap<>();
        ArrayList<Character> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
                        // Toma el caracter y indica cuantas veces se repite //
        for(int i = 0;i < s.length();i++) {
            char c = s.charAt(i);
            if( freqValue.containsKey(c) ) {
                freqValue.put( c,freqValue.get(c) + 1);
            } else {
                freqValue.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> entry: freqValue.entrySet()) {
            A.add(entry.getKey());
            B.add(entry.getValue());
        }

        Collections.sort(A, (a,b) ->{
            if( B.get(a) > B.get(b)) return a-b;
            else return b-a;
        });

        for(int i=0;i<A.size();i++) {
            System.out.println(A.get(i) + " " + B.get(i) );
        }

        System.out.println();
        freqValue.forEach((k,v) -> System.out.println("Key: " + k + "| Value: " + v));

                        // ORDENAR O FORMAR LA PALABRA FINAL //
        // Que me ingrese en la cola un par caracter con int, y que me ingrese en base a la frecuencia //
        // Si es mayor en frecuencia, va primero, si no, lo ingresa despues a la vez que compara con ascii en caso de que sean iguales //

        return freqValue.toString();
    }

}

public class PreHuffman {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String res = SolucionEjercicio.SortByFreq(s);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/