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
    List<List<Integer>> nestedList = new ArrayList<>();
   
    public void helper(TreeNode root, int index)
    {
        if(root == null)
        {
            return;
        }
        if(root.left == null && root.right == null)
        {
             nestedList.get(index).add(root.val);

        }
        helper(root.left, index);
        helper(root.right, index);

    } 
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
         nestedList.add(0, new ArrayList<>());
         nestedList.add(1, new ArrayList<>());
         helper(root1, 0);
         helper(root2, 1);
         if(nestedList.get(0).equals(nestedList.get(1)))
         {
             return true;
         }
         else
         {
             return false;
         }
    }
}