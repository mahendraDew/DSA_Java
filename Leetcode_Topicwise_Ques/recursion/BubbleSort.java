package Leetcode_Topicwise_Ques.recursion;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {5, 1, 4, 2, 8};
        bubbleSort(ar, ar.length);
        System.out.println(Arrays.toString(ar));

    }

    public static void bubbleSort(int[] arr, int n){
        if(n == 1){
            return;
        }
        
        for(int i = 0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr, n-1);
    }
}
