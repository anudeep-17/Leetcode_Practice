class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        //optimal solution with o(n) using HashMap
        HashMap <Integer, Integer> Map = new HashMap<Integer, Integer>();

        for(int i = 0; i<nums.length; i++)
        {
            if(Map.containsKey(nums[i]))
            {
                result[0] = Map.get(nums[i]);
                result[1] = i;
                break;
            }

            else
            {
                Map.put(target-nums[i], i);
            }
        }

      /*
      O(n^2) solution.
        for(int i = 0 ; i < nums.length; i++)
        {
            for (int j = i+1; j < nums.length; j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    result[0]=i;
                    result[1] =j;
                    break;
                }
            }
        }
      */
      
        return result;
    }
}
