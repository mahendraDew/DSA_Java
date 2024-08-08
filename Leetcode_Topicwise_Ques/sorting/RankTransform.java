package Leetcode_Topicwise_Ques.sorting;

import java.util.Arrays;
import java.util.HashSet;

public class RankTransform {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr){
            set.add(ele);
        }
        int[] temparr = new int[set.size()];
        int i = 0;
        for(int ele: set){
            temparr[i++] = ele;
        }
        Arrays.sort(temparr);
        //make sure this arr do not contain any duplicate ele
        
        for(i = 0; i<arr.length; i++){
            arr[i] = bsearch(temparr, arr[i]);
        }

        return arr;
    }
    public static int bsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(arr[mid] == target){
                return mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return -1;
    }
}