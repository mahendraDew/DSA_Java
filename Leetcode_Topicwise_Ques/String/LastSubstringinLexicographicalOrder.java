public class LastSubstringinLexicographicalOrder {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(lastSubstring(s));
    }
    public static String lastSubstring(String s) {
        char[] chArr = s.toCharArray();
        int i = 0;
        int j = 1;
        int k = 0;
        int n = s.length();
        while (j + k < n){
            if (chArr[i + k] == chArr[j + k]) {
                k++;
            } else if (chArr[i + k] > chArr[j + k]) {
                j = j + k + 1;
                k = 0;
            } else {
                i = Math.max(i + k + 1, j);
                j = i + 1;
                k = 0;
            }
        }
        return s.substring(i);
    }
}