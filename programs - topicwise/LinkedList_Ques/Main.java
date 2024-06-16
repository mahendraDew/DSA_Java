package LinkedList_Ques;

public class Main {
    public static void main(String[] args) {
        LinkedListQue list1 = new LinkedListQue();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(4);
        list1.insertLast(5);
        list1.insertLast(8);
        list1.display();


        LinkedListQue list2 = new LinkedListQue();
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(6);
        list2.insertLast(7);
        list2.display();
        
        LinkedListQue list3 = LinkedListQue.merge(list1, list2);
        list3.display();
    }
}
