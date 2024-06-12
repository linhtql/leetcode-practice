import algorithms.PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {
    @Test
    void testCase1() {
        assertTrue(PalindromeNumber.isPalindrome(121));
    }

    @Test
    void testCase2() {
        assertFalse(PalindromeNumber.isPalindrome(-121));
    }

    @Test
    void testCase3() {
        assertFalse(PalindromeNumber.isPalindrome(10));
    }
}
