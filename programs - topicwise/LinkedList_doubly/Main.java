package LinkedList_doubly;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        // System.out.println();
        // list.insertLast(99);
        // list.display();
        // System.out.println();
        // list.insert(101, 2);
        // list.display();
        // System.out.println();
        // list.insertAfter(101, 102);
        // list.display();

        // System.out.println();
        // list.deleteFirst();
        // list.display();
        // System.out.println();
        // list.deleteLast();
        // list.display();

        System.out.println();
        list.delete(3);
        list.display();

    }
}
