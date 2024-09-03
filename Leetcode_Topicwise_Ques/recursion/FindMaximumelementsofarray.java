package Leetcode_Topicwise_Ques.recursion;

public class FindMaximumelementsofarray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, -16};
        System.out.println(findMinRec(arr, arr.length));
    }
    public static int findMinRec(int arr[], int n) {
        if(n == 1){
            return arr[0];
        }
        return Math.min(arr[n-1], findMinRec(arr, n-1));
    }
}
