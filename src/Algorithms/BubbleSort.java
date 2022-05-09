/*
package Algorithms;

public class BubbleSort {

    public void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,7,9,1,0,6,5,3,4,8,10};
        BubbleSort arrOrd = new BubbleSort();

        System.out.println("--------------- SORTING ---------------");
        arrOrd.bubbleSort(arr);

        System.out.println("--------------- ORDERED ARRAY ---------------");
        arrOrd.print(arr);
    }

}
 */