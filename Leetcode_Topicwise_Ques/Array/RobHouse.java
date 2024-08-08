package Leetcode_Topicwise_Ques.Array;

public class RobHouse {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,1,3};
        System.out.println(rob(arr));
    }
    private static int rob(int[] nums){
        int prevMax = nums[0];
        int max = Math.max(prevMax, nums[1]);

        for(int i = 2; i<nums.length; i++){
            int curr = Math.max(max, prevMax + nums[i]);
            prevMax = max;
            max = curr; 
        }

        return max;
    }
}
