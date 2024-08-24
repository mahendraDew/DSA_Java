class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int currCost = 0;
        int l = 0;
        int res = 0;
        for(int r = 0; r<s.length(); r++){
            currCost += Math.abs(s.charAt(r) - t.charAt(r));
            while(currCost > maxCost){
                currCost -= Math.abs(s.charAt(l) - t.charAt(l));
                l+=1;
            }
            res = Math.max(res, r-l+1);
        }

        return res;
    }
}