package Leetcode_Topicwise_Ques.recursion;

import java.util.Arrays;

public class SumTrianglefromArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        printTriangle(A);
    }
    public static void printTriangle(int[] arr){
        if(arr.length < 1){
            return;
        }    
        int[] temp = new int[arr.length-1];
        for(int i = 0; i<arr.length-1; i++){
            temp[i] = arr[i] + arr[i+1];
        }
        printTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }

}
