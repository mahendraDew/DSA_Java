package recurrsion_arr_ques;

public class RotatedBSearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        int target = 7;

        System.out.println(rbSearch(arr, target));
    }

    static int rbSearch(int[] arr, int target){
        return rbSearchHelper(arr, target, 0, arr.length-1);
    }
    static int rbSearchHelper(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int m = start+(end-start)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[start]<arr[end]){
            if(target >= arr[start] && target <= arr[m]){
                return rbSearchHelper(arr, target, start, m-1);
            }
            else{
                return rbSearchHelper(arr, target, m+1, end);
            }
        }
        if(arr[start]>=arr[m] && target<=arr[end]){
            return rbSearchHelper(arr, target, m+1, end);   
        }
        return rbSearchHelper(arr, target, start, m-1);

    }

}
