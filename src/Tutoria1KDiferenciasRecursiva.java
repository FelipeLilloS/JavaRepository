/*
import java.io.*;
import java.util.*;

public class Tutoria1KDiferenciasRecursiva {

    static void sol(int num,int largo,int diff,int tope,int unidad) { // [0],[1] , [1],[2], , [2],[3] , ....
        if(largo ==tope){
            System.out.print(num+ " ");
            return;
        }
        if(unidad-diff >= 0){
            sol(10*num+(unidad-diff),largo+1,diff,tope,unidad-diff);
        }
        if(unidad+diff < 10 && diff!=0) {
            sol(10*num+(unidad+diff),largo+1,diff,tope,unidad+diff);
        }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt(); // formar numeros de largo N.
        int k = lector.nextInt(); // con K de diferencia entre los digitos consecutivos.
        for (int i = 1; i < 10; i++) {
            sol(i, 1, k, n, i);
        }
    }
}

 */