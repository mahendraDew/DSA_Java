package Leetcode_Topicwise_Ques.recursion;

public class TargetSum {
    public static void main(String[] args) {
                 //   0 1 2 3 4 
        int[] nums = {1,1,1,1,1}; //target = 3
        //            8 7 6 5 4 
        int target = 3;
    
        System.out.println(findTargetSumWays(nums, target));
    }
    public static int findTargetSumWays(int[] nums, int target) {
        return totalWays(nums, target, nums.length-1);
    }

     public static int totalWays(int[] nums, int target, int index) {
        if(index==0){
            int ways = 0; 
            if((target - nums[index] == 0))
                ways++; 
            if(target + nums[index] == 0)
                ways++; 
            
            return ways; 
        }
        int addition = totalWays(nums, target + nums[index], index-1);
        int subtraction = totalWays(nums, target - nums[index], index-1);

        return addition + subtraction;  
    }
}
