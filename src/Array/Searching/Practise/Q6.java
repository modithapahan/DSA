package Array.Searching.Practise;

import java.util.ArrayList;

public class Q6 {
    /*
     * Find Duplicates on Array
     */

    public static void findDuplicates(int[] arr, int len) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean isPresent = false;

        for (int a = 0; a < len; a++) {
            for (int b = a + 1; b < len; b++) {
                if (arr[a] == arr[b]) {
                    if (list.contains(arr[a])) {
                        break;
                    } else {
                        list.add(arr[a]);
                        isPresent = true;
                    }
                }
            }
        }
        if (isPresent == true) {
            System.out.println(list);
        } else {
            System.out.println("No Duplicates");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 10, 10, 100, 2, 10, 11, 2, 11, 2 };
        int len = arr.length;

        findDuplicates(arr, len);
    }
}
