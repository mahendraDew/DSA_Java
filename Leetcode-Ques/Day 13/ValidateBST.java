//98. Validate Binary Search Tree: https://leetcode.com/problems/validate-binary-search-tree/
class ValidateBST{
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
    public boolean isValidBST(TreeNode root) {
        return isValidBSThelper(root, null, null);
    }
    public boolean isValidBSThelper(TreeNode node, Integer low, Integer high){
        if(node == null){
            return true;
        }
        if(high != null && node.val >= high){
            return false;
        }
        if(low != null && node.val <= low){
            return false;
        }
        boolean leftTree = isValidBSThelper(node.left, low, node.val);
        boolean rightTree = isValidBSThelper(node.right, node.val, high);

        return leftTree && rightTree;
    }
}
