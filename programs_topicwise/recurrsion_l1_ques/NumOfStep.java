package recurrsion_l1_ques;

public class NumOfStep {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(numStepFun(n));
    }
    static int numStepFun(int n){
       return stepHelper(n, 0);
    }
    static int stepHelper(int n, int steps){
        if(n == 0){
            return steps;
        }
        if(n%2 == 0){
            return stepHelper(n/2, steps+1);
        }
        return stepHelper(n-1, steps+1);
    }
}
