package Leetcode_Ques.searching;

public class FindMountainArr {
    public static void main(String[] args) {
        
    }
    public int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeak(mountainArr);
        int left = bsearch(mountainArr, 0, peak, target);
        if(left == -1){
            left = bsearch(mountainArr, peak, mountainArr.length-1,  target);
        }

        return left;
    }
    private int bsearch(int[] arr, int start, int end, int target){
        if(arr[start] < arr[end]){
            while (start <= end) {
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    return mid;
                }
                else if(arr[mid] > target){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }else {
            while(start <= end){
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    return mid;
                }else if(arr[mid] > target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }

        return -1;
    }
    private int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return end;
    }
}
