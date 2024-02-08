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
    public int sumRootToLeaf(TreeNode root) {
    return sumRootToLeafHelper(root, 0);
}

private int sumRootToLeafHelper(TreeNode node, int currentSum) {
    if (node == null) {
        return 0;
    }
    
    currentSum = (currentSum << 1) + node.val;

    if (node.left == null && node.right == null) {
        return currentSum;
    }

    int leftSum = sumRootToLeafHelper(node.left, currentSum);
    int rightSum = sumRootToLeafHelper(node.right, currentSum);

    return leftSum + rightSum;
}
}