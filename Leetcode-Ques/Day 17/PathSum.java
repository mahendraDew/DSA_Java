//112. Path Sum: https://leetcode.com/problems/path-sum/description/
class PathSum{
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }
        boolean left = hasPathSum(root.left, targetSum-root.val);
        boolean right = hasPathSum(root.right, targetSum-root.val);

        return left || right;
    }
}