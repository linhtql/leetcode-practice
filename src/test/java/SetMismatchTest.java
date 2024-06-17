import algorithms.SetMismatch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SetMismatchTest {

    @Test
    void testCase1() {
        assertArrayEquals(new int[]{2, 3}, SetMismatch.findErrorNums(new int[]{1, 2, 2, 4}));
    }

    @Test
    void testCase2() {
        assertArrayEquals(new int[]{1, 2}, SetMismatch.findErrorNums(new int[]{1, 1}));
    }
}
