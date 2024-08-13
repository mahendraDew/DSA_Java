package Leetcode_Topicwise_Ques.String;


public class ValidParentheses {
    public static void main(String[] args) {
        String s  = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int i = -1;
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack[++i] = ch; 
            }else {
                if(i>=0 && ((stack[i] == '(' && ch == ')') || (stack[i] == '{' && ch == '}') || (stack[i] == '[' && ch == ']'))){
                    i--;
                }else{
                    return false;
                }                
            }
        }
        for(char ch: stack){
            System.out.print(ch + " ");
        }
        System.out.println("stack len: "+stack.length);
        System.out.println("hheelloo");
        return i == -1;
    }
}
