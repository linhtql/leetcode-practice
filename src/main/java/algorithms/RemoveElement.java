package algorithms;

// 27. Remove Element: https://leetcode.com/problems/remove-element/description/
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        var count = 0;
        for (int num : nums) {
            if (num != val) {
                nums[count++] = num;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        // TC1
        var nums = new int[]{3, 2, 2, 3};
        var val = 3; // 2
        System.out.println(removeElement(nums, val));

        // TC2
    }
}
