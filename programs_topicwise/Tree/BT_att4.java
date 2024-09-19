package Tree;

import java.util.Scanner;

public class BT_att4 {
    public BT_att4(){}

    public class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner sc){
        System.out.print("Enter the value of the root node:");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node){
        System.out.print("do you want to insert left of "+node.value+":");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("enter the left val of "+node.value+":");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }
        System.out.print("do you want to insert right of "+node.value+":");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.print("enter the right val of "+node.value+":");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }
    }
    
    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BT_att4 tree = new BT_att4();
        tree.populate(sc);
        tree.display();
    }
}
