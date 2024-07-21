package Tree;

public class AVL {
    public AVL(){}
    private class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;
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

    public void insert(int value){
        root = insert(root, value);
    }
    private Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = insert(node.left, value);
        }
        if(value>node.value){
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }

    private Node rotate(Node node){
        //left heavy case:
        if(height(node.left) - height(node.right) > 1){
            if(height(node.left.left)-height(node.left.right)>0){
                return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        //right heavy case:
        if(height(node.left) - height(node.right) < -1){
            if(height(node.right.left)-height(node.right.right)>0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)<0){
                return leftRotate(node);
            }
        }

        return node;
    }
    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;

        return c;
    }
    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;

        return p;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root, "Root Node is:");
    }
    private void display(Node node, String info){
        if(node == null){
            return;
        }
        System.out.println(info + node.value);
        display(node.left, " left child of " + node.value + ":");
        display(node.right, " right child of " + node.value + ":");
    }

    public void populate(int[] arr){
        for(int i = 0; i<arr.length; i++){
            insert(arr[i]);
        }
    }

    public static void main(String[] args) {
        
        AVL tree = new AVL();
        for(int i = 0; i<10; i++){
            tree.insert(i); 
        }
       
        System.out.println(tree.height());
        System.out.println(tree.balanced());
        tree.display();

       
    }
    
}
