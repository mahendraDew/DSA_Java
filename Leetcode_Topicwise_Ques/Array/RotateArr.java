package Leetcode_Topicwise_Ques.Array;

import java.util.Arrays;

public class RotateArr {
    public static void rotate(int[] nums, int k) {
       int n = nums.length;
       k = k%n;
       rev(nums, 0, n);
       rev(nums, 0, k);
       rev(nums, k, n);
    }
    private static void rev(int[] nums, int start, int end){
        while(start<=end-1){
            int temp = nums[start];
            nums[start] = nums[end-1];
            nums[end-1] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
