//107. Binary Tree Level Order Traversal II: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
class BinaryTreeLevelOrderTraversal2{
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int lvl = queue.size();
            List<Integer> innerList = new ArrayList<>(lvl);
            for(int i=0; i<lvl; i++){
                TreeNode currNode = queue.poll();
                innerList.add(currNode.val);
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            ans.add(0, innerList);
        }


        return ans;
    }
}