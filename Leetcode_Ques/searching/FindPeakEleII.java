package Leetcode_Ques.searching;

public class FindPeakEleII {
    public static void main(String[] args) {
        
    }
    public static int[] findPeakGrid(int[][] mat) {
        int startCol = 0;
        int endCol = mat[0].length-1;

        while(startCol<= endCol){
            int midCol = startCol + (endCol - startCol)/2;
            int eleMaxRow = 0;
            for(int row = 0; row<mat.length; row++){
                if(mat[row][midCol] >= mat[eleMaxRow][midCol]){
                    eleMaxRow = row;
                }
            }

            boolean isLeftBig = midCol-1 >= startCol && mat[eleMaxRow][midCol-1] > mat[eleMaxRow][midCol];
            boolean isRightBig = midCol+1 <= endCol && mat[eleMaxRow][midCol+1] > mat[eleMaxRow][midCol];

            if(!isLeftBig && !isRightBig){
                return new int[]{eleMaxRow, midCol};
            }
            else if(isRightBig){
                startCol = midCol+1;
            }else{
                endCol = midCol-1;
            }
        }

        return new int[]{-1, -1};
    }
}