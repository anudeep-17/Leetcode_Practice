import java.util.PriorityQueue;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) 
    {
        int[] returner = new int[k];
        int[] scores = new int[mat.length];

        for(int i = 0; i<mat.length; i++)
        {
            int left = 0; 
            int right = mat[i].length - 1;
            int lastoccurence = -1;
            while(left <= right)
            {
                int mid = left + (right-left)/2;
                if(mat[i][mid] == 1)
                {
                    lastoccurence = mid;
                    left = mid+1;
                }
                else if (mat[i][mid] < 1)
                {
                    right = mid - 1;
                }
                else
                {
                   left = mid + 1;
                }
            }
        
            scores[i] = (lastoccurence+1) * mat.length + i;
        }
        
        Arrays.sort(scores);
        for( int i = 0; i<k; i++)
        {
            returner[i] = scores[i] % mat.length;
        }

        return returner;
    }
}