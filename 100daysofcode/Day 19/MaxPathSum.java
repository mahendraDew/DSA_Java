//124. Binary Tree Maximum Path Sum: https://leetcode.com/problems/binary-tree-maximum-path-sum/description/

class MaxPathSum{
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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathSumHelper(root);
        return ans;
    }
    private int maxPathSumHelper(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = maxPathSumHelper(node.left);
        int right = maxPathSumHelper(node.right);

        left = Math.max(0, left);
        right = Math.max(0, right);

        int path = left + right + node.val;

        ans = Math.max(ans, path);

        return Math.max(left, right) + node.val;
    }
}