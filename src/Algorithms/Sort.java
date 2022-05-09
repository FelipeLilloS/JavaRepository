/*
package Algorithms;

public class Sort {

    public static void BubbleSort( int arr[] ) { // Complejidad O(n^2), Compara en pares y deja el mayor al final //
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length -1 - i ; j++) {
                if(arr[j] >= arr[j+1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void SelectionSort( int arr[] ) { // Complejidad O(n^2), Selecciona el mas chico y lo trae a la primera posicion //
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i+1; j < length; j++) {
                if( arr[j] <= arr[minIndex] ) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void InsertionSort( int arr[] ) { // Complejidad O(n^2), //
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int swapValue = arr[i]; // Lo inserta en la posicion que corresponda //
            int j = i-1;
            while(j >= 0 && arr[j] > swapValue) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = swapValue;
        }
    }

    public static void merge(int arr[],int left,int mid,int right) {
        int n1 = mid - left + 1; // Calcula elementos lado izquierdo.
        int n2 = right - mid; // Calcula elementos lado derecho.

        int leftArray[] = new int[n1]; // Crea arreglo lado izquierdo.
        int rightArray[] = new int[n2]; // Crea arreglo lado derecho.

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[i + left];   // Llena el arreglo izquierdo.
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[j + (mid+1)]; // Llena el arreglo derecho.
        }

        int i = 0, j = 0; // i = Elementos de la izquierda, j= Elementos de la derecha.
        int k = left;

                // Une las soluciones
        while(i < n1 && j < n2 ) {
            if(leftArray[i] <= rightArray[j] ) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

                // Une los rezagados de la izquierda.
        while(i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

                // Une los rezagados de la derecha.
        while(j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    public static void MergeSort(int arr[], int left, int right ) {
        if(left < right){
            int mid = (left + right)/2;

            // Desordenardo //
            MergeSort(arr,left,right);
            MergeSort(arr,mid+1,right);

            // Ordenado
            merge(arr,left,mid,right);
        }

    }
}
*/