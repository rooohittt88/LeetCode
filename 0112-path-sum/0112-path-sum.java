class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;

        boolean isLeafNode=(root.left==null && root.right==null);
        if(isLeafNode) {
            if(root.val==targetSum) return true;
            else return false;
        }

        int remainingSum=targetSum-root.val;

        boolean foundInLeftNode=hasPathSum(root.left,remainingSum);
        boolean foundInRightNode=hasPathSum(root.right,remainingSum);

        if(foundInLeftNode || foundInRightNode) return true;
        else return false;
        
    }
}
