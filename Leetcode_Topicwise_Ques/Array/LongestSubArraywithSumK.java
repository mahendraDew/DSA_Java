package Leetcode_Topicwise_Ques.Array;

import java.util.HashMap;

public class LongestSubArraywithSumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9}; 
        int k = 15;
        System.out.println(lenOfLongSubarr(arr, arr.length-1, k));
    }
    public static int lenOfLongSubarr(int a[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum += a[i];
            if(sum == k){
                maxLen = i+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }

            if(map.containsKey(sum - k)){
                maxLen = Math.max(maxLen, i - map.get(sum-k));
            }
        }
        return maxLen;
    }
}
