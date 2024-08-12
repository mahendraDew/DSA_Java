class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return checkPalin(a, b) || checkPalin(b, a);
    }
    public boolean checkPalin(String a, String b){
        int i = 0; 
        int j = a.length()-1;
        while(i<j && a.charAt(i) == b.charAt(j)){
            i++;
            j--;
        }
        return isPalin(a, i, j) || isPalin(b, i, j);
    }
    public boolean isPalin(String s, int i, int j){
        while(i<j && s.charAt(i) == s.charAt(j)){
            i++;
            j--;
        }

        return i>=j;
    }
}