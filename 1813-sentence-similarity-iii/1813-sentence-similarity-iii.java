class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length() == sentence2.length()){
            if(sentence1.equals(sentence2)){
                return true;
            }else {
                return false;
            }
        }

        String[] str1 = sentence1.split(" ");
        String[] str2 = sentence2.split(" ");
        int len1 = str1.length;
        int len2 = str2.length;
        int front1 = 0, front2 = 0;
        int back1 = len1-1, back2 = len2-1;

        while(len1 != 0 && len2 != 0 && str1[front1].equals(str2[front2])){
            len1--;
            len2--;
            front1++;
            front2++;
        }
        while(len1 != 0 && len2 != 0 && str1[back1].equals(str2[back2])){
            len1--;
            len2--;
            back1--;
            back2--;
        }

        return len1 == 0 || len2 == 0;
    }
}