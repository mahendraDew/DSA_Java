package Leetcode_Topicwise_Ques.sorting;

import java.util.Arrays;

public class LargestNum {
     public static String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        StringBuilder sb = new StringBuilder("");
        Arrays.sort(str, (a,b)->(b+a).compareTo(a+b));
        for(String s: str){
            sb.append(s);
        }
        String res = sb.toString();
        return res.startsWith("0")? "0" : res;
    }
    public static void main(String[] args) {
        int[] nums = {};
        String str = largestNumber(nums);
        System.out.println(str);
    }
}
