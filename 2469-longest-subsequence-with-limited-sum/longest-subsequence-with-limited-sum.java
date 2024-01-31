class Solution {
    public int binarysearch(int n[], int target)
    {
        int left= 0; 
        int right = n.length - 1;
        while(left<=right)
        {
            int mid = left + (right - left)/2;
            if (n[mid] <= target) 
            {
                left = mid + 1;
            }
            else 
            {
                right = mid - 1;
            }
        }
        return left;
    }

    public int[] answerQueries(int[] n, int[] queries) 
    {
        Arrays.sort(n);
        for(int i = 1; i<n.length; i++)
        {
            n[i] = n[i-1] + n[i];
        }
        int[] returner = new int[queries.length];

        for(int i = 0; i<queries.length; i++)
        {
            returner[i] = binarysearch(n, queries[i]);
        }
        return returner;

    }
}