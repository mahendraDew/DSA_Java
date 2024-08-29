package recurrsion_l1_ques;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 1234;
        int s = digitSum(n);
        System.out.println(s);

    }
    static int digitSum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + digitSum(n/10);
    }
}
