package Array;

public class PrintValues {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }

        System.out.println();

        /* Using for each loop */
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
