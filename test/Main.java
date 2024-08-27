package test;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
       String[] arr = new String[]{"1","2","3"};

       int[] res = new int[arr.length];
       for(int i = 0; i<arr.length; i++){
        res[i] = Integer.valueOf(arr[i]);
       }
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(res));
    }
}