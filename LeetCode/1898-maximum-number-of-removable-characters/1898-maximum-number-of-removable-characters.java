class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int left = 0, right = removable.length;
        while(left < right){
            int mid = left + (right - left + 1)/2;
            if(isSubseq(s,p,removable, mid)){
                left = mid;
            }else {
                right = mid-1;
            }
        }

        return left;
    }

    private boolean isSubseq(String s, String p, int[] removable, int k){
        boolean[] removed = new boolean[s.length()];
        for(int i = 0; i<k; i++){
            removed[removable[i]] = true;
        }

        int i = 0, j = 0;
        while(i<s.length() && j<p.length()){
            if(removed[i]){
                i++;
                continue;
            }
            if(s.charAt(i) == p.charAt(j)){
                i++;
                j++;
            }else {
                i++;
            }
        }

        return j==p.length();
    }
}