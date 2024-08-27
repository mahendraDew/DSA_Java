
import java.util.Arrays;

public class NextGreaterEleIII {
    public static void main(String[] args) {
        int n = 21;
        System.out.println(nextGreaterElement(n));
    }
    public static int nextGreaterElement(int n) {
        String nStr = Integer.toString(n);  
        char[] charr = nStr.toCharArray();
        Arrays.sort(charr);   
        System.out.println(Arrays.toString(charr)); //123
        int num = 0;
        for(int i = charr.length-1; i>=0; i--){
           int lastele = charr[i] - '0';
           num = num*10 + lastele;
        }
        if(n<num){
            return num;
        }else {
            return -1;
        }
    }
}