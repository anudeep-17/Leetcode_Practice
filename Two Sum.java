class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        HashMap<Integer, Integer> val_compliment = new HashMap<Integer, Integer>();
        for(int i=0; i < nums.length; i++){
            
            if(val_compliment.containsKey(nums[i])){
                sol[0] = i;
                sol[1] = val_compliment.get(nums[i]);
                break;
            }
            else{
            val_compliment.put(target - nums[i], i);
            }
        }
        return sol;

    }
}
