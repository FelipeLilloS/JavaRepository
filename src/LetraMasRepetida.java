/*
import java.io.*;
import java.util.*;

public class LetraMasRepetida {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String cadena = input.nextLine();

        int contMax = 0;
        char valueMax= ' ';
        HashMap<Character,Integer> letras = new HashMap<>();

        for(int i = 0; i < cadena.length(); i++) {
            char simbolo = cadena.charAt(i);
            if(letras.containsKey(simbolo)) { letras.put(simbolo,letras.get(simbolo)+1);}
            else { letras.put(simbolo,1); }
        }

        for(Map.Entry m: letras.entrySet()) {
            int k = (int) m.getValue();
            if( k > contMax) {
                contMax = k;
                valueMax = (char) m.getKey();
            }
        }
        System.out.println(valueMax);
    }
}

 */