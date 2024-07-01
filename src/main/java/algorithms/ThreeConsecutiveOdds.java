package algorithms;

// https://leetcode.com/problems/three-consecutive-odds
public class ThreeConsecutiveOdds {

    public static boolean threeConsecutiveOdds(int[] arr) {

        int count = 0;

        for (int j : arr) {
            if (j % 2 == 1) {
                count++;
            } else {
                count = 0;
                continue;
            }

            if (count == 3) return true;
        }
        return false;

    }
}
