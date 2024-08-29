package LinkedList_circular;

public class CLL {
    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    private class  Node {
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.val + "->");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int value){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.val == value){
            head = node.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }
    
}
