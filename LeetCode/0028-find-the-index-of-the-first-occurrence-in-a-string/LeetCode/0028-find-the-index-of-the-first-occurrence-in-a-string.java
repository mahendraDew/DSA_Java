class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        for (int i = 0; i < n; i++) {
            if(haystack.startsWith(needle)){
                return i;
            }

            else{
                haystack = haystack.substring(1);

            }
        }
        
        return -1;
    }
}
