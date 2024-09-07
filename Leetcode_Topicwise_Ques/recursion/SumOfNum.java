package Leetcode_Topicwise_Ques.recursion;

public class SumOfNum {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(sum(n));
    }

    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return ( n %10 + sum(n/10));
    }
}
