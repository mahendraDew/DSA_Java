class KthSmallestElementinBST{
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
    private int k;
    private int ans;
    public int kthSmallest(TreeNode root, int k) {
        this.k  = k;
        helper(root);
        return ans;
    }
    private void helper(TreeNode node){
        if(node == null){
            return;
        }
        helper(node.left);
        
        k--;
        if(k == 0){
            ans = node.val;
            return;
        }
        
        helper(node.right);
    }
}