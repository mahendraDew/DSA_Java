package Leetcode_Topicwise_Ques.searching;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1}, nums2 = {2,2};
       System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums2[j]>nums1[i]){
                i++;
            }else{
                list.add(nums2[j]);
                i++;
                j++;
            }
        }
        int[] arr = new int[list.size()];
        for(int k = 0; k<list.size(); k++){
            arr[k] = list.get(k);
        }

        return arr;
    }
}

