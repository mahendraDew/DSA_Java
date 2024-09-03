package Leetcode_Topicwise_Ques.recursion;

public class FibonacciNum {
    public static void main(String[] args) {
        //          n =  0, 1, 2, 3, 4, 5, 6, 7,  8, 9 ,  10
        // fibo series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
        int n = 9;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
