package Code.Arrays;

import java.util.HashMap;

public class SortArray012 {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 2, 0, 1, 2, 2, 0, 2, 1, 0 };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                map.put(arr[i], val + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int zeroVal = map.get(0);
        int oneVal = map.get(1);
        int twoVal = map.get(2);

        System.out.println("0 ".repeat(zeroVal) + "1 ".repeat(oneVal) + "2 ".repeat(twoVal).stripTrailing());

    }

}
