package Stack_and_Queues;

public class QueueMain {
   public static void main(String[] args) throws Exception {
        DynamicQueue que = new DynamicQueue(5);
        que.insert(1);
        que.insert(2);
        que.insert(3);
        que.insert(4);
        que.insert(5);
        que.insert(6);

        que.display();
        System.out.println(que.remove());
        que.display();
        System.out.println(que.front());
        que.display();
   }
}
