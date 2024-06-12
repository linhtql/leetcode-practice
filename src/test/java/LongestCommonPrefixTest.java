import algorithms.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {

    @Test
    void testCase1() {
        var strs = new String[]{"flower", "flow", "flight"};
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void testCase2() {
        var strs = new String[]{"dog", "racecar", "car"};
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(strs));
    }
}
