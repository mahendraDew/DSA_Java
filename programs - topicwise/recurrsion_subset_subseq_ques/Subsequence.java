import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        subseq("", str);
        System.out.println(subseq2("", str));
    }
    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    public static ArrayList<String> subseq2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq2(p+ch, up.substring(1));
        ArrayList<String> right = subseq2(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
