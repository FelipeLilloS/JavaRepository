/*
import java.io.*;
import java.util.*;

public class TiempoDeLluvia {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[][] arr = new int[n][k];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < k ; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int time = 0;

        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < k-1 ; j++) {
                if( arr[i+time][j+time] != 0 ) {
                    arr[i][j] = 2;
                }
            }
            System.out.println();
            time++;
        }

        System.out.print(time);
    }
}
*/