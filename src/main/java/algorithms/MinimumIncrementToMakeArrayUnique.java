package algorithms;

import java.util.Arrays;

public class MinimumIncrementToMakeArrayUnique {
    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);

        int numTracker = 0; // Tracks the next unique number that should be set
        int minIncrement = 0; // Counts the total increments required.

        for (int num : nums) {
            numTracker = Math.max(numTracker, num);
            minIncrement += numTracker - num;
            numTracker += 1; // Increment the tracker for the next number.
        }

        return minIncrement;
    }
}
