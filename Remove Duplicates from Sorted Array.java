# Optimized
class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;
        for (int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                pointer++;
                nums[pointer] = nums[i];
            }
            }

        return pointer+1;
        }
    }
