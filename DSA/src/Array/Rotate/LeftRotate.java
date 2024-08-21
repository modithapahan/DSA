package Array.Rotate;

public class LeftRotate {
    public static void rotate(int arr[], int rotate_time, int len) {
        int count = 1;

        while (count <= rotate_time) {
            int index = arr[0];

            for (int i = 0; i < len - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[len - 1] = index;

            count++;
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        int len = arr.length;

        int rotate_time = 2;

        rotate(arr, rotate_time, len);
    }
}
