package Leetcode_Topicwise_Ques.Array;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,-1};
        System.out.println(firstMissing(arr));
    }
    private static int firstMissing(int[] nums){
        int i = 0;
        int orgIndx;
        while(i<nums.length){
            if(nums[i] == 0){
                i++;
                continue;
            }
            if(nums[i]<0){
                nums[i] = 0;
                orgIndx = 0;
            }else{
                orgIndx = nums[i]-1;
            }
            if(orgIndx >= nums.length){
                i++;
                continue;
            }
            if(nums[i] != nums[orgIndx]){
                int temp = nums[i];
                nums[i] = nums[orgIndx];
                nums[orgIndx] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return i+1;
    }
}
