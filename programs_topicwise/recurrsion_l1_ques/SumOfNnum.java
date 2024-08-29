package recurrsion_l1_ques;

public class SumOfNnum {
    public static void main(String[] args) {
        int  n = 5;
        int s= sum(n);
        System.out.println(s);
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n+sum(n-1);
        
    }
}
