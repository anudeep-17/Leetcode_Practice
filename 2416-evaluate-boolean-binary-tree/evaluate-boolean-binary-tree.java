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
    public boolean evaluateTree(TreeNode root) 
    {
        if(root.left == null && root.right == null)
        {
            return root.val == 0? false : true;
        }
        if(root.val == 0 || root.val == 1)
        {
            return root.val == 0? false : true;
        }

        boolean check = false;
        
        check = evaluateTree(root.left);
        check = (root.val == 2)? check || evaluateTree(root.right) : check && evaluateTree(root.right) ;  
        return check;
    }
}