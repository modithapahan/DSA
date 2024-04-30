package Array.Searching.Practise;

import java.util.ArrayList;

public class Q5 {
    /*
     * Find last duplicate element in a sorted array
     */
    public static void findDuplicate(int[] arr, int len) {
        ArrayList<Integer> list = new ArrayList<>();

        boolean isPresent = false;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    if (list.contains(arr[i])) {
                        break;
                    } else {
                        list.add(arr[i]);
                        isPresent = true;
                    }
                }
            }
        }
        if (isPresent == true) {
            System.out.println(list);
            System.out.println("Last duplicate element is " + list.get(list.size() - 1));
        } else {
            System.out.println("No Duplicates");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 5, 6, 6, 7, 7, 1, 6 };
        int len = arr.length;
        findDuplicate(arr, len);
    }
}
