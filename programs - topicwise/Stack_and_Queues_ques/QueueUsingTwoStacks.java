package Stack_and_Queues_ques;

import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingTwoStacks(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int item){
        first.push(item);
    }
    public int pop(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }
    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peekEle = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peekEle;
    }

    public boolean empty(){
        return first.isEmpty();
    }
    public static void main(String[] args) {
        QueueUsingTwoStacks queStack = new QueueUsingTwoStacks();
        queStack.push(1);
        queStack.push(2);
        queStack.push(3);
        queStack.push(4);
        queStack.push(5);

        System.out.println(queStack.pop());
        System.out.println(queStack.pop());
        System.out.println(queStack.pop());
        System.out.println(queStack.pop());
        System.out.println(queStack.pop());
    }
}
