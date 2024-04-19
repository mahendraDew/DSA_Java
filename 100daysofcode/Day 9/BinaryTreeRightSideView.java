//199. Binary Tree Right Side View: https://leetcode.com/problems/binary-tree-right-side-view/description/



class BinaryTreeRightSideView{
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int lvl = queue.size();

            for(int i = 0; i < lvl; i++){
                TreeNode currNode = queue.poll();

                if(i == lvl-1){
                    ans.add(currNode.val);
                }
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
        }


        return ans;
    }
}