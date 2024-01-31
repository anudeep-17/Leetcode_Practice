class Solution {
    public int[] prefixsum(int[] n)
    {
        int len = n.length;
        for(int i = 1; i<len; i++)
        {
            n[i] = n[i-1] + n[i];
        }
        return n;
    }

    public int binarysearch(int n[], int target)
    {
        int left= 0; 
        int right = n.length - 1;
        int result = 0;
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
        int[] summed = prefixsum(n);
        int[] returner = new int[queries.length];

        for(int i = 0; i<queries.length; i++)
        {
            returner[i] = binarysearch(summed, queries[i]);
        }
        return returner;

    }
}