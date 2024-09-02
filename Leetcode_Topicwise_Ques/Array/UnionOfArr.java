package Leetcode_Topicwise_Ques.Array;

import java.util.ArrayList;

public class UnionOfArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5};
        int[] arr2 = {4,6,7};
        System.out.println(findUnion(arr1, arr2, arr1.length, arr2.length));
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        int ptr1 = 0;
        int ptr2 = 0;
       
        while(ptr1<arr1.length && ptr2<arr2.length){
            if(arr1[ptr1] <= arr2[ptr2]){
                if(list.size() == 0 || list.get(list.size()-1) != arr1[ptr1]){
                    list.add(arr1[ptr1++]);
                }
            }else{
                if(list.size() == 0 || list.get(list.size()-1) != arr2[ptr2]){
                    list.add(arr2[ptr2++]);
                }
            }
        }
        while(ptr1<arr1.length){
            if(list.get(list.size()-1) != arr1[ptr1]){
                list.add(arr1[ptr1++]);
            }
        }
        while(ptr2<arr2.length){
            if(list.get(list.size()-1) != arr2[ptr2]){
                list.add(arr2[ptr2++]);
            }
        }
        
        return list;
    }
}
