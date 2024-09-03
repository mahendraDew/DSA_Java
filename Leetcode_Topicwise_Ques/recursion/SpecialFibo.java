package Leetcode_Topicwise_Ques.recursion;

import java.util.Scanner;

public class SpecialFibo {
    public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println();
            System.out.println(fibo(a,b,n));
        }
        
        scanner.close();
    }
    public static int fibo(int a, int b, int n){
        if(n == 0){
            return a;
        }else if(n == 1){
            return b;
        }else if(n == 2){
            return a^b;
        }else{
            return fibo(a, b, n%3);
        }
    }
}
