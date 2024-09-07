package Leetcode_Topicwise_Ques.recursion;


public class SumTillN {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return ( n + sum(n-1));
    }
}