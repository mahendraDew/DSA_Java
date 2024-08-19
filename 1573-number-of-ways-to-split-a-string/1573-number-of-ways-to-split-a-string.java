class Solution {
    public int numWays(String s) {
       char[] charr = s.toCharArray();
        long one = 0;
        for(int i = 0; i<charr.length; i++){
            if(charr[i] == '1'){
                one++;
            }
        }
        long n = s.length();
        long mod = 1_000_000_007;
        if(one == 0){
            return (int)((((n-1)*(n-2))/2)%mod);
        }
        if(one%3 != 0){
            return 0;
        }

        long ones = one/3;
        one = 0;
        long part1 = 0;
        long part2 = 0;
        for(char ch: charr){
            if(ch == '1'){
                one++;
            }
            if(one == ones){
                part1++;
            }
            if(one == 2*ones){
                part2++;
            }
        }
        return (int)((part1*part2)%mod); 
    }
}