# Optimized - O(log n)
class Solution {
    public int searchInsert(int[] nums, int target) {
       int start = 0;
       int end = nums.length - 1;

       while( start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid - 1;
            else if(nums[mid] < target)
                start = mid + 1;
       }

       return start;
    }
}


# Bruteforce - O(n)
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target)
                return i;
           else if(i == 0 && nums[i] > target)
                return 0;
            else if(i + 1 < nums.length && nums[i] < target && nums[i+1] > target)
                return i+1;
            else if( i == nums.length - 1){
                return nums.length;
            }
        }
        return 0;
    }
}
