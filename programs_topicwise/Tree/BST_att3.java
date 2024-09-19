package Tree;

public class BST_att3 {
    public BST_att3(){}

    public class Node {
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void populate(int[] nums){
        for(int i = 0; i<nums.length; i++){
            this.insertEle(nums[i]);
        }
    }
    public void insertEle(int num){
        root = insertEle(num, root);
    }
    private Node insertEle(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = insertEle(value, node.left);
        }
        if(value>node.value){
            node.right = insertEle(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }
    private void populateSorted(int[] nums, int start, int end){
        if(start>=end){
            return;
        }
        int mid = (start + end)/2;
        this.insertEle(nums[mid]);
        populateSorted(nums, 0, mid);
        populateSorted(nums, mid+1, end);
    }

    public void display(){
        display(root, "Root Node is:");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left, "Left child of "+node.value+" is:");
        display(node.right, "Right child of "+node.value+" is:");
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

    public static void main(String[] args) {
        BST_att3 tree = new BST_att3();
        // int[] nums = {5,2,7,1,4,6,9,8,3,10};
        // tree.populate(nums);
        // tree.display();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(nums);
        tree.display();
        // System.out.println(tree.balanced());
    }
}
