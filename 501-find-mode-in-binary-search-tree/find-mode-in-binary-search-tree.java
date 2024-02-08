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
    HashMap<Integer, Integer> map = new HashMap<>();

    public void helper(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        
        if(map.get(root.val) == null)
        {
            map.put(root.val,1);
        }
        else
        {
            map.put(root.val, map.get(root.val) + 1);
        }

       helper(root.left);
        helper(root.right);
    }

    public int[] findMode(TreeNode root) 
    {
        
        helper(root);
        int[] result = new int[map.size()];
        int Max = Integer.MIN_VALUE;
        int count = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();

            if(value > Max)
            {
                Max = value;
                result = new int[map.size()];
                count = 0;
                result[count++] = key;
            }
            else if( value == Max)
            {
                result[count++] = key;
            }
        }
         
        return Arrays.copyOfRange(result, 0, count);
        
    }
}