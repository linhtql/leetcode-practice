import static org.junit.jupiter.api.Assertions.*;

import algorithms.ReverseSubstringsBetweenEachPairOfParentheses;
import org.junit.jupiter.api.Test;

public class ReverseSubstringsBetweenEachPairOfParenthesesTest {

    @Test
    void testCase1() {
        assertEquals("dcba", ReverseSubstringsBetweenEachPairOfParentheses.reverseParentheses("(abcd)"));
    }

    @Test
    void testCase2() {
        assertEquals("iloveu", ReverseSubstringsBetweenEachPairOfParentheses.reverseParentheses("(u(love)i)"));
    }

    @Test
    void testCase3() {
        assertEquals("leetcode", ReverseSubstringsBetweenEachPairOfParentheses.reverseParentheses("(ed(et(oc))el)"));
    }
}
