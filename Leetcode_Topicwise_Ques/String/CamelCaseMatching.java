import java.util.ArrayList;


class CamelCaseMatching{
    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}; 
        String pattern = "FB";

        System.out.println(camelMatch(queries, pattern));
    } 
    public static ArrayList<Boolean> camelMatch(String[] queries, String pattern) {
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i = 0; i<queries.length; i++){
           if(patternMatch(queries[i], pattern)){
            list.add(true);
           }else{
            list.add(false);
           }
        }
        return list;
    }
    public static boolean patternMatch(String word, String pattern){
        int wordLen = word.length();
        int patternLen = pattern.length();
        int ptr1 = 0;
        int ptr2 = 0;
        while(ptr1<wordLen && ptr2<patternLen){
            if(word.charAt(ptr1) == pattern.charAt(ptr2)){
                ptr2++;
            }else if(Character.isUpperCase(word.charAt(ptr1))){
                return false;
            }
            ptr1++;
        }
        if(ptr2<patternLen){
            return false;
        }
        while (ptr1<wordLen) {
            if(Character.isUpperCase(word.charAt(ptr1))){
                return false;
            }
            ptr1++;
        }
        return true;
    }
}