package Code.Arrays;

public class ArrayReverse {

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void reverseArray(int[] arr) {
        int temp;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int[] arr1 = new int[] { 1, 9, 6, 7, 23, 56 };
        ArrayReverse obj = new ArrayReverse();
        System.out.println("Array Before Rversing: ");
        obj.printArray(arr1);
        System.out.println("Array After Rversing: ");
        obj.reverseArray(arr1);
        obj.printArray(arr1);
    }
}