//128. Longest Consecutive Sequence: https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.Arrays;

class LongestConsecutiveSequence{
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int count = 1;
        int result = 1;
        Arrays.sort(nums);
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                count++;
            }
            else if(nums[i] == nums[i-1]){
                continue;
            }
            else{
                result = Math.max(result, count);
                count = 1;
            }
        
        }
        result = Math.max(result, count);
        return result;
    }
}