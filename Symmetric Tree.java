# Optimized
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }

    public boolean helper(TreeNode leftSubtree, TreeNode rightSubtree){
        if(leftSubtree == null && rightSubtree == null)
            return true;
        else if(leftSubtree == null || rightSubtree == null)
            return false;
        return (leftSubtree.val == rightSubtree.val) && helper(leftSubtree.left, rightSubtree.right) && helper(leftSubtree.right, rightSubtree.left);
    }
}
