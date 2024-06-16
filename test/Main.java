package test;

import java.io.*;
import java.util.*;

class Main {

    static int[][] findPairsWithGivenDifference(int[] arr, int k) {
        List<int[]> result = new ArrayList<>();
        Set<Integer> valueSet = new HashSet<>();

        for (int num : arr) {
        // Step 1: Populate the set with array elements
            valueSet.add(num);
        }

        // Step 2: Iterate through the array to find pairs
        for (int y : arr) {
            int x = y + k;
            if (valueSet.contains(x)) {
                result.add(new int[]{x, y});
            }
        }

        // Convert list of pairs to a 2D array
        int[][] resultArray = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {0, -1, -2, 2, 1};
        int k1 = 1;
        int[][] result1 = findPairsWithGivenDifference(arr1, k1);
        for (int[] pair : result1) {
            System.out.println(Arrays.toString(pair));
        }
        
        // Test case 2
        int[] arr2 = {1, 7, 5, 3, 32, 17, 12};
        int k2 = 17;
        int[][] result2 = findPairsWithGivenDifference(arr2, k2);
        for (int[] pair : result2) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
