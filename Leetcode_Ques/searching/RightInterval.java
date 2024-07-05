package Leetcode_Ques.searching;

import java.util.Arrays;

public class RightInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{2,3},{3,4}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
        System.out.println(Arrays.toString(findRightInterval2(intervals)));
    }

    //Approach 1: bruteforce approach
    public static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];

        for(int i = 0; i<intervals.length; i++){
            int endEle = intervals[i][1];
            int diff = 0;
            int result = -1;
            int minDiff = Integer.MAX_VALUE;
            for( int j = 0; j<intervals.length; j++){
                if(i == j){
                    continue;
                }
                if(intervals[j][0]>=endEle){
                    diff = Math.abs(intervals[j][0] - endEle);
                    if(minDiff > diff){
                        minDiff = diff;
                        result =  j;
                    }int n = intervals.length;
                }

            }

            ans[i] = result;
        }

        return ans;
    }



    // approach 2: bsearch approach
    public static int[] findRightInterval2(int[][] intervals){
        int n = intervals.length;
        int[] ans = new int[n];
        int[][] newArr = new int[n][2];
        for(int i = 0; i<n; i++){
            newArr[i][0] = intervals[i][0];
            newArr[i][1] = i;
        }
        Arrays.sort(newArr, (a,b) -> a[0]-b[0]);
        for(int i = 0; i<n; i++){
            int target = intervals[i][1];
            int l = 0; int r = n-1;
            while(l<=r){
                int mid = (l+r)/2;
                if(newArr[mid][0] < target){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
            if(l<n){
                ans[i] = newArr[l][1];
            }else{
                ans[i] = -1;
            }
        }

        return ans;
    }
}