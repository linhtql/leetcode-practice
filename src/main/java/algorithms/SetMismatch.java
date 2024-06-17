package algorithms;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return new int[]{nums[i], nums[i] + 1};
            }
        }
        return new int[]{};
    }
}
