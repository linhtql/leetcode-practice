import static org.junit.jupiter.api.Assertions.*;

import algorithms.ReverseString;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    void testCase1() {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        ReverseString.reverseString(s);
        assertArrayEquals(s, new char[]{'o', 'l', 'l', 'e', 'h'});
    }

    @Test
    void testCase2() {
        char[] s = new char[]{'H','a','n','n','a','h'};
        ReverseString.reverseString(s);
        assertArrayEquals(s, new char[]{'h','a','n','n','a','H'});
    }
}
