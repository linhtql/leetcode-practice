import static org.junit.jupiter.api.Assertions.*;

import algorithms.MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves;
import org.junit.jupiter.api.Test;

public class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMovesTest {

    @Test
    void testCase1() {
        assertEquals(0, MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves.minDifference((new int[]{5, 3, 2, 4})));
    }

    @Test
    void testCase2() {
        assertEquals(1, MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves.minDifference((new int[]{1, 5, 0, 10, 14})));
    }

    @Test
    void testCase3() {
        assertEquals(0, MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves.minDifference((new int[]{3, 100, 20})));
    }
}
