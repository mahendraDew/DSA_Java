package Leetcode_Topicwise_Ques.recursion;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        revHelper(s, 0);
    }
    public static void revHelper(char[] s, int i){
        int e = s.length-1-i;
        if(e == i || i>e){
            return;
        }
        char ch = s[i];
        s[i] = s[e];
        s[e] = ch;
        revHelper(s, i+1);
    }
}
