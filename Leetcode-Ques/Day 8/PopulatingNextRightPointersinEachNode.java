//116. Populating Next Right Pointers in Each Node: https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
class PopulatingNextRightPointersinEachNode{
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root) {
        if(root == null){
            return null;
        }

        Node leftmost = root;
        while(leftmost.left != null){
            Node curr = leftmost;
            while(curr != null){
                curr.left.next = curr.right;
                if(curr.next != null){
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            leftmost = leftmost.left;
        }

        return root;
    }
}
