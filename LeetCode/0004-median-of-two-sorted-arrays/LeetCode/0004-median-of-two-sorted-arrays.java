class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int i = 0;
      int j = 0;
      int k = 0;
      int[] ans = new int[nums1.length+nums2.length];
      double result = 0;
      while(i<nums1.length && j<nums2.length){
        if(nums1[i] < nums2[j]){
            ans[k] = nums1[i++];
        }else{
            ans[k] = nums2[j++];
        }
        k++;
      }  
      while(i<nums1.length){
        ans[k++] = nums1[i++];
      }
      while(j<nums2.length){
        ans[k++] = nums2[j++];
      }
      if(ans.length%2 == 0){
        result = (double) (ans[(ans.length/2)-1] + ans[((ans.length/2) + 1) - 1])/2;
      }else{
        result = (double)(ans[ans.length/2]);
      }

      return result;
    }
}