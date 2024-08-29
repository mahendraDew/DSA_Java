package recurrsion_arr_ques;

public class FindArrSorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int[] arr){
        return sortedHelper(arr, 0);
    }
    static boolean sortedHelper(int[] arr, int indx){
        if(indx == arr.length-1){
            return true;
        }
        return arr[indx] < arr[indx+1] && sortedHelper(arr, indx+1);
    }
}
