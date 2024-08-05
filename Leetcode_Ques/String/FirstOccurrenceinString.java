package Leetcode_Ques.String;

public class FirstOccurrenceinString {
    public static void main(String[] args) {
        String haystack = "a", needle = "a";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        for (int i = 0; i < n; i++) {
            if(haystack.startsWith(needle)){
                return i;
            }

            else{
                haystack = haystack.substring(1);

            }
        }
        return -1;
    
    }
}
