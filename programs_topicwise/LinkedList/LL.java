package LinkedList;

public class LL {
    private int size;
    private Node head;
    private Node tail;
    
    public LL(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
        
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
        }
        if(index == size){
            insertLast(val);
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node node = getNode(size-2);
        int val = tail.value;
        tail = node;
        tail.next = null;
        return val;
        
    }
    private Node getNode(int ind){
        Node temp = head;
        for (int i = 0; i < ind; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node prevNode = getNode(index-1);
        int val = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        return val;
    }

    public Node search(int val){
        Node temp = head;
        while(temp != null){
            if(temp.value == val){
                //found the val
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
