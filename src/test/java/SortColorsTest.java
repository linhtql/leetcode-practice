import algorithms.SortColors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortColorsTest {

    @Test
    void testCase1() {
        final var nums = new int[]{2, 0, 2, 1, 1, 0};
        SortColors.sortColors(nums);
        final var expected = new int[]{0, 0, 1, 1, 2, 2};

        assertArrayEquals(expected, nums);
    }

    @Test
    void testCase2() {
        var nums = new int[]{2, 0, 1};
        SortColors.sortColors(nums);
        final var expected = new int[]{0, 1, 2};

        assertArrayEquals(expected, nums);
    }
}
