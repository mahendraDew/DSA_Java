package Leetcode_Topicwise_Ques.recursion;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        printNos(n);
    }
    public static void printNos(int n){
        printHelper(n, 0);
    }
    public static void printHelper(int n , int i){
        if(i == n){
            return;
        }
        System.out.println(i+1);
        printHelper(n, i+1);
    }
}
