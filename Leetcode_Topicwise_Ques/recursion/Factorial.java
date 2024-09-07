package Leetcode_Topicwise_Ques.recursion;

public class Factorial {
    public static void main(String[] args) {
        /*
         * n = 3
         * 3*2*1
         */
        
        int n = 5;
        System.out.println(fact(n));
    }
    public static int fact(int n ){
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
}
