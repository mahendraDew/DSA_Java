class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        if(s.charAt(s.length()-1) == '1'){
            return false;
        }
        boolean[] avail = new boolean[s.length()];
        avail[0] = true;
        int start;
        int end = 0;
        for(int i = 0; i<s.length(); i++){
            if(!avail[i]){
                continue;
            }
            start = Math.max(i+minJump, end + 1);
            end = Math.min(i+maxJump, s.length()-1);
            for(int j = start; j<=end; j++){
                if(s.charAt(j) == '0'){
                    avail[j] = true;
                }
                if(avail[avail.length-1]){
                    return true;
                }
            }
        }
        return avail[s.length() - 1];
    }
}