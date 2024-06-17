package algorithms;
// 633. Sum of Square Numbers: https://leetcode.com/problems/sum-of-square-numbers

public class SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {
        double l = 0;
        int r = (int) Math.sqrt(c);
        double sum = 0;
        while (l <= r) {
            sum = Math.pow(l, 2) + Math.pow(r, 2);
            if (sum == c) {
                return true;
            } else if (sum > c) {
                r--;
            } else {
                l++;
            }
        }
        return false;
    }
}
