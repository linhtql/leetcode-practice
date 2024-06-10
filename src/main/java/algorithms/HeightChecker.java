package algorithms;

// 1051. Height Checker: https://leetcode.com/problems/height-checker

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        var originArr = cloneArr(heights);
        bubbleSort(heights);
        return check(heights, originArr);
    }

    private static int[] cloneArr(int[] src) {
        int n = src.length;
        var des = new int[n];
        for (int i = 0; i < n; i++) {
            des[i] = src[i];
        }
        return des;
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    private static int check(int[] src, int[] des) {
        var count = 0;
        var n = src.length;
        for (int i = 0; i < n; i++) {
            if (src[i] != des[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // TC1
//        var heights = new int[]{1, 1, 4, 2, 1, 3}; // 3
//        System.out.println(heightChecker(heights));

        // TC2
//        var heights = new int[]{5, 1, 2, 3, 4}; // 5
//        System.out.println(heightChecker(heights));

        var heights = new int[]{1, 2, 3, 4, 5}; // 0
        System.out.println(heightChecker(heights));
    }
}
