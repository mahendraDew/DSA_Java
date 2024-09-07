package Leetcode_Topicwise_Ques.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[]  candidates = {2,3,6,7}; 
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        sumHelper(0, candidates, target, res, curr);
        return res;
    }
    public static void sumHelper(int indx, int[] nums, int target, List<List<Integer>> res, List<Integer> curr ){
        if(indx == nums.length){
            if(target == 0){
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        if(nums[indx] <= target){
            curr.add(nums[indx]);
            sumHelper(indx, nums, target-nums[indx], res, curr);
            curr.remove(curr.size()-1);
        }
        sumHelper(indx+1, nums, target, res, curr);
    }
}
