package Leetcode_Topicwise_Ques.recursion;

public class ProductOfTwoNum {
    public static void main(String[] args) {
        /*
         * x = 2  y = 3
         * 2+2+2 -> 6
         * 
         * x=3 y=5
         * 5+5+5 => 15
         * 3+3+3+3+3 =>15
         */
        
        int x = 25;
        int y = 30;
        System.out.println(product(x, y));
    }
    public static int product(int x, int y){
        if(x<y){
            return product(y, x);
        }

        else if(y != 0){
            return (x + product(x, y-1));
        }

        else {
            return 0;
        }
    }
}
