package Leetcode_Topicwise_Ques.sorting;

public class MinAbsDiff {
    public static void main(String[] args) {
        int[] num1 = {1,28,21};
        int[] num2 = {9,21,20};
        System.out.println(minAbsoluteSumDiff(num1, num2));

    } public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int eleDiff = 0;
        int sum = 0;
        int maxDiff = 0;
        int maxDiffIndx = 0;
        for(int i = 0; i<nums1.length; i++){
            eleDiff = Math.abs(nums1[i] - nums2[i]);
            sum += eleDiff;
            if(maxDiff < eleDiff){
                maxDiff = eleDiff;
                maxDiffIndx = i;
            }
        }
        sum = sum - maxDiff;
        for(int i = 0; i<nums1.length; i++){
            eleDiff = Math.abs(nums1[i] - nums2[maxDiffIndx]);
            if(eleDiff < maxDiff){
                maxDiff = eleDiff;
            }
        }
        return sum + maxDiff;
        // return (int)(sum + maxDiff) % 1000000007;
    }
}