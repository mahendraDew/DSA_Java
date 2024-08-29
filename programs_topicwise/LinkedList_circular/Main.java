package LinkedList_circular;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        System.out.println();

        list.delete(5);
        list.display();
    }
}
