//1. Two Sum
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // O(n^2)
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1,-1};
    }
    // O(n)
    public int[] twoSum_2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        
        //populate the map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        //find the complement
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(map.containsKey(comp) && map.get(comp) != i){
                return new int[]{i, map.get(comp)};
            }
        }


        return new int[]{-1,-1};
    }
    
}
