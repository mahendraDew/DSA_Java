//238. Product of Array Except Self: https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;

class ProductofArrayExceptSelf{
    // #1 bruteforce app - O(n^2)
    public int[] productExceptSelf1(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int prod = 1;
            for(int j = 0; j<nums.length; j++){
                if(i == j){
                    continue;
                }
                prod *= nums[j];
            }
            ans[i] = prod;
        }   

        return ans;
    }
    // #2 Dividing the curr num - O(n)  -- but gives err if we divide the ele by 0(which can happend)
    public int[] productExceptSelf2(int[] nums) {
        int[] ans = new int[nums.length];
        int prod = 1;
        for(int i: nums){
           prod *= i;
        }   
        for(int i = 0; i<nums.length; i++){
            ans[i] = prod/nums[i];
        }

        return ans;
    }
    // #3 taking prefix & suffix arr and adding them for curr ele - O(n) 
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }

   
}