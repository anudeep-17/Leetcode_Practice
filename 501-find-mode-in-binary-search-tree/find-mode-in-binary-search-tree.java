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

    public int[] findMode(TreeNode root) 
    {

        if(root == null)
        {
            return null;
        }
        
        if(map.get(root.val) == null)
        {
            map.put(root.val,1);
        }
        else
        {
            map.put(root.val, map.get(root.val) + 1);
        }

        findMode(root.left);
        findMode(root.right);

        List<Integer> result = new ArrayList<>();
        int Max = Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();

            if(value > Max)
            {
                Max = value;
                result.clear();
                result.add(key);
            }
            else if( value == Max)
            {
                result.add(key);
            }
        }
         
        return result.stream().mapToInt(Integer::intValue).toArray();
        
    }
}