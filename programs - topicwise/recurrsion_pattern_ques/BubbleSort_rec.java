package recurrsion_pattern_ques;

import java.util.Arrays;

public class BubbleSort_rec {
    public static void main(String[] args) {
        int[] arr = {4,2,5,11,3};
        int r = 4;
        int c= 0;
        bubblesort(arr, r, c);
    }
    private static void bubblesort(int[] arr, int r, int c){
        if(r == 0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubblesort(arr, r, c+1);
        }
        else{
            bubblesort(arr, r-1, 0);
        }
    }
}
