package LinkedList_doubly;

public class DLL {
    private Node head;

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.prev = null;
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.val + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Print in rev:");
        while (last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int value){
        Node node = new Node(value);
        node.next = null;
        Node tempLast = head;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (tempLast.next != null) {
            tempLast = tempLast.next;
        }
        tempLast.next = node;
        node.prev = tempLast;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next, temp);
        node.next.prev = node;
        temp.next = node;

    }
    public void insertAfter(int after, int value){
        Node p = findNode(after);
        if(p == null){
            System.out.println("Doesn't exists");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }
    public Node findNode(int value){
        Node temp = head;
        while (temp != null) {
            if(temp.val == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        head.prev = null;
        return val;
    }

    public int deleteLast(){
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        int val = lastNode.val;
        lastNode.prev.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        Node p = getNode(index-1);
        int val = p.next.val;
        p.next = p.next.next;
        p.next.prev = p;
        return val;
    }
    private Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
