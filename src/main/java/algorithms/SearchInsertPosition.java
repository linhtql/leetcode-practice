package algorithms;

// 35. Search Insert Position: https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        var n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        // TC1
//        var nums = new int[]{1, 3, 5, 6};
//        var target = 5;
//        // 2
//        System.out.println(searchInsert(nums, target));
        // TC2
//        var nums = new int[]{1, 3, 5, 6};
//        var target = 2;
////        // 1
//        System.out.println(searchInsert(nums, target));
//        // TC3
        var nums = new int[]{1, 3, 5, 6};
        var target = 7;
        // 4
        System.out.println(searchInsert(nums, target));
    }
}
