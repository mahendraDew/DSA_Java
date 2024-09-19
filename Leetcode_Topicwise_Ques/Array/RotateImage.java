package Leetcode_Topicwise_Ques.Array;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
       /*
        * Input: matrix = [[5 , 1, 9, 11],
                           [2 , 4, 8, 10],
                           [13, 3, 6,  7],
                           [15,14,12, 16]]

            step 1: transpose
                   Input: matrix = [[5 , 2,13, 15],
                                    [1 , 4, 3, 14],
                                    [ 9, 8, 6, 12],
                                    [11,10, 7, 16]]
            step 2: swap col wise
                   Input: matrix = [[15, 13, 2, 5],
                                    [14,  3, 4, 1],
                                    [12,  6, 8, 9],
                                    [16,  7,10,11]]
                                   

          Output: [[15,13,2,5],
                   [14,3,4,1],
                   [12,6,8,9],
                   [16,7,10,11]]
        */

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][] matrix = {{5,1,9,11},
        //                   {2,4,8,10},
        //                   {13,3,6,7},
        //                   {15,14,12,16}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix){
        // transpose
        int n = matrix.length;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // swap the cols left and right;
        for(int i = 0; i<n; i++){
            int left = 0;
            int right = matrix.length-1;
            for(int j = 0; j<matrix.length/2; j++){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
            
        }
        for(int i = 0; i<n; i++){
           System.out.println( Arrays.toString(matrix[i]));
        }
    }
}
