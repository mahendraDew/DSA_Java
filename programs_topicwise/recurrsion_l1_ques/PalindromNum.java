package recurrsion_l1_ques;

public class PalindromNum {
    public static void main(String[] args) {
        int n = 1232;
        System.out.println(palindrom(n));
    }
    static boolean palindrom(int n){
        return n == rev(n);
    }
    static int rev(int n){
        int digit = (int)(Math.log10(n)) + 1;
        return revHelpFun(n, digit);
    }
    static int revHelpFun(int n, int digit){
        if(n%10 == n){
            return n;
        }
        return n%10 * (int)(Math.pow(10, digit-1)) + revHelpFun(n/10, digit-1);
    }
}
