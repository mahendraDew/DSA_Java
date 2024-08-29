package recurrsion_l1_ques;

public class CountZeros {
    public static void main(String[] args) {
        int n = 1000;
        int c = countZero(n);
        System.out.println(c);
    }
    static int countZero(int n){
        return countHelper(n, 0);
    }
    static int countHelper(int n, int c){
        if(n == 0){
            return c;
        }
        if(n%10 == 0){
            return countHelper(n/10, ++c);
        }
        else{
            return countHelper(n/10, c);
        }
    }
}
