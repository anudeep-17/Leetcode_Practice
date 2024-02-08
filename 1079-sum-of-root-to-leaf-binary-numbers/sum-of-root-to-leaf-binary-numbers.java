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
    String currbinary = "";
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) 
    { 
        if(root == null)
        {
            return 0;
        }

        currbinary += root.val+"";
        if(root.left == null && root.right== null)
        {
            if(currbinary.length() >= 1)
            {
                sum += Integer.parseInt(currbinary, 2);
                currbinary = currbinary.substring(0, currbinary.length()-1);
                return sum;
            }
        }

        sumRootToLeaf(root.left);
        sumRootToLeaf(root.right);
        currbinary = currbinary.substring(0, currbinary.length()-1);
        return sum;
        
    }
}