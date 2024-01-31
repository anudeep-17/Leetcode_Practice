class Solution {
    public int specialArray(int[] nums) 
    {
        Arrays.sort(nums);
        int special = -1;

        for(int i = 1; i <= nums.length; i++)
        {
            int left = 0; 
            int right = nums.length -1;
            int firstoccurence = -1;

            while(left<=right)
            {
                int mid = left + (right - left)/2;
                if(nums[mid] >= i)
                {
                    firstoccurence = mid;
                    right = mid - 1;
                }
                else 
                {
                    left = mid + 1;
                }
            }

            if(nums.length - firstoccurence == i)
            {
               special = i;
               break;
            }
            else
            {
                continue;
            }
        }

        return special;
        
    }
}