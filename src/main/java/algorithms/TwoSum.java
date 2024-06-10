package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 1. Two Sum: https://leetcode.com/problems/two-sum
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        var n = nums.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};

        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{i, numToIndex.get(complement)};
            } else {
                numToIndex.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    private static void print(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        // TC1
//        var nums = new int[]{2, 7, 11, 15}; // [0, 1]
//        var target = 9;
//        print(twoSum(nums, target));
        // TC2
//        var nums = new int[]{3, 2, 4}; // [1, 2]
//        var target = 6;
//        print(twoSum(nums, target));
        //TC3
        var nums = new int[]{3, 3}; // [0, 1]
        var target = 6;
        print(twoSum(nums, target));
    }
}
