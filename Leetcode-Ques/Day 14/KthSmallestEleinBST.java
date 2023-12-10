// 230. Kth Smallest Element in a BST: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
class KthSmallestEleinBST{
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
    public int kthSmallest(TreeNode root, int k) {
        return kthSmallestHelper(root, k).val;
    }

    int count = 0;
    private TreeNode kthSmallestHelper(TreeNode node, int k){
      if(node == null){
        return null;
      }
      Treenode left = kthSmallestHelper(node.left, k);
      if(left != null){
        return left;
      }
      
      count++;
      if(count == k){
        return node;
      }

      return kthSmallestHelper(node.right, k);
    }
}
