//102. Binary Tree Level Order Traversal : https://leetcode.com/problems/binary-tree-level-order-traversal/description/

class BinayTreeLevelOrderTraversal{
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
   public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int lvlSize = queue.size();
            List<Integer> innerList = new ArrayList<>(lvlSize);
            for(int i = 0; i < lvlSize; i++){
                TreeNode currNode = queue.poll();
                innerList.add(currNode.val);
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }

            ans.add(innerList);
        }


        return ans;
    }
}