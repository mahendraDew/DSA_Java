public class FindKthBitInNthBinaryString {
    public static void main(String[] args) {
        int  n = 4, k = 15;
        System.out.println(findKthBit(n, k));
    }

    // very high time complexity
    public static char findKthBit(int n, int k) {
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
    //optimal time complexity

    public static char findKthBit2(int n, int k) {
        if(n == 1 && k == 1){
            return '0';
        }
        int len = (int) Math.pow(2, n) - 1;
        int mid = len /2 +1;
        if(mid == k){
            return '1';
        }else if (k < mid){
            return findKthBit2(n-1, k);
        }else {
            return invert(findKthBit2(n-1, len + 1 -k));
        }
    }

    public static char invert(char ch){
        if (ch == '1'){
            return '0';
        }else {
            return '1';
        }
    }
}
