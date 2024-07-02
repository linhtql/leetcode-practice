import static org.junit.jupiter.api.Assertions.*;

import algorithms.IntersectionOfTwoArraysII;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoArraysIITest {

    @Test
    void testCase1() {
        final int[] nums1 = {1, 2, 2, 1};
        final int[] nums2 = {2, 2};
        assertArrayEquals(new int[]{2, 2}, IntersectionOfTwoArraysII.intersect(nums1, nums2));
    }

    @Test
    void testCase2() {
        final int[] nums1 = {4, 9, 5};
        final int[] nums2 = {9, 4, 9, 8, 4};
        assertArrayEquals(new int[]{9, 4}, IntersectionOfTwoArraysII.intersect(nums1, nums2));
    }
}
