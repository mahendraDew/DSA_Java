package Leetcode_Ques.searching;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,}, {4,5,6},{7,8,9}};
        System.out.println(searchMatrix(mat, 53));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1){
            return bsearch(matrix, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols/2;
        while(rStart < (rEnd-1)){
            int mid = rStart  + (rEnd - rStart)/2;
            if(matrix[mid][cMid] == target){
                return true;
            }else if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        if(matrix[rStart][cMid] == target){
            return true;
        }
        if(matrix[rStart+1][cMid] == target){
            return true;
        }
        
        if(matrix[rStart][cMid-1] >= target){
            return bsearch(matrix, rStart, 0, cMid-1, target);
        }
        if(matrix[rStart][cMid+1] <= target && target <= matrix[rStart][cols-1] ){
            return bsearch(matrix, rStart, cMid+1, cols-1, target);
        }
        if(matrix[rStart+1][cMid-1] >= target){
            return bsearch(matrix, rStart+1, 0, cMid-1, target);            
        }
        else{
            return bsearch(matrix, rStart+1, cMid+1, cols-1, target);
        }
    }

    private static boolean bsearch(int[][] matrix, int row, int start, int end, int target){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(matrix[row][mid] == target){
                return true;
            }else if(matrix[row][mid] > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return false;
    }
}