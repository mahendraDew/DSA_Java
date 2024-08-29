import java.util.ArrayList;

/**
 * SubseqWithASCII
 */
public class SubseqWithASCII {

    public static void main(String[] args) {
        String str = "abc";
        subsqASCII("",str);
        System.out.println("arraylist>>>>>>");
        System.out.println(subsqASCII2("", str));
    }
    public static void subsqASCII(String p, String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        // subsqASCII(p+ch, str.substring(1));
        subsqASCII(p+(ch+0), str.substring(1));
        subsqASCII(p, str.substring(1));

    }
    public static ArrayList<String> subsqASCII2(String p, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        // ArrayList<String> first = subsqASCII2(p+ch, str.substring(1));
        ArrayList<String> thrd = subsqASCII2(p+(ch+0), str.substring(1));
        ArrayList<String> sec = subsqASCII2(p, str.substring(1));
        thrd.addAll(sec);
        // first.addAll(thrd);

        return thrd;
    }
}