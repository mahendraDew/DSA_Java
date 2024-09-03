package Leetcode_Topicwise_Ques.recursion;

public class LenOfStr {
    public static void main(String[] args) {
        String  str = "Mahendra";
        System.out.println(strLen(str));
    }
    public static int strLen(String str){
        return lenHelper(str);
    }
    public static int lenHelper(String str){
        if(str.equals("")){
            return 0;
        }else{
            return lenHelper(str.substring(1))+1;
        }
    }
}
