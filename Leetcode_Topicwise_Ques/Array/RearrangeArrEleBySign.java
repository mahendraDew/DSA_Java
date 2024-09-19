package Leetcode_Topicwise_Ques.Array;

import java.util.Arrays;

public class RearrangeArrEleBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int posIndx = 0;
        int negIndx = 1;
        int[] res = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                res[posIndx] = nums[i];
                posIndx+=2;
            }else{
                res[negIndx] = nums[i];
                negIndx+=2;
            }
        }

        return res;
    }
}
