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
 import java.util.ArrayDeque;
class Solution {
   Queue<TreeNode> queue = new LinkedList<>();

    public TreeNode increasingBST(TreeNode root) 
    {
         inorderTraversal(root);
        TreeNode newTree = new TreeNode(-1, null, null);
        TreeNode temp = newTree;
        while(!queue.isEmpty())
        {
            temp.right = queue.remove();
            temp.right.left = null;
            temp.right.right = null;   
            temp = temp.right;
        }
        return newTree.right;
    }
    public void inorderTraversal(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        inorderTraversal(root.left);
        queue.add(root);
        inorderTraversal(root.right);
    }
}