package algorithms;

// 9. Palindrome Number: https://leetcode.com/problems/palindrome-number
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null && strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            int j = 0;
            while (j < prefix.length() && j < s.length() && prefix.charAt(j) == s.charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);

            if (prefix.isEmpty()) {
                break;
            }
        }
        return prefix;
    }
}
