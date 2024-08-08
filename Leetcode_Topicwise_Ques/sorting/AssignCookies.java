package Leetcode_Topicwise_Ques.sorting;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {3};
        System.out.println(findContentChildren(g, s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        if(g.length == 1){
            if(bsearch(s, g[0])){
                count++;
            }
        }
        else{
            for(int i = 1; i<g.length; i++){
                if(g[i] != g[i-1] && bsearch(s, g[i-1])){
                    count++;
                }
            }
        }
        

        return count;
    }
    private static boolean bsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return false;
    }
}