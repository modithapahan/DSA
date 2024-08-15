package UnionFind.Approach1;

public class UnionFind {
    public static void initialize(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            System.out.print(arr[i] + "");
        }
    }

    public static boolean find(int arr[], int a, int b) {
        if (arr[a] == arr[b]) {
            return true;
        }
        return false;
    }

    public static void union(int arr[], int n, int a, int b) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[a]) {
                arr[i] = arr[b];
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];

        UnionFind.initialize(arr, n);
        System.out.println();

        UnionFind.union(arr, n, 2, 3);
        System.out.println();
        UnionFind.union(arr, n, 4, 5);
        System.out.println();
        UnionFind.union(arr, n, 2, 4);

        boolean res1 = UnionFind.find(arr, 2, 5);
        boolean res2 = UnionFind.find(arr, 2, 6);

        System.out.println();

        System.out.println("2 and 5 are connected: " + res1);
        System.out.println("2 and 6 are connected: " + res2);
    }
}
