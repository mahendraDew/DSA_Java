package recurrsion_google_amazon_ques;

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        String str = "12";
        pad("",str);
        System.out.println(padRet("", str));
        System.out.println(padCount("", str));
    }
    private static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            pad(p+ch, up.substring(1));
        }
    }

    //return as an ArrayList
    private static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            list.addAll(padRet(p+ch, up.substring(1)));
        }
        return list;
    }

    //return the count of the ele
    private static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0)-'0';
        int count = 0;
        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a'+i);
            count += padCount(p+ch, up.substring(1));
        }

        return count;
    }
}
