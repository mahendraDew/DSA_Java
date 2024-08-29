
public class RemoveAFromStr {

    public static void main(String[] args) {
        String str = "baccad";
        char rm = 'a';
        remove("", str, rm);
        System.out.println(remove2(str));
    }
    public static void remove(String p, String up, char rm){
        if(up.length() == 0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == rm){
            remove(p, up.substring(1), rm);
        }else{
            remove(p+ch, up.substring(1), rm);
        }
    }
    public static String remove2(String up){
        if(up.length() == 0){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return remove2(up.substring(1));
        }else{
            return ch+remove2(up.substring(1));
        }
    }
} 