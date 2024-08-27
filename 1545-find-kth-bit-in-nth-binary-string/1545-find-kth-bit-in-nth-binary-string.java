class Solution {
    public char findKthBit(int n, int k) {
          String str = "0";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for(int i = 1; i<n; i++){
            String initStr = sb.toString() + "1" + reversefun(invertfun(sb.toString()));
            sb.replace(0, sb.length(), initStr);
        }
        System.out.println("string: " + sb);
        return sb.charAt(k-1);
    }

    public static StringBuilder invertfun(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                sb.append("0");
            }else if(str.charAt(i) == '0'){
                sb.append("1");
            }
        }

        return sb;
    }

    public static String reversefun(StringBuilder str){
        return str.reverse().toString();
    }
}
