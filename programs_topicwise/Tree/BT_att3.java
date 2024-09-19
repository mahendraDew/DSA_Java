package Tree;

import java.util.Scanner;

public class BT_att3 {
    public BT_att3(){}

    public class Node {
        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
    }

    private Node root;
    
    public void populate(Scanner sc){
        System.out.print("Enter the root node val: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node){
        System.out.print("Do you want to insert left of "+ node.value + ":");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter the left value of "+node.value+":");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        
        System.out.print("Do you want to insert right of "+ node.value + ":");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.print("Enter the right value of "+node.value+":");
            int value = sc.nextInt();
            node.right = new Node(value);
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
        display(node.left , indent+"\t");
        display(node.right , indent+"\t");
    }

    public static void main(String[] args) {
        BT_att3 bt = new BT_att3();
        Scanner sc = new Scanner(System.in);
        bt.populate(sc);
        bt.display();    
    }
}