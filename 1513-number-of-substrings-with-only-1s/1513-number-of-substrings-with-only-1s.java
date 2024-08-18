class Solution {
    public int numSub(String s) {
        int count = 0;
        int total = 0;
        int mod = 1_000_000_007;
        for(char ch: s.toCharArray()){
            count = (ch =='1')? count +1 : 0;
            total = (total + count)%mod;
        }
        return total;
    }
}