package Tree;

public class BST_att2 {
    BST_att2(){}
    private class Node{
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    public void insert(int val){
        root = insert(root, val);
    }
    private Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(node.left, value);
        }
        if(value > node.value){
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(Node node){
        return node == null;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root, "Root value:");
    }
    private void display(Node node, String info){
        if(node == null){
            return;
        }
        System.out.println(info + node.value);
        display(node.left, "left node of " + node.value + ":");
        display(node.right, "right node of " + node.value + ":");
    }

    public void populate(int[] arr){
        for(int ele: arr){
            this.insert(ele);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,2,7,1,4,3,6,9,8,10};
        BST_att2 tree = new BST_att2();
        tree.populate(arr);
        tree.display();
        System.out.println(tree.balanced());
    }
}
