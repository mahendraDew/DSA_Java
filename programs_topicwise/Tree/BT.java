package Tree;

import java.util.Scanner;

public class BT {
    public BT(){}

    private class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    //populate / insert node in tree
    public void populate(Scanner sc){
        System.out.print("Enter the root value:");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node){
        System.out.print("Do you want to insert left of "+ node.value + " (true/false):");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter left value of " + node.value + ": ");
            int leftVal = sc.nextInt();
            node.left = new Node(leftVal);
            populate(sc, node.left);
        }
        System.out.print("Do you want to insert right of " + node.value + " (true/false):");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.print("Enter right value of "+ node.value + ": ");
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
        BT bt = new BT();
        bt.populate(sc);
        bt.display();
    }
}
