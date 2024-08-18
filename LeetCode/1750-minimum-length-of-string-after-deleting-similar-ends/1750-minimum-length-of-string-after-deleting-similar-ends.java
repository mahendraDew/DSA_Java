class Solution {
    public int minimumLength(String s) {
        int start = 0;
       int end = s.length()-1;
       while(start<end && s.charAt(start) == s.charAt(end)){
          char c = s.charAt(start);
          while(start<=end && s.charAt(start) == c){
            start++;
          }
          while(start<end && s.charAt(end) == c){
            end--;
          }
       }

       return end - start +1;
    }
}