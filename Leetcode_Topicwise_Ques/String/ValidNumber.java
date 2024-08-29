public class ValidNumber {
    public static void main(String[] args) {
        /*
         * so a valid string contain only -+.123456789eE
         */
        String s = "-123.456e789";
        System.out.println(isNumber(s));
    }
    public static boolean isNumber(String s) {
        int i = 0;
        boolean exp = false, digit = false, dot = false;
        while (i<s.length()) {
            char ch = s.charAt(i);
            if(isDigit(ch)){
                digit = true;
            }else if(ch == '-' || ch == '+'){
                if(i>0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E'){
                    return false;
                }
            }else if(ch == 'e' || ch == 'E'){
                if(exp || !digit){
                    return false;
                }
                exp = true;
                digit = false;
            }else if(ch == '.'){
                if(dot || exp){
                    return false;
                }
                dot = true;
            }else {
                return false;
            }
            i++;
        }
        return digit;
    }
    public static boolean isDigit(char ch){
        if(ch >= '0' && ch <= '9'){
            return true;
        }
        return false;
    }
}
