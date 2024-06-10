package algorithms;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 409. Longest Palindrome: https://leetcode.com/problems/longest-palindrome
public class LongestPalindrome {


    public static int longestPalindrome(String s) {
        var result = 0;
        var single = 0;
        var n = s.length();

        var arr = new int[256];

        for (int i = 0; i < n; i++) {
            arr[s.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (arr[i] % 2 == 0) {
                result += arr[i];
            } else {
                result += arr[i] - 1;
                single = 1;
            }
        }
        return single + result;

//        var result = 0;
//        Set<Character> set = new HashSet<>();
//        for (char c : s.toCharArray()) {
//            if (set.contains(c)) {
//                set.remove(c);
//                result += 2;
//            } else {
//                set.add(c);
//            }
//        }
//
//        if (!set.isEmpty()) {
//            result += 1;
//        }
//        return result;
    }

    public static void main(String[] args) {
        // TC1
        var s = "abccccdd"; // 7
        System.out.println(longestPalindrome(s));
        //TC2
//        var s = "a"; // 1
//        System.out.println(longestPalindrome(s));
    }

}
