/*

import java.util.*;
import java.io.*;

public class balanceoDelimitadores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();

        Stack<Character> charactersO = new Stack<>();
        Stack<Character> charactersC = new Stack<>();

        for (int i = 0; i < palabra.length() ; i++) {
            char o = palabra.charAt(i);
            if( o == '[' || o == '(' || o == '{' ) {
                charactersO.add(o);
            } else if ( o == ']' || o == ')' || o == '}')  {
                charactersC.add(o);
            }
        }

        if( charactersC.size() == charactersO.size() ){
            System.out.print(1);
        } else {
            System.out.println(0);
        }
    }
}

 */