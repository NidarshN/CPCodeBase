package Code.Arrays;

public class MinMaxArray {

    int min = 0, max = 0, i = 0;

    void arrayminmax(int[] arr, int n) {
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                min = arr[0];
                max = arr[1];
            } else {
                min = arr[1];
                max = arr[0];
            }
            i = 2;
        } else {
            min = max = arr[0];
            i = 1;
        }
        while (i < n - 1) {
            if (arr[i] < arr[i + 1]) {
                if (arr[i] < min)
                    min = arr[i];
                if (arr[i + 1] > max)
                    max = arr[i + 1];
            } else {
                if (arr[i + 1] < min)
                    min = arr[i + 1];
                if (arr[i] > max)
                    max = arr[i];
            }
            i += 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1000, 11, 445, 900000, 100, 330, 3000 };
        MinMaxArray obj = new MinMaxArray();
        obj.arrayminmax(arr, arr.length);
        System.out.println("Minimum Element is " + obj.min);
        System.out.println("Maximum Element is " + obj.max);
    }
}
