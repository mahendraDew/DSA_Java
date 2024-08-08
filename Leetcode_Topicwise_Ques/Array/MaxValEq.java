package Leetcode_Topicwise_Ques.Array;

public class MaxValEq {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,3},{2,0},{5,10},{6,-10}};
        int k = 1;
        // int[][] arr = new int[][]{{0,0},{3,0},{9,2}};
        // int k = 3;
        System.out.println(findMaxValueOfEquation(arr, k));
    }

    public static int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        int i = 0; 
        int j = 1;

        while(i<j && j<points.length){
            int diff = points[j][0] - points[i][0];
            if(diff<=k){
                int sum = points[j][1] + points[i][1] + diff;
                if(max<sum){
                    max = sum;
                }

                if(points[j][1] - points[i][1] > points[j][0] - points[i][0]){
                    i=j;
                }
                j++;
            }else{
                if(j == i+1){
                    j++;
                }
                i++;
            }
        }
        return max;
    }
}
