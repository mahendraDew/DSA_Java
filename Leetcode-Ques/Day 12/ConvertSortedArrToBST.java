class ConvertSortedArrToBST{
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrToBSTHelper(nums, 0, nums.length);
    }
    private TreeNode sortedArrToBSTHelper(int[] nums, int start, int end){
        if(start>=end){
            return null;
        }
        int mid = (start + end)/2;
        TreeNode node = new TreeNode();
        node.val = nums[mid];
        node.left = sortedArrToBSTHelper(nums, start, mid);
        node.right = sortedArrToBSTHelper(nums, mid+1, end);

        return node;
    }
}