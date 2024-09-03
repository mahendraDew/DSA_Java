package Leetcode_Topicwise_Ques.recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 9;
        System.out.println(findTargetRecc(arr, target));
    }

    //simple binary search
    public static int findTargetsimple(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) /2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static int findTargetRecc(int[] arr, int target){
        return bsHelper(arr, 0, arr.length-1, target);
    }
    public static int bsHelper(int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return bsHelper(arr, start, mid-1, target);
        }
        return  bsHelper(arr, mid+1, end, target);
    }

}
