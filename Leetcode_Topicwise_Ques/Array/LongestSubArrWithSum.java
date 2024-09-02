package Leetcode_Topicwise_Ques.Array;

import java.util.HashMap;

// https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k
public class LongestSubArrWithSum {
    public static void main(String[] args) {
        // int[] arr = {10, 5, 2, 7, 1, 9};
        // int k = 15;
        int[] arr = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int k = 15;
        System.out.println(lenOfLongSubarr2(arr, arr.length, k));
    }
    public static int lenOfLongSubarr2(int arr[], int n, int k) {
         // HashMap to store (sum, index) pairs
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        // Traverse the given array
        for (int i = 0; i < n; i++) {
            // Accumulate sum
            sum += arr[i];

            // When subarray starts from index 0
            if (sum == k) {
                maxLen = i + 1;
            }

            // If 'sum' is not present in the map, add it with the index 'i'
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            // Check if 'sum - k' is present in the map or not
            if (map.containsKey(sum - k)) {
                // Update maxLength if needed
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }
        }

        // Return the required maximum length
        return maxLen;
    }
    public static int lenOfLongSubarr(int arr[], int N, int k) {
        int n = arr.length;
        int left = 0;
        int right = 0;
        long sum = arr[0];
        int maxLen = 0;
        while(right < n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if(right < n){
                sum += arr[right];
            }
        }

        return maxLen;
    }   
}
