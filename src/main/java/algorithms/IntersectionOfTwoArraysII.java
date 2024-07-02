package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Map<Integer, Integer> allElement = new HashMap<>();

        for (int num : nums1) {
            allElement.put(num, allElement.getOrDefault(num, 0) + 1);
        }


        List<Integer> intersection = new ArrayList<>();

        for (int num : nums2) {
            if (allElement.containsKey(num) && allElement.get(num) > 0) {
                intersection.add(num);
                allElement.put(num, allElement.get(num) - 1);
            }
        }

        int[] ans = new int[intersection.size()];

        for (int i = 0; i < intersection.size(); i++) {
            ans[i] = intersection.get(i);
        }

        return ans;
    }
}
