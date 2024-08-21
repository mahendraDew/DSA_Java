class Solution {
    public int countHomogenous(String s) {
        int mod = 1_000_000_007;
        int ans = 0;
        int charFreq = 0;
        char prevCh = 'A';
        for(char ch: s.toCharArray()){
            if(ch == prevCh){
                charFreq++;
            }else{
                charFreq = 1;
            }
            ans = (ans % mod + charFreq % mod)%mod;
            prevCh = ch;
        }
        return ans;
    }
}