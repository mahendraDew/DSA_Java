package recurrsion_l1_ques;

public class RevNum {
    public static void main(String[] args) {
        //Approach 1
        // int n = 1234;
        // revNum(n);
        // System.out.println(sum);

        //Approach 2
        int n = 1234;
        int r = rev2(n);
        System.out.println(r);
    }
    // Approach 1
    static int sum = 0;
    static void revNum(int n){
        if(n==0){
            return;
        }
        sum = sum*10 + n%10;
        revNum(n/10);
    }

    //Approach 2
    static int rev2(int n){
        int digit = (int)(Math.log10(n))+1;
        return revHelper(n, digit);
    }
    static int revHelper(int n, int digit){
        if(n%10 == n){
            return n;
        }
        return (n%10) * (int)(Math.pow(10, digit-1)) + revHelper(n/10, digit-1);
    }
}
