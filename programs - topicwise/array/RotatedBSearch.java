package array;

import java.util.Arrays;

public class RotatedBSearch {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(RBSearch(arr, target));
    }
    public static int RBSearch(int[] arr, int target){
        //find the pivot
        
        int pivot = findPivot(arr);
        if(pivot == -1){
            return bSearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return bSearch(arr, target, 0, pivot-1);
        }
        return bSearch(arr, target, pivot+1, arr.length-1);


    }
    public static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        
        while(s<e){
            int mid = s + (e-s)/2;
            if(mid<e && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[s] >= arr[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }

        return -1;
    }
    public static int bSearch(int[] arr, int tar, int start, int end){
        System.out.println(Arrays.toString(arr));
        System.out.println("start:"+start+" End:"+end);
        while(start<=end){
            int mid = start + (end - start)/2;
            if(tar < arr[mid]){
                end = mid-1;
            }
            else if(tar > arr[mid]){
                start = mid+1;
            } else{
                return mid;
            }
            
        }

        return -1;

    }

    static int findPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid -1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(start < end && arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(start < end && arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }

        return -1;
    }
}
