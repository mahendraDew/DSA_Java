package Tree;

import java.util.Scanner;

// attempt 2 of Binary Tree
public class BTree {
    public BTree(){}
    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    private Node root; 

    public void insertEle(Scanner sc){
        System.out.print("Enter the root value: ");
        int value = sc.nextInt();
        root = new Node(value);
        insertELe(sc, root);
    }
    private void insertELe(Scanner sc, Node node){
        System.out.print("Do you want to insert left of " + node.val + " (true/false):");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter the left of " + node.val + ": ");
            int leftVal = sc.nextInt();
            node.left = new Node(leftVal);
            insertELe(sc, node.left);
        }
        System.out.print("Do you want to insert right of " +node.val + "(true/false):");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.print("Enter the right of " + node.val + ": ");
            int rightVal = sc.nextInt();
            node.right = new Node(rightVal);
            insertELe(sc, node.right);
        }
    }

    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BTree tree = new BTree();
        tree.insertEle(sc);
        tree.display();

    }
}
