class Solution {
   static void helper(StringBuilder s, long arr[], char alpha[]){
        for(int i=0; i<arr.length; i++){
            long a = s.charAt(i)-97;
            a = a+arr[i];
            a=a%26;
            s.replace(i,i+1,alpha[(int)a]+"");
        }
    }
    public String shiftingLetters(String str, int[] arr) {

        StringBuilder s = new StringBuilder(str);
        char alpha[] = new char[26];
        char ch = 'a';

        for(int i=0; i<26; i++){
            alpha[i] = ch;
            ch++;
        }

        int n = arr.length;
        long a[] = new long[n];
        a[n-1] = arr[n-1];

        for(int i=n-2; i>=0; i--){
            a[i] = a[i+1]+arr[i];
        }

        helper(s,a,alpha);
        return s.toString();
    }
}