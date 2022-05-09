/*
import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {


     * Complete the 'decodeString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.


    public static String decodeString(String s) {

        Queue<Character> character = new LinkedList<Character>(); // Agregar los caracteres que esten en s.
        ArrayList<Integer> numeros = new ArrayList<>();
        int numRepeticiones = 0;

        for (int i = 0; i < s.length(); i++) {
            if( Character.isDigit( (char)s.charAt(i) )) {
                numeros.add( (int) s.charAt(i));
            } else {
                character.add( s.charAt(i));
            }
        }

        return "Run";
    }

}

public class Ejercicio2EDDA {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();
       //  String res = Solucionario.decodeString(s);

      // bufferedWriter.write(res);
      // bufferedWriter.newLine();

      // bufferedReader.close();
      // bufferedWriter.close();
    }

}
*/