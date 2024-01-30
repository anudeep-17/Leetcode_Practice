import java.util.PriorityQueue;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) 
    {
        int[] returner = new int[k];
        Map<Integer, Integer> rowtosolider = new HashMap<>();
        PriorityQueue<Integer> numberofsoliders = new PriorityQueue<>();
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


        // for(int i = 0; i< k ; i++)
        // {
        //     if(!numberofsoliders.isEmpty())
        //     {
        //         int value  = numberofsoliders.poll();
        //         for (Map.Entry<Integer, Integer> entry : rowtosolider.entrySet()) 
        //         {
        //             if (entry.getValue() == value) 
        //             {
        //                 returner[i] = entry.getKey();
        //                 rowtosolider.remove(entry.getKey());
        //                 break; // Break out of the loop after removing the first occurrence
        //             }
        //         }
        //     }
        // }

        Arrays.sort(scores);
        for( int i = 0; i<k; i++)
        {
            returner[i] = scores[i] % mat.length;
        }

        return returner;
    }
}