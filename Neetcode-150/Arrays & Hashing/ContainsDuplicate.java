// 217. Contains Duplicate
import java.util.*;
/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {

    // O(nlogn)
    public static boolean containsDuplicate(int[] nums) {    
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    // O(n)
    public static boolean containsDuplicate_2(int[] nums) {    
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2,1,};
        System.out.println(containsDuplicate(nums));
    }

}