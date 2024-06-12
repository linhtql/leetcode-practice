package algorithms;

// 9. Palindrome Number: https://leetcode.com/problems/palindrome-number
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int originNum = x;
        int newNum = 0;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            int mod = x % 10;
            newNum = newNum * 10 + mod;
            x /= 10;

        }
        return originNum == newNum;
    }
}
