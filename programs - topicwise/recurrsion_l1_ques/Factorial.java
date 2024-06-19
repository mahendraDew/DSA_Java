package recurrsion_l1_ques;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int f = fact(n);
        System.out.println(f);
    }
    static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
}
