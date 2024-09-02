package Leetcode_Topicwise_Ques.Array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[]  nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for(int r= 0; r<nums.length; r++){
            if(nums[r] != 0){
                int temp = nums[r];
                nums[r] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
