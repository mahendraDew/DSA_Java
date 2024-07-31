package Leetcode_Ques.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        System.out.println(Arrays.toString(insertion(arr)));
    }
    public static int[] insertion(int[] arr){
        for(int i  = 0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }

        return arr;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
