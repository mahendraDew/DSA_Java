package recurrsion_arr_ques;

public class FindEle {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,6};
        int target = 4;
        //Approach 1
        // System.out.println(isPresent(arr, target));

        //Approach 2
        System.out.println(findEle(arr, target));
    }
    // Approach 1: return t/f if present
    static boolean isPresent(int[] arr, int target){
        return helper(arr, target, 0);
    }
    //Approach 1: return true/false if present
    static boolean helper(int[] arr, int target, int indx){
        if(indx == arr.length-1){
            return false;
        }
        return arr[indx] == target || helper(arr, target, indx+1);
    }

    //Approach 2: return indx if present, -1 otherwise
    static int findEle(int[] arr, int target){
        return findHelper(arr, target, 0);
    }
    static int findHelper(int[] arr, int target, int indx){
        if(indx == arr.length-1){
            return -1;
        }
        if(arr[indx] == target){
            return indx;
        }
        else{
            return findHelper(arr, target, indx+1);
        }
    }
}
