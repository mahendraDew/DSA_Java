package Leetcode_Topicwise_Ques.recursion;

public class NumberOfStepsToReduceNumbertoZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        return numStepsHelper(num, 0);
    }
    public static int numStepsHelper(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num %2 == 0){
            num = num/2;
            steps++;
        }else{
            num = num-1;
            steps++;
        }
        return numStepsHelper(num, steps);
    }
}
