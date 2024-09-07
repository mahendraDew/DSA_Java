package Leetcode_Topicwise_Ques.recursion;

import java.util.Arrays;

public class Checkforbalancedparenthesiswithoutusingstack {
    public static void main(String[] args) {
        String exp = "[()]{}{[()()]()}";
        char[] expArr = exp.toCharArray();
        System.out.println(check(expArr, expArr.length));
    }
    public static boolean check(char[] exp, int n){
        if(n == 0){
            return true;
        }
        if(n == 1){
            return false;
        }
        if(exp[0] == ')' || exp[0] == ']' || exp[0] == '}' ){
            return false;
        }
        char closing = findclosing(exp[0]);

        int i, count = 0;
        for(i = 1; i<n; i++){
            if(exp[i] == exp[0]){
                count++;
            }
            if(exp[i] == closing){
                if(count == 0){
                    break;
                }
                count--;
            }
        }

        if(i == n){
            return false;
        }

        if(i == 1){
            return check(Arrays.copyOfRange(exp, i+1, n), n-2);
        }

        return check(Arrays.copyOfRange(exp, 1, i), i-1) && check(Arrays.copyOfRange(exp, i+1, n), n-1-i);
    }
    public static char findclosing(char ch){
        if(ch == '(')
            return ')';
        else if(ch == '{')
            return '}';
        else if(ch == '[')
            return ']';

        return ')';
    }

}
