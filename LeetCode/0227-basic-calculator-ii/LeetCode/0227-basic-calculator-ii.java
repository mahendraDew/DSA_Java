class Solution {
    public int calculate(String s) {
        //using stack
//         if(s == null || s.length() == 0){
//             return 0;
//         }
        
//         int curr = 0;
//         char op = '+';
//         Stack<Integer> st = new Stack();
//         char[] ch = s.toCharArray();
//         for(int i = 0; i<ch.length; i++){
//             if(Character.isDigit(ch[i])){
//                 curr = curr*10 + ch[i] - '0';
//             }
//             if(!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length-1){
//                 if(op == '+'){
//                     st.push(curr);
//                 }else if(op == '-'){
//                     st.push(-curr);
//                 }else if(op == '*'){
//                     st.push(st.pop() * curr);
//                 }else if(op == '/'){
//                     st.push(st.pop() / curr);
//                 }
                
//                 op = ch[i];
//                 curr = 0;
//             }
//         }
//         int ans = 0;
//         while(!st.isEmpty()){
//             ans += st.pop();
//         }
//         return ans;
        
        //without stack
        if(s == null || s.length() == 0){
            return 0;
        }
        
        int curr = 0;
        char op = '+';
        int last = 0;
        int sum = 0;
        char[] ch = s.toCharArray();
        for(int i = 0; i<ch.length; i++){
            if(Character.isDigit(ch[i])){
                curr = curr*10 + ch[i] - '0';
            }
            if(!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length-1){
                if(op == '+'){
                    sum += last;
                   last = curr;
                }else if(op == '-'){
                    sum += last;
                    last = -curr;
                }else if(op == '*'){
                    last = last*curr;
                }else if(op == '/'){
                    last = last/curr;
                }
                
                op = ch[i];
                curr = 0;
            }
        }
        sum += last;
        return sum;
       
    }
}