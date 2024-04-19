//129. Sum Root to Leaf Numbers: https://leetcode.com/problems/sum-root-to-leaf-numbers/

class RoottoLeafNumbers{
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int sumNumbers(TreeNode root) {
        return sumNumHelper(root, 0);
    }
    private int sumNumHelper(TreeNode node, int sum){
        if(node == null){
            return 0;
        }
        sum = sum * 10 + node.val;
        if(node.left == null && node.right == null){
            return sum;
        }
        return sumNumHelper(node.left, sum) + sumNumHelper(node.right, sum);
    }
}