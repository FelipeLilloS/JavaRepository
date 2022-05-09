/*
public class Ejercicio_Recursividad {

    public static int maximoRec(int[] numeros,int indice,int maximo) {
        if(indice != numeros.length) {
            if(numeros[indice] > maximo ) {
                maximo= maximoRec(numeros,indice + 1 ,numeros[indice]);
            } else {
                maximo = maximoRec(numeros,indice + 1 ,maximo);
            }
        }
        return maximo;
    }

    public static int maximoRecV2(int[] numeros,int indice) {
        int maximo = Integer.MIN_VALUE;
        if(indice != numeros.length) {
            maximo = Math.max( numeros[indice], maximoRecV2(numeros,indice+1) );
        }
        return maximo;
    }

    public static int minimoRec (int[] numeros, int indice,int min ) {
        if(indice != numeros.length) {
            if(numeros[indice] < min ) {
                min = minimoRec(numeros,indice + 1 , numeros[indice]);
            } else {
                min = minimoRec(numeros,indice + 1 ,min);
            }
        }
        return min;
    }

    public static int minimoRecv2(int[] numeros,int indice) {
        int min = Integer.MAX_VALUE;
        if(indice != numeros.length) {
            min = Math.min( numeros[indice], minimoRecv2(numeros,indice+1) );
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numeros = {6,5,9,10,33,1,5};
        System.out.println( "Maximo V1: " + maximoRec( numeros,0,numeros[0]) );
        System.out.println( "Maximo V2: " + maximoRecV2( numeros,0) );
        System.out.println();
        System.out.println( "Minimo V1: " + minimoRec( numeros,0,numeros[0]) );
        System.out.println( "Minimo V2: " + minimoRecv2( numeros,0) );


    }
}


 */