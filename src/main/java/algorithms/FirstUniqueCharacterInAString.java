package algorithms;
// 387. First Unique Character in a String: https://leetcode.com/problems/first-unique-character-in-a-string

public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (var c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
