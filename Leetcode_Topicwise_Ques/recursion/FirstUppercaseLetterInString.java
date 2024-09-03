package Leetcode_Topicwise_Ques.recursion;

public class FirstUppercaseLetterInString {
    public static void main(String[] args) {
        String Input = "geeksforGeeKs";
        System.out.println(firstRec(Input));
    }
    public static char firstIterative(String str){
        for(int i = 0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                return str.charAt(i);
            }
        }

        return 0;
    }

    public static char firstRec(String str){
        return firstHelper(str, 0);
    }
    public static char firstHelper(String str, int indx){
        if(indx > str.length()-1 || str.charAt(indx) == '\0'){
            return 0;
        }

        if(Character.isUpperCase(str.charAt(indx))){
            return str.charAt(indx);
        }

        return firstHelper(str, indx + 1);
    }

}
