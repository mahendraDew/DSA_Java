
public class MinimumLengthofStringAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        String  s = "cabaabasac";
        System.out.println(minimumLength(s));
    }

    public static int minimumLength(String s) {
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
