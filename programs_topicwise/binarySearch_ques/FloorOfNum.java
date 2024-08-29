package binarySearch_ques;

class FloorOfNum {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 10;
        System.out.println(floor(arr, target));
    }
    public static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if(arr[mid] >= target){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        return end;
    }
    
}