/*
import java.util.*;

public class BusquedaBinaria {

    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9
        // 0 1 2 3 4 5 6 7 8
        Scanner sc= new Scanner(System.in);
        int tam= sc.nextInt(); // Tamaño Arreglo

        int[] arreglo= new int[tam];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = sc.nextInt(); // posicion "i" de cada elemento
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Arreglo[" + i + "]=" + arreglo[i]);
        }

        int num_buscado = 8;
        int inferior=0;
        int centro;
        int superior = tam-1;

        while (inferior <= superior) {
            centro= (inferior + superior) / 2;
            if(arreglo[centro] == num_buscado) {
                System.out.println( "El numero buscado esta en la posicion " + centro );
                break;
            } else if (num_buscado < arreglo[centro]) {
                superior = centro - 1;
            } else {
                inferior = centro + 1;
            }
        }
    }

}

 */