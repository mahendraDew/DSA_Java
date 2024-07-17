package Leetcode_Ques.sorting;

import java.util.Arrays;

public class MatrixCellsinDistanceOrder {
    public static void main(String[] args) {
        int rows = 2, cols = 3, rCenter = 1, cCenter = 2;
        int[][] ansMat = allCellsDistOrder(rows, cols, rCenter, cCenter);
        for(int[] mat: ansMat){
            System.out.println(Arrays.toString(mat));
        }
    }
    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] mat = new int[rows][cols];
        int[][] ans = new int[rows*cols][2];
        int k = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                mat[i][j] = Math.abs(i-rCenter)+Math.abs(j-cCenter);
                ans[k][0] = i;
                ans[k][1] = j;
                k++;
            }
        }

        for(int i = 0; i<ans.length; i++){
            for(int j=1; j<ans.length - i; j++){
                if(mat[ans[j-1][0]][ans[j-1][1]] > mat[ans[j][0]][ans[j][1]] ){
                    //swwap the values
                    int tempRow = ans[j-1][0];
                    int tempCol = ans[j-1][1];
                    ans[j-1][0] = ans[j][0];
                    ans[j-1][1] = ans[j][1];
                    ans[j][0] = tempRow;
                    ans[j][1] = tempCol;
                }
            }
        }

        return ans;
    }
}