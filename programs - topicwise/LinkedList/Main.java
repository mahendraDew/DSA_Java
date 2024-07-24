package LinkedList;



public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.display();
        list.insertLast(99);
        list.display();

        list.insert(100, 3);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.delete(3);
        list.display();
    }
}
