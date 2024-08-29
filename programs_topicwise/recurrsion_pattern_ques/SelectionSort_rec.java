package recurrsion_pattern_ques;

import java.util.Arrays;

public class SelectionSort_rec {
    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};
        int r = 4;
        int c = 0;
        int max = 0;
        selectionSort(arr, r, c, max);
    }
    static void selectionSort(int[] arr, int r, int c, int max){
        if(r == 0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(c<r){
            if(arr[max]<arr[c]){
                selectionSort(arr, r, c+1, c);
            }else{
                selectionSort(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[c];
            arr[c] = temp;
            selectionSort(arr, r-1, 0, 0);
        }
    }
}
