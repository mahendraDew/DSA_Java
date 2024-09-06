package Leetcode_Topicwise_Ques.recursion;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        // 0 => 1        | 0 => 0
        // 1 => 2        | 1 => 3
        // 2 => 4        | 2 => 9
        // 3 => 8        | 3 => 27
        // 4 => 16       | 4 => 81
        // 5 => 32       | 5 => 243
        // 6 => 64       | 6 => 729
        // 7 => 128      | 7 => 2187
        // 8 => 256      | 8 => 6561
        // 9 => 512      | 9 => 19683
        // 10 => 1024    | 10 => 59049

        // w/ this approach TC = O(logn)
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        return (n%2 == 0) && isPowerOfTwo(n/2);
        
        
        /*
         * using & operator   TC=> O(1)
         * return  (n > 0 && ((n & (n-1)) == 0 ));
         */
    }
}
