import algorithms.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
    @Test
    void testCase1() {
        assertTrue(ValidParentheses.isValid("()[]{}"));
    }

    @Test
    void testCase2() {
        assertTrue(ValidParentheses.isValid("()[]{}"));
    }

    @Test
    void testCase3() {
        assertFalse(ValidParentheses.isValid("(]"));
    }

}
