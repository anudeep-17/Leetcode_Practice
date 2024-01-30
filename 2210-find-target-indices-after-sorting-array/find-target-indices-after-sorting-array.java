class Solution {
    public List<Integer> targetIndices(int[] nums, int target) 
    {
        Arrays.sort(nums);
        List<Integer> returner  = new ArrayList<Integer>();

        int left = 0;
        int right = nums.length - 1;
        int lastoccurence = -1;
        int firstoccurence = -1;
        
        while(left <= right)
        {
            // last occurence of target
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
            {
                lastoccurence = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid -1;
            }
        }
        
        left = 0;
        right = nums.length - 1;
        while(left <= right)
        {
            // First occurence of target
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
            {
                firstoccurence = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid -1;
            }
        }

        for(int i = firstoccurence; i<= lastoccurence; i++)
        {
            if( i == -1)
            {
                break;
            }
            returner.add(i);
        }
        return returner;
    }
}