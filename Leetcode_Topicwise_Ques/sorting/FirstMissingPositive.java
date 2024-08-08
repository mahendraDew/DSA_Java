package Leetcode_Topicwise_Ques.sorting;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int[] arr = new int[nums.length+1];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] <= nums.length && nums[i] > 0){
                arr[nums[i]-1]++;
            }
        }
        System.out.println("this is arr:"+Arrays.toString(arr));
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                return i+1;
            }
        }

        return -1;

    }
}
