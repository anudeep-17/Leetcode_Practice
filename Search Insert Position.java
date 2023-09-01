# Bruteforce
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
