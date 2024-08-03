package Leetcode_Ques.sorting;

public class RevStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i = 0; i<arr.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(arr[i]);
            arr[i] = sb.reverse().toString();
        }

        StringBuilder sb = new StringBuilder();
        for(String str: arr){
            sb.append(str);
            sb.append(" ");
        }
        String str1 = sb.toString();
        str1 = str1.substring(0, str1.length()-1);
        return str1;
    }
    // approach 2
    public static String reverseWords2(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(arr[i]);
            arr[i] = sb.reverse().toString();
            sb2.append(arr[i]);
            if(i!=arr.length-1){
                sb2.append(" ");
            }
        }
        return sb2.toString(); 
    }
}
