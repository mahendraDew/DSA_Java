package Leetcode_Topicwise_Ques.recursion;

import java.util.Scanner;
import java.util.Arrays;

public class GeekonacciNumber {
    public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
     
        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int n = scanner.nextInt();
            int ans = fibo(a, b, c, n);
            System.out.print(ans);
        }
      
        scanner.close();

        // int a = 1, b = 3, c = 2, n = 7;
        // System.out.println(fibo(a, b, c, n));

    }
    static int fibo(int a, int b, int c, int n){
        if(n <= 1){
            return a;
        }else if(n == 2){
            return b;
        }else if(n == 3){
            return c;
        }
        return fibo(a, b, c, n-1) + fibo(a, b, c, n-2) + fibo(a, b, c, n-3);
    }
}
