package Leetcode_Ques.sorting;


public class HeightChecker {
    public static void main(String[] args) {
        int[] height = {1,1,4,2,1,3};
        System.out.println(heightChecker(height));
    } 
    public static int heightChecker(int[] heights) {
        // app 1 ---> O(nlogn)
//         int[] arr = Arrays.copyOf(heights, heights.length);
//         Arrays.sort(arr);
//         int count = 0;
//         for(int i = 0; i<heights.length; i++){
//             if(arr[i] != heights[i]){
//                 count++;
//             }
//         }

//         return count;

        //app 2 -->O(n)
        int[] count = new int[101];
        for(int height: heights){
            count[height]++;
        } 
        int currHeight = 1;
        int ansCount = 0;
        for(int height: heights){
            while(count[currHeight] == 0){
                currHeight++;
            }
            if(height != currHeight){
                ansCount++;
            }
        }

        return ansCount;

    }
}