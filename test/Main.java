package test;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
       int[] arr = new int[]{1,2,3,4};
       int[] ans = product(arr);
       System.out.println(Arrays.toString(ans));
    } 
    static int[] product(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i<n; i++){
            ans[i] *= curr;
            curr *= ans[i];
        }

        curr = 1; 
        for(int i = n-1; i>=0; i--){
            ans[i] *= curr;
            curr *= ans[i];
        }
        

        return ans;
    }
    
}
