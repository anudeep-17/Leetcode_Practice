# Optimized
class Solution {
    public int removeElement(int[] nums, int val) {
        int uniqueArrLength = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] != val){
                nums[uniqueArrLength] = nums[i];
                uniqueArrLength++;
            }
        }

        return uniqueArrLength;
    }
}
