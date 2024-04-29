package Array.Searching.Practise;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] num = { 1, 423, 6, 46, 34, 23, 13, 53, 4 };

        Arrays.sort(num);
        System.out.println("Min value is " + num[0] + " Max value is " + num[num.length - 1]);
    }
}
