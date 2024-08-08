package Leetcode_Topicwise_Ques.Array;

import java.util.Arrays;

public class GrumpyBookStore {
    public static void main(String[] args) {
        int[] customers = {1};
        int[] grumpy = {0};
        int minutes = 1;
        System.out.println(maxSatisfied(customers, grumpy, minutes));
    }

    public static  int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max = Integer.MIN_VALUE;
        int maxIndx = 0;
        for(int i = 0; i<customers.length && i<=customers.length-minutes; i++){
            int sum = 0;
            for(int j = i; j<i+minutes; j++){
                sum += customers[j];
            }
            if(max<sum){
                max = sum;
                maxIndx = i;
            }
        }
      //update the grumpy
      for(int i = maxIndx; i<maxIndx+minutes; i++){
        
        grumpy[i] = 0;
        System.out.println(Arrays.toString(grumpy));
      }
      int total = 0;

      for(int i = 0; i<grumpy.length;i++){
        if(grumpy[i] == 0){
            total += customers[i];
        }
      }

      return total;
    }
}
