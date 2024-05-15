package Array.Reverse;

public class Reverse1 {
    /*
     * Array Reverse Using an Extra Array
     */

    public static void reverseArrayExtraArray(int[] arr) {

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - i - 1];
        }

        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        reverseArrayExtraArray(arr);
    }
}