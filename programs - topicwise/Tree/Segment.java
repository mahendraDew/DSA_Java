package Tree;

public class Segment {
    public class Node{
        int value;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    public Segment(int[] arr){
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

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid+1, end);

        node.value = node.left.value + node.right.value;
        return node;
    }

    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = "";

        if(node.left != null){
            str = str + "Interval[" + node.left.startInterval +"-" +node.left.endInterval+  "] and value: " +node.left.value +"->"; 
        }else{
            str = str + "No left child ->";
        }
        
        str = str + "Interval[" + node.startInterval +"-" +node.endInterval+  "] and value: " +node.value +"<-"; 
        
        if(node.right != null){
            str = str + "Interval[" + node.right.startInterval +"-" +node.right.endInterval+  "] and value: " +node.right.value; 
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

    public int query(int startInt, int endInt){
        return this.query(this.root, startInt, endInt);
    }
    private int query(Node node, int qsi, int qei){
        if(node.startInterval >= qsi && node.endInterval <= qei){
            return node.value;
        }
        else if(node.startInterval > qei || node.endInterval < qsi){
            return 0;
        }
        else{
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value){
        this.root.value = update(this.root, index, value);
    }
    private int update(Node node, int index, int val){
        if(index >= node.startInterval && index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval){
                node.value = val;
                return node.value;
            }
            else{
                int leftAns = update(node.left, index, val);
                int rightAns = update(node.right, index, val);

                node.value = leftAns + rightAns;
                return node.value;
            }
        }
        return node.value;
    }


    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        Segment tree = new Segment(arr);
        tree.display();
        System.out.println(tree.query(1,6));
        tree.update(4, 10);
        tree.display();
        System.out.println(tree.query(1, 6));
    }
}
