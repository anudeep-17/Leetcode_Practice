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
    public int maxDepth(TreeNode root) {
        return helper(root);
    }
    private int helper(TreeNode root){
        if(root == null) return 0;

        int leftDepth = helper(root.left) + 1;
        int rightDepth = helper(root.right) + 1;

        return Math.max(leftDepth, rightDepth);
        }
    }
