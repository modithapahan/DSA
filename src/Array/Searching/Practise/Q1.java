package Array.Searching.Practise;

public class Q1 {
    /*
     * Find the max value
     */
    public static void main(String[] args) {
        int[] nums = { 1, 423, 6, 46, 34, 23, 13, 5333, 400 };
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
