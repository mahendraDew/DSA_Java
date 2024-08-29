package Tree;

public class BST {
    public BST(){}
    private class Node {
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }
    //insert an element 
    public void insertEle(int value){
        root = insertEle(value, root);
    }
    private Node insertEle(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insertEle(value, node.left);
        }
        if(value > node.value){
            node.right = insertEle(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insertEle(nums[i]);
        }
    }
    //if insert arr is sorted
    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }
    private void populateSorted(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start + end)/2;
        this.insertEle(nums[mid]);
        populateSorted(nums, 0, mid);
        populateSorted(nums, mid+1, end);
    }
    
    public void display(){
        display(this.root, "Root Node:");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "left child of " + node.value + ":");
        display(node.right, "right child of " + node.value + ":");
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        // return Math.abs(height(node.left) - height(node.right) <= 1 && balanced(node.left) && balanced(node.right));
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);

    }

    public static void main(String[] args) {
        BST tree = new BST();
        // int[] nums = {5,2,7,1,4,6,9,8,3,10};
        // tree.populate(nums);
        // tree.display();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(nums);
        tree.display();
        System.out.println(tree.balanced());

        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
        System.out.println();
    }


    // Traversal in BST
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(){   
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}
