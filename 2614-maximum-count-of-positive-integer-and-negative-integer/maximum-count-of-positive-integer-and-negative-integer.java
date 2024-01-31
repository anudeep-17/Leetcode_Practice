class Solution {
    public int maximumCount(int[] nums) 
    {
        int left = 0; 
        int right = nums.length - 1;
        int result = -1;
        int firstpositiveint = -1;
        int lastnegativeint = -1;

        while(left<= right)
        {
            int mid = left + (right - left) / 2;
            
            if(nums[mid] > 0)
            {
                firstpositiveint = mid;
                right = mid-1;
            }
            else if(nums[mid] == 0)
            {
                left = mid+1;
            }
            else
            {
                left = mid+1;
            }
        } 
        
        left = 0; 
        right = nums.length - 1;

        while(left<= right)
        {
            int mid = left + (right - left) / 2;
            
            if(nums[mid] < 0)
            {
                lastnegativeint = mid;
                left = mid+1;
            }
            else if(nums[mid] == 0)
            {
                right = mid - 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        System.out.println("Firstoccurence of positive " +  firstpositiveint + " last negative "+ lastnegativeint + " nof zeros " + (firstpositiveint- lastnegativeint - 1));

        if(firstpositiveint >= 0 && lastnegativeint >= 0)
        {
            // we have both negative and positive
            return Math.max(nums.length - firstpositiveint, lastnegativeint+1);
        }
        else if (firstpositiveint >= 0 && lastnegativeint < 0)
        {
            return nums.length - firstpositiveint;
        }
        else if(firstpositiveint < 0 && lastnegativeint >= 0)
        {
            return lastnegativeint+1;
        }
        else
        {
            return 0;
        }
    }
}