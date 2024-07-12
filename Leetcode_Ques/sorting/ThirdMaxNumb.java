package Leetcode_Ques.sorting;

import java.util.Arrays;

public class ThirdMaxNumb {
    public static void main(String[] args) {
        int[] nums  = {2,2,2,2,1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        if(nums.length == 0){
            return 0;
        }if(nums.length == 1){
            return nums[0];
        }

        int flag = 0;
        int count = 1;
        for(int i = nums.length-1; i>=0; i--){
          
            if(i > 0 && nums[i] == nums[i-1]){
                flag++;
            }else if(i>0){
                count++;
            }

            if(count == 3){
                return nums[nums.length - count - flag];
            }
        }
        return nums[nums.length-1];
    }
}