package recurrsion_sorting;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        mergesortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesortInPlace(int[] arr, int start, int end){
        if(end-start == 1){
            return;
        }
        int mid = (start + end )/2;
        mergesortInPlace(arr, start, mid);
        mergesortInPlace(arr, mid, end);
        mergeInPlace(arr, start, mid, end);
    }
    public static void mergeInPlace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while(i<mid && j<end){
            if(arr[i]>arr[j]){
                mix[k] = arr[j];
                j++;
            }else{
                mix[k] = arr[i];
                i++;
            }
            k++;
        }
        while(i<mid){
            mix[k++] = arr[i++];
        }
        while(j<end){
            mix[k++] = arr[j++];
        }
        for(int l = 0; l<mix.length; l++){
            arr[start + l] = mix[l];
        }
    }
}
