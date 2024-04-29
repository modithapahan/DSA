package Array.Searching.Practise;

public class Q4 {
    static int getMin(int arr[], int n) {
        int res = arr[0];

        for (int i = 1; i < n; i++) {
            res = Math.min(res, arr[i]);
        }
        return res;
    }

    static int getMax(int arr[], int n) {
        int res = arr[0];

        for (int j = 1; j < n; j++) {
            res = Math.max(res, arr[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 1234, 4500, 67, 1 };
        int n = arr.length;

        System.out.println("Minimum " + getMin(arr, n));
        System.out.println("Maximum " + getMax(arr, n));
    }
}
