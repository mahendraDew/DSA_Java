package Leetcode_Topicwise_Ques.Array;
import java.util.Arrays;;
public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {
        int[] arr = new int[3];
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]]++;
        }
        System.out.println(Arrays.toString(arr)); 
            // int i = 0;
            int index = 0;
            for(int i = 0; i<arr.length; i++){
                while(arr[i] > 0){
                    nums[index++] = i;
                    arr[i]--;
                }
            }
        
    }
}
