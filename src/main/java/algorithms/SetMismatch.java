package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int missNum = 0;
        int dupNum = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                missNum = i;
            } else {
                if (map.get(i) == 2) {
                    dupNum = i;
                }
            }
        }
        return new int[]{dupNum, missNum};
    }
}
