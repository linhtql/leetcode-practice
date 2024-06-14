import static org.junit.jupiter.api.Assertions.*;

import algorithms.MinimumIncrementToMakeArrayUnique;
import org.junit.jupiter.api.Test;

public class MinimumIncrementToMakeArrayUniqueTest {

    @Test
    void testCase1() {
        assertEquals(1, MinimumIncrementToMakeArrayUnique.minIncrementForUnique(new int[]{1, 2, 2}));
    }

    @Test
    void testCase2() {
        assertEquals(6, MinimumIncrementToMakeArrayUnique.minIncrementForUnique(new int[]{3, 2, 1, 2, 1, 7}));
    }
}
