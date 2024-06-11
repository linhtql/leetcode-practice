package algorithms;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        var sum = 0;
        for (char c : s.toCharArray()) {
            sum += hm.get(c);
        }
        return sum;
    }

    public static void main(String[] args) {
        // TC1
//        System.out.println(romanToInt("III")); // 3
        // TC2
//        System.out.println(romanToInt("LVIII")); // 58
        // TC3
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }

}
