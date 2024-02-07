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
    public int dfs(TreeNode root, int low, int high)
    {
        int sum = 0;
        if(root == null)
        {
            return 0;
        }
        if(root.val >= low && root.val <= high)
        {
            sum += root.val;
        }

        int left = dfs(root.left, low, high);
        if(left != 0)
        {
            sum  += left;
        }

        int right = dfs(root.right, low, high);

        if(right !=0)
        {
            sum += right;
        }

        return sum;
    }

    public int rangeSumBST(TreeNode root, int low, int high) 
    {
        return dfs(root, low, high);
    }
}