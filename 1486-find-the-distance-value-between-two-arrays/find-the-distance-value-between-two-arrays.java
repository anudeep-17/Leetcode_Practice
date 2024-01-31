class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) 
    {
        /*
            x - y > z is the equation
            where x comes from arr1 
            y comes from arr2 
            and z is d
            everytime i have an x from arr1 and given d i can binary search for y such that i know the first occurence of a smaller number from arr2 by sorting arr2 .
        */

        Arrays.sort(arr2);

        int result = arr1.length;

        for(int i =0; i<arr1.length; i++)
        {
            int target = arr1[i];
            int lowerbound = -(d-arr1[i]);
            int upperbound = d + arr1[i];
            int left = 0;
            int right = arr2.length-1;
            System.out.println(lowerbound+"   " + upperbound);
            
            while(left <= right)
            {
                int mid = left+(right-left) / 2;
                
                if(lowerbound <= arr2[mid] &&  arr2[mid] <= upperbound)
                {
                    result--;
                    break;
                }
                else if(arr2[mid] < lowerbound)
                {
                    left = mid + 1;
                }
                else if( arr2[mid] > upperbound)
                { 
                    right = mid - 1;
                }
            }

        }

        return result;
    }
}