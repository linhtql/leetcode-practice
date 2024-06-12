package algorithms;

// 75. Sort Colors: https://leetcode.com/problems/sort-colors
public class SortColors {
    public static void sortColors(int[] nums) {
        int zeroCnt = 0, oneCnt = 0, twoCnt = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCnt++;
            } else if (num == 1) {
                oneCnt++;
            } else {
                twoCnt++;
            }
        }

        var arrayIterator = 0;

        for (int i = 0; i < zeroCnt; i++) {
            nums[arrayIterator++] = 0;
        }

        for (int i = 0; i < oneCnt; i++) {
            nums[arrayIterator++] = 1;
        }

        for (int i = 0; i < twoCnt; i++) {
            nums[arrayIterator++] = 2;
        }
    }

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        // TC1
//
//        sortColors(nums);
//        print(nums);
        // TC2

        var nums = new int[]{2, 0, 1};
        sortColors(nums);
        print(nums);
    }
}
