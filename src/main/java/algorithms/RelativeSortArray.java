package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 1122. Relative Sort Array: https://leetcode.com/problems/relative-sort-array
public class RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;
        int[] newArr = new int[n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[j] == arr2[i]) {
                    newArr[count++] = arr1[j];
                }
            }
        }
        int f = count;

        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) c++;
            }
            if (c == 0) newArr[count++] = arr1[i];
        }

        for (int i = f; i < newArr.length - 1; i++) {
            for (int j = i; j < newArr.length; j++) {
                if (newArr[i] > newArr[j]) {
                    int tmp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = tmp;
                }
            }
        }
        return newArr;

        // using HashMap
//        var result = new int[arr1.length];
//        var count = 0;
//        Map<Integer, Integer> hm = new HashMap<>();
//        for (int num : arr1) {
//            hm.put(num, hm.getOrDefault(num, 0) + 1);
//        }
//
//        for (int num : arr2) {
//            while (hm.get(num) > 0) {
//                result[count++] = num;
//                hm.put(num, hm.get(num) - 1);
//            }
//            hm.remove(num);
//        }
//
//        var remaining = new int[arr1.length - count];
//        var index = 0;
//        for (int num : arr1) {
//            if (hm.containsKey(num)) {
//                while (hm.get(num) > 0) {
//                    remaining[index++] = num;
//                    hm.put(num, hm.get(num) - 1);
//                }
//                hm.remove(num);
//            }
//        }
//
//        Arrays.sort(remaining);
//        for (int num : remaining) {
//            result[count++] = num;
//        }
//        return result;
    }

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        // TC1
        /* Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
           Output: [2,2,2,1,4,3,3,9,6,7,19] */
        var arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        var arr2 = new int[]{2, 1, 4, 3, 9, 6};
        // TC2
        /* Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
           Output: [22,28,8,6,17,44] */

        print(relativeSortArray(arr1, arr2));
    }
}
