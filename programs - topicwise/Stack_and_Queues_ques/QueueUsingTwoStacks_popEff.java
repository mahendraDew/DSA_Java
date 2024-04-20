package Stack_and_Queues_ques;

import java.util.Stack;

public class QueueUsingTwoStacks_popEff {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingTwoStacks_popEff(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public int pop(){
        return first.pop();
    }

    public void push(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }

    public int peek(){
        return first.peek();
    }
    public boolean empty(){
        return first.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks_popEff que = new QueueUsingTwoStacks_popEff();
        que.push(1);
        que.push(2);
        que.push(3);
        que.push(4);
        que.push(5);

        System.out.println(que.pop());
        System.out.println(que.pop());
        System.out.println(que.pop());
        System.out.println(que.pop());
        System.out.println(que.pop());
    }
}
