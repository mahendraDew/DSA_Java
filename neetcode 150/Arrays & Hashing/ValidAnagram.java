// 242. Valid Anagram

import java.util.Arrays;

public class ValidAnagram {
    //O(n)
    public boolean isAnagram(String s, String t) {
       char[] sch = s.toCharArray();
       char[] tch = t.toCharArray();

       Arrays.sort(sch);
       Arrays.sort(tch);

       return Arrays.equals(sch, tch);
    } 
    
}
