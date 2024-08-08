package Leetcode_Topicwise_Ques.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        int target = 8;

        System.out.println(fourSum(nums, target));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quad = new ArrayList<>();
        
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-3; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    long sum = (long)(nums[i] + nums[j]+ nums[left] + nums[right]);
                    if(sum > target){
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        quad.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left<right && nums[left] == nums[left+1]){
                            left++;
                        }
                        while(left<right && nums[right] == nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }


        return quad;
    }
    
}
