package Leetcode_Ques.sorting;

public class SortingTheSentence {
    public static void main(String[] args) {
        String  s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            String str = arr[i];
            int num = (int)(str.charAt(str.length()-1)-'0');
            System.out.println(num);
            ans[num-1] = str.substring(0, str.length()-1);
        }
        int i = 0;
        for(i = 0; i<ans.length-1; i++){
            sb.append(ans[i] + " ");
        }
        sb.append(ans[i]);
        return sb.toString();
    }
}
