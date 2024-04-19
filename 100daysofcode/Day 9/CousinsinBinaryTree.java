//993. Cousins in Binary Tree: https://leetcode.com/problems/cousins-in-binary-tree/

class CousinsinBinaryTree{
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (levelNode(root, xx, 0) == levelNode(root, yy, 0)) && (!isSibling(root, xx, yy));
    }
    public TreeNode findNode(TreeNode node, int x){
        if(node == null){
            return null;
        }
        if(node.val == x){
            return node;
        }
        TreeNode left = findNode(node.left, x);
        if(left != null){
            return left;
        }

        return findNode(node.right, x);
    }
    public int levelNode(TreeNode node, TreeNode x, int lvl){
        if(node == null){
            return 0;
        }
        if(node == x){
            return lvl;
        }
        int l = levelNode(node.left, x, lvl+1);
        if(l != 0){
            return l;
        }

        retrun levelNode(node.right, x, lvl+1);
    }

    public boolean isSibling(TreeNode node, TreeNode x, TreeNode y){
        if(node == null){
            return false;
        }
        return (node.left == x && node.right == y) || (node.left == y && node.right == x) || isSibling(node.left, x, y) || isSibling(node.right, x, y);
    }
}