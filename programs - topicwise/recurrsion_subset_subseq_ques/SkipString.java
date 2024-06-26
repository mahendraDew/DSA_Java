public class SkipString {
    public static void main(String[] args) {
        String str = "imgonnaeatapplethisevening";
        String rm = "apple";
        System.out.println(skip(str, rm));
    }
    public static String skip(String str, String rm){
        if(str.length() == 0){
            return "";
        }
        if(str.startsWith(rm)){
            return skip(str.substring(rm.length()), rm);
        }else{
            return str.charAt(0)+skip(str.substring(1), rm);
        }
    }
}
