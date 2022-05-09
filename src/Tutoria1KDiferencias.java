/*
import java.io.*;
import java.util.*;

public class Tutoria1KDiferencias {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int n = lector.nextInt(); // formar numeros de largo N.
        int k = lector.nextInt(); // con K de diferencia entre los digitos consecutivos.

        // n = 1 ,aca no podemos hacer algo
        // n = 2 , seria de 10 a 99
        // n = 3 , 100 -> 999
        // n = 4 , 1000 -> 9999
        // ..
        // n = 9 , 100000000 -> 99999999

        for (int i = (int) Math.pow(10, n-1); i < (int) Math.pow(10,n) ; i++) { // Es potencia porque asi definimos los rangos. //
            String s = String.valueOf(i);
            boolean cumple = true;
            for (int j = 0; j < n-1 ; j++) { // tambien sirve s.length()
                // s[0] y s[1], para ver si su diff = K
                // s[1] y s[2], para ver si su diff = k
                int a = Character.getNumericValue( s.charAt(j) );
                int b = Character.getNumericValue( s.charAt(j+1) );
                int diff = Math.abs(a-b);
                if( diff != k) {
                    cumple = false;
                }
            }
            if(cumple) {
                System.out.print(i + " ");
            }
        }
    }

}

 */