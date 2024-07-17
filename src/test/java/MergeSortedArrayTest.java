import static org.junit.jupiter.api.Assertions.*;

import algorithms.MergeSortedArray;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    @Test
    void testCase1() {
        var nums1 = new int[]{1, 2, 3, 0, 0, 0};
        var nums2 = new int[]{2, 5, 6};
        var m = 3;
        var n = 3;
        MergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(nums1, new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    void testCase2() {
        var nums1 = new int[]{1};
        var nums2 = new int[]{};
        var m = 1;
        var n = 0;
        MergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(nums1, new int[]{1});
    }

    @Test
    void testCase3() {
        var nums1 = new int[]{0};
        var nums2 = new int[]{1};
        var m = 0;
        var n = 1;
        MergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(nums1, new int[]{1});
    }
}
