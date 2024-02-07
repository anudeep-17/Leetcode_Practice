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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) 
    {
        TreeNode newTree = new TreeNode();

        if(root1 == null && root2 == null)
        {
            return null;
        }
        else if(root1 != null && root2 == null)
        {
           newTree.val = root1.val;
        }
        else if(root1 == null && root2 != null)
        {
           newTree.val = root2.val;
        }
        else if(root1 != null && root2 != null)
        {
            newTree = new TreeNode(root1.val + root2.val);
        }

        newTree.left = mergeTrees(root1 == null?null: root1.left, root2 == null ? null:root2.left);
        newTree.right = mergeTrees(root1 == null?null: root1.right, root2 == null ? null:root2.right);
        return newTree;
    }
}