class Solution {
    public List<Integer> targetIndices(int[] nums, int target) 
    {
       int nontargetcount = 0;
       int targetcount = 0;

       for(int i = 0; i<nums.length; i++)
       {
           if(nums[i] == target)
           {
               targetcount++;
           }
           else if (nums[i] < target)
           {
               nontargetcount++;
           }
       }

       List<Integer> returner = new ArrayList<Integer>();
       for(int i = nontargetcount; i<= targetcount+nontargetcount-1; i++)
       {
           returner.add(i);
       }

       return returner;
    }
}