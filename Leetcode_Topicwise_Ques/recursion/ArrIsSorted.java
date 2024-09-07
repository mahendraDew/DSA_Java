package Leetcode_Topicwise_Ques.recursion;

public class ArrIsSorted {
    public static void main(String[] args) {
        int[] arr = {20, 21, 45, 89, 89, 99};
        System.out.println(isSorted(arr, arr.length));
    }
    public static boolean isSorted(int[] arr, int n){
        if(n <= 1 ){
            return true;
        }
      
        if(arr[n-1] >= arr[n-2]){
            return isSorted(arr, n-1);
        }
        return false;
    }
}
