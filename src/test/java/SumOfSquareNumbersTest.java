import static org.junit.jupiter.api.Assertions.*;

import algorithms.SumOfSquareNumbers;
import org.junit.jupiter.api.Test;

public class SumOfSquareNumbersTest {

    @Test
    void testCase1() {
        assertTrue(SumOfSquareNumbers.judgeSquareSum(5));
    }

    @Test
    void testCase2() {
        assertFalse(SumOfSquareNumbers.judgeSquareSum(3));
    }

    @Test
    void testCase3() {
        assertTrue(SumOfSquareNumbers.judgeSquareSum(4));
    }
}
