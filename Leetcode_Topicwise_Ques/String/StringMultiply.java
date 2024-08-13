package Leetcode_Topicwise_Ques.String;

import java.util.Arrays;

public class StringMultiply {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";    //56088
        System.out.println(multiply(num1, num2));
        
    }
    public static String multiply(String num1, String num2) {
        if(num1 == "0" || num2 == "0"){
            return "0";
        }
        StringBuilder n1 = new StringBuilder(num1);
        n1 = n1.reverse();
        StringBuilder n2 = new StringBuilder(num2);
        n2 = n2.reverse();

        int[] result = new int[num1.length()+num2.length()];
        for(int i = 0; i<result.length; i++){
            result[i] = 0;
        }           
                    //  123
                    // x456
                    //-----
                    //56088


        for(int i = 0; i<n1.length(); i++){
            for(int j = 0; j<n2.length(); j++){
                int digit = (n1.charAt(i)-'0') * (n2.charAt(j)-'0');
                System.out.println(digit);
                result[i+j] += digit%10;
                result[i+j+1] += digit/10;
                digit /= 10;
                StringBuilder sb  = new StringBuilder(result.length);
                for (int element : result) {
                    sb.append(element);
                }
                System.out.println(sb.reverse());
            }
        }

        System.out.println(Arrays.toString(result));
        return "tesing";
    }
}
