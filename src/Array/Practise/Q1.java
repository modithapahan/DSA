package Array.Practise;

public class Q1 {
    /*
     * Remove Duplicates from Sorted Array
     */

    public static void removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            System.out.println("Empty array");
        }
        System.out.println(nums[0]);
        int defaultVal = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[defaultVal]) {
                defaultVal++;
                nums[defaultVal] = nums[i];
                System.out.println(nums[defaultVal]);
            }
        }
        System.out.println("Length is " + (defaultVal + 1));
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 3, 4 };
        removeDuplicates(nums);
    }
}
