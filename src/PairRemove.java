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

class ResultadoPairRemove {

    public static String PairRemove(String s) {
        Stack<Character> caracter = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char caracterAgregado = s.charAt(i);
            caracter.add(s.charAt(i)); // Los agrega al Stack //
            System.out.println(caracter.peek() + " " );
             if(!caracter.isEmpty() && caracter.peek() == caracterAgregado ) {
                 caracter.pop();
             }
             else if (!caracter.isEmpty() && caracter.peek() == '{' && s.charAt(i) == '}'){
                 caracter.pop();
             }
             else if(!caracter.isEmpty() && caracter.peek() == '[' && s.charAt(i) == ']'){
                 caracter.pop();
             } else {
                 caracter.push(s.charAt(i));
             }

        }

        for (int i = 0; i < caracter.size(); i++) {
            System.out.print(caracter.peek());
            caracter.pop();
        }

        return caracter.toString();
    }

}

public class PairRemove {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = ResultadoPairRemove.PairRemove(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}

 */