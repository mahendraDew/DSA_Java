//637. Average of Levels in Binary Tree: https://leetcode.com/problems/average-of-levels-in-binary-tree/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class AverageofLevelsinBinaryTree{
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        
        if(root == null){
            return ans;
        }

        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int lvlSize = queue.size();
            double avgSum = 0;
            for(int i = 0; i < lvlSize; i++){
                TreeNode currNode = queue.poll();
                avgSum += currNode.val;
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            avgSum = avgSum/lvlSize;
            ans.add(avgSum);
        }


        return ans;
    }
}