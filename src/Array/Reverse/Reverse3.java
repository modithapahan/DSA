package Array.Reverse;

import java.util.Stack;

public class Reverse3 {
    /*
     * Array Reverse Stack
     */

    public static void reverseArrayUsingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int element : arr) {
            stack.push(element);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        reverseArrayUsingStack(arr);

        System.out.print("Reversed Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
