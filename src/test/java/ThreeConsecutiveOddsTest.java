import static org.junit.jupiter.api.Assertions.*;

import algorithms.ThreeConsecutiveOdds;
import org.junit.jupiter.api.Test;

public class ThreeConsecutiveOddsTest {

    @Test
    void testCase1() {
        assertFalse(ThreeConsecutiveOdds.threeConsecutiveOdds(new int[]{2, 6, 4, 1}));
    }

    @Test
    void testCase2() {
        assertTrue(ThreeConsecutiveOdds.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
    }
}
