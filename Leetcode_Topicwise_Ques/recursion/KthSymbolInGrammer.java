package Leetcode_Topicwise_Ques.recursion;

public class KthSymbolInGrammer {
    public static void main(String[] args) {
        int n = 5, k = 11;
        System.out.println(kthGrammar(n, k));
    }
    public static int kthGrammar(int n, int k) {
        /*
         * n = 1 => 0                   --1  -> 2^(n-1)=2^0
         * n = 2 => 01                  --2  -> 2^(n-1)=2^1   
         * n = 3 => 0110                --4  -> 2^(n-1)=2^2 
         * n = 4 => 01101001            --8  -> 2^(n-1)=2^3 
         * n = 5 => 0110100110010110    --16 -> 2^(n-1)=2^4  
         * n = 6 => 0110100110010110... --32 -> 2^(n-1)=2^5  
         */
        if( n == 1) {
            return 0;
        }
        int x = (int) Math.pow(2,n-2);
        if(k>x){
            return 1^kthGrammar(n-1,k-x);
        }    
        return kthGrammar(n-1,k);
    }
}
