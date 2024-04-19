//114. Flatten Binary Tree to Linked List:https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
public class FlattenBTtoLL {
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

    public void flatten(TreeNode root) {
        TreeNode currNode = root;
        while(currNode != null){
            if(currNode.left != null){
                TreeNode temp = currNode.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = currNode.right;
                currNode.right = currNode.left;
                currNode.left = null;
            }
            currNode = currNode.right;
        }
    }
}
