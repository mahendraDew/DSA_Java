//103. Binary Tree Zigzag Level Order Traversal: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
public class BTZigzagLvlOrderTrvrsl {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Deque<TreeNode> qDeque = new LinkedList<>();
        qDeque.offer(root);

        boolean reverse = false;
        
        while(!qDeque.isEmpty()){
            int lvlSize = qDeque.size();
            List<Integer> currList = new ArrayList<>(lvlSize);
            for (int i = 0; i < lvlSize; i++) {
                if(!reverse){
                    //normal order - adding elements in normal order of BFS
                    TreeNode currNode = qDeque.pollFirst();
                    currList.add(currNode.val);
                    if(currNode.left != null){
                        qDeque.addLast(currNode.left);
                    }
                    if(currNode.right != null){
                        qDeque.addLast(currNode.right);
                    }
                }
                else{
                    //reverse order - adding elements in rev order of BFS (rev order of that level)
                    TreeNode currNode = qDeque.pollLast();
                    currList.add(currNode.val);
                    if(currNode.right != null){
                        qDeque.addFirst(currNode.right);
                    }
                    if(currNode.left != null){
                        qDeque.addFirst(currNode.left);
                    }
                }
            }

            reverse = !reverse;
            ans.add(currList);
        }

        return ans;
    }

}
