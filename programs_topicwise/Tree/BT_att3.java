package Tree;

import java.util.Scanner;

public class BT_att3 {
    public BT_att3(){}
    private class Node{
        int value;
        Node left; 
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    
    public void populate(Scanner sc){
        System.out.print("Enter the root node value: ");
        int rootVal = sc.nextInt();
        root = new Node(rootVal);
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node){
        System.out.print("Do you want to insert left of " + node.value +"?(true/false):");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter the left of the node " + node.value + ":");
            int leftVal = sc.nextInt();
            node.left = new Node(leftVal);
            populate(sc, node.left);
        }
        System.out.print("Do you want to insert right of " + node.value +"?(true/false):");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.print("Enter the right of the node " + node.value + ":");
            int rightVal = sc.nextInt();
            node.right = new Node(rightVal);
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
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BT_att3 bt = new BT_att3();
        bt.populate(sc);
        bt.display();
    }
}