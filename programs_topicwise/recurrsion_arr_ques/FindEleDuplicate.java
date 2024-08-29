package recurrsion_arr_ques;

import java.util.ArrayList;

public class FindEleDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,3,4,5};
        int target = 3;
        System.out.println(findEleDup(arr, target));
    }
    static ArrayList<Integer> findEleDup(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        return findEleDupHelper(arr, target, 0, list);
    }
    static ArrayList<Integer> findEleDupHelper(int[] arr, int target,int indx, ArrayList<Integer> list){
        if(indx == arr.length){
            return list;
        }
        if(arr[indx] == target){
            list.add(indx);
        }
        return findEleDupHelper(arr, target, indx+1, list);
    }
}
