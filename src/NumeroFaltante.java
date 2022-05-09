/*

import java.util.*;

public class NumeroFaltante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] numeros = new int[N];
        int[] completo = new int[N];
        int min=0;

        for (int i = 0; i < N - 1; i++) {
            numeros[i] = scan.nextInt();
        }

        min = numeros[0];
        System.out.println("");
        System.out.println("Minimo " + min + " | Arreglo inicial: " + Arrays.toString(numeros));

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if( min > numeros[i] ) {
                min = numeros[i];
            } else { }
            completo[i] = numeros[i];
            sum += numeros[i];
        }
        System.out.println("Minimo " + min + " | La suma de los valores del arreglo es " + sum);

        int num = numeros[0];
        int total=0,faltante;

        int pos=0;
        for (int i = num; i < num+N; i++) {
            System.out.print(i+ " ");
            completo[pos] = i;
            total += i;
            pos++;
        }

        System.out.print("\n Arreglo subiendo ascendentemente: ");
        System.out.println(Arrays.toString(completo));

        System.out.println("Total " + total);
        System.out.println("Suma " + sum);
        faltante = total - sum;
        System.out.println(faltante);

    }
}

 */