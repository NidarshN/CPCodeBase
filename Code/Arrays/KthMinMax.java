package Code.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthMinMax {

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);

    }

    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partIndex = partition(arr, low, high);
            quickSort(arr, low, partIndex - 1);
            quickSort(arr, partIndex + 1, high);
        }
    }

    void kthminmaxarray(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println(k + "th Minimum in the Array is " + arr[k - 1]);
        System.out.println(k + "th Maximum in the Array is " + arr[arr.length - k]);
    }

    /* Using QuickSort logic instead of in built Array.sort() function */
    public static void main(String[] args) {
        /* int[] arr = new int[] { 9867, 45, 234, 10, 356, 659, 8684, 9954 }; */
        int[] arr = new int[] { 7, 10, 4, 3, 20, 15 };

        System.out.println("Enter the value of K: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();

        KthMinMax obj = new KthMinMax();
        System.out.println("Array Before Sorting :");
        obj.printArray(arr);
        obj.quickSort(arr, 0, arr.length - 1);
        System.out.println("Array After Sorting :");
        obj.printArray(arr);
        System.out.println(k + "th Minimum in the Array is " + arr[k - 1]);
        System.out.println(k + "th Maximum in the Array is " + arr[arr.length - k]);

        /*
         * Simpler Logic kthminmaxarray(arr, k);
         */
    }
}
