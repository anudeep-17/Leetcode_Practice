class Solution {
    public int countrownegatives(int[] arr)
    {
        int count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] < 0)
            {
                count = count+1;
            }
        }
        return count;
    } 

    public int countNegatives(int[][] grid) 
    {
        int countall = 0;
        for(int i = 0; i<grid.length; i++)
        {
            countall += countrownegatives(grid[i]);
        } 
        return countall;
    }
}