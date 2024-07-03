package algorithms;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves
public class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {

    public static int minDifference(int[] nums) {

        int n = nums.length;

        if (n <= 4) {
            return 0;
        }

        Arrays.sort(nums);
        int ans = nums[n - 1] - nums[0];

        for (int i = 0; i <= 3; i++) {
            ans = Math.min(ans, nums[nums.length - (3 - i) - 1] - nums[i]);
        }
        return ans;
    }
}
