package Leetcode_Topicwise_Ques.recursion;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPrime(n, 2));
    }
    public static boolean isPrime(int n, int i){
        if(n <= 2){
            return (n == 2)? true: false;
        }
        if(n%i == 0){
            return false;
        }
        if(i * i > n){
            return true;
        }
        return isPrime(n, i+1);
    }
}
