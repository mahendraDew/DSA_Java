package Stack_and_Queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    protected boolean isFull(){
        return size == data.length;
    }
    protected boolean isEmpty(){
        return size == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is Full!!!");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!!!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!!");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
        }
        int i = front;
        do{
            System.out.print(data[i]+"->");
            i++;
            i = i%data.length;
        }while(i != end);
        System.out.println("END");
    }
}
