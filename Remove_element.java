class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int nonval = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == val)
            {
                continue;
            }
            else
            {
                nums[nonval] = nums[i];
                nonval++;
            }
        }

        return nonval;
    }
}
