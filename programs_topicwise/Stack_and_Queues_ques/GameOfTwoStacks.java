package Stack_and_Queues_ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameOfTwoStacks {
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b){
        int[] arr1 = new int[a.size()];
        int[] arr2 = new int[b.size()];

        for (int i = 0; i < a.size(); i++) {
            arr1[i] = a.get(i);
        }
        for (int i = 0; i < b.size(); i++) {
            arr2[i] = b.get(i);
        }
        return twoStacks(maxSum, arr1, arr2, 0, 0) -1;
    }
    private static int twoStacks(int maxSum, int[] a, int[] b, int sum, int count){
        
        
        if(sum > maxSum){
            return count;
        }
        if(a.length == 0 || b.length == 0){
            return count;
        }
        int ans1 = twoStacks(maxSum, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);
        int ans2 = twoStacks(maxSum, a, Arrays.copyOfRange(b, 1, b.length), sum+b[0], count+1);

        return Math.max(ans1 , ans2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        a.add(1);
        a.add(12);
        a.add(3);
        a.add(4);
        a.add(5);
        ArrayList<Integer> b = new ArrayList();
        b.add(6);
        b.add(7);
        b.add(8);


        int ans = twoStacks(10, a, b);
        System.out.println(ans);
    }
}
