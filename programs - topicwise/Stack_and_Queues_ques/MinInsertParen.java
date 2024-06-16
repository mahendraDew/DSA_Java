package Stack_and_Queues_ques;

import java.util.Stack;

public class MinInsertParen {
    public int minInsertions(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else{
                if(i+1 < s.length() && s.charAt(i+1) == ')'){
                    i++;
                }
                else{
                    count++;
                }

                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    count++;
                }
            }
        }
        count = count + 2*stack.size();
        return count;
    }
}
