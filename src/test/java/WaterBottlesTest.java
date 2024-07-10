import algorithms.WaterBottles;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaterBottlesTest {

    @Test
    void testCase1() {
        assertEquals(13, WaterBottles.numWaterBottles(9, 3));
    }

    @Test
    void testCase2() {
        assertEquals(19, WaterBottles.numWaterBottles(15, 4));
    }
}
