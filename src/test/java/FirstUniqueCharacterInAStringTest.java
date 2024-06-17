import static org.junit.jupiter.api.Assertions.*;

import algorithms.FirstUniqueCharacterInAString;
import org.junit.jupiter.api.Test;

public class FirstUniqueCharacterInAStringTest {
    @Test
    void testCase1() {
        assertEquals(0, FirstUniqueCharacterInAString.firstUniqChar("leetcode"));
    }

    @Test
    void testCase2() {
        assertEquals(2, FirstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
    }

    @Test
    void testCase3() {
        assertEquals(-1, FirstUniqueCharacterInAString.firstUniqChar("aabb"));
    }
}
