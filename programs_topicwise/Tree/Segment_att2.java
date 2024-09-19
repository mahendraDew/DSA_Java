package Tree;

public class Segment_att2 {
    
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int leftInterval;
        private int rightInterval;
        public Node(int leftinterval, int rightInterval){
            this.leftInterval = leftinterval;
            this.rightInterval = rightInterval;
        }
    }

    private Node root;
    public Segment_att2(int[] arr){
        this.root = constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end){
        if(start == end){
            Node leaf = new Node(start, end);
            leaf.value = arr[start];
            return leaf;
        }
        Node node = new Node(start, end);
        int mid = (start + end)/2;
        
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid+1, end);

        node.value = node.left.value + node.right.value;
        return node;
    }

    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = "";
        if(node.left != null){
            str = str + "Interval[" + node.left.leftInterval + "-" + node.left.rightInterval + "] and value: " + node.left.value + "->";
        }else{
            str = str + "No left child ->";
        }
        str = str + "Interval [" + node.leftInterval + "-" + node.rightInterval + "] and values: " + node.value + "<-";
        if(node.right != null){
            str = str + "Inerval[" + node.right.leftInterval + "-" + node.right.rightInterval + "] and value: " + node.right.value;
        }else{
            str = str + "<- No right child";
        }

        System.out.println(str);
        if(node.left != null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        Segment_att2 tree = new Segment_att2(arr);
        tree.display();
        // System.out.println(tree.query(1,6));
        // tree.update(4, 10);
        // tree.display();
        // System.out.println(tree.query(1, 6));
    }

}
