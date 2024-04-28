package Array.Searching.Practise;

public class Q2 {
    /*
     * find the min value
     */
    public static void main(String[] args) {
        int[] nums = { 1, 423, 6, 46, 34, 23, 13, -53, -4 };
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);
    }
}
