package Leetcode_Ques.sorting;

import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int[] nums = {3,2,1,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = 0;
        while(i < nums.length){
            if((nums[i] & 1) == 0){ //checking for even nums
                //swap 
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        return nums;
    }
}
