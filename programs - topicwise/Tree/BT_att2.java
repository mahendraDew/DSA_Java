package Tree;

import java.util.Scanner;

public class BT_att2 {
    public BT_att2(){}
    private class Node {
        int value;
        Node left; 
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    //insert the value in this tree -first insert value of root
    public void populate(Scanner sc){
        System.out.print("Enter the root value:");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    //insert the value in this tree -insert rest of the tree
    public void populate(Scanner sc, Node node){
        System.out.print("DO you want to insert left of " + node.value + " true/flase: ");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter the value of left node of "+node.value+":");
            int leftval = sc.nextInt();
            node.left = new Node(leftval);
            populate(sc, node.left);
        }
        System.out.print("DO you want to insert right of " + node.value + " true/flase: ");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.print("Enter the value of right node of "+node.value+":");
            int rightval = sc.nextInt();
            node.right = new Node(rightval);
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
        BT_att2 bt = new BT_att2();
        bt.populate(sc);
        bt.display();
    }
}
