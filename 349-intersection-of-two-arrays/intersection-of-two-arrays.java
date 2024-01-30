import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean BinarySearch(int[] arr, int num)
    {
        int left = 0;
        int right = arr.length - 1;
        boolean flag = false;

        while(left <= right)
        {
            int mid = left + (right - left)/2;
            
            if(arr[mid] == num)
            {
                flag = true;
                break;
            }
            else if(arr[mid] < num)
            {
               left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return flag;
    }

    public int[] intersection(int[] nums1, int[] nums2) 
    {
        int[] smallarr = null;
        int[] largearr = null;
        
        if(nums1.length <= nums2.length)
        {
            smallarr = nums1;
            largearr = nums2;
             
        }
        else
        {
            smallarr = nums2;
            largearr = nums1;
        }

        Set<Integer> Intersection = new HashSet<>();

        Arrays.sort(largearr);

        for( int i = 0; i < smallarr.length; i++)
        {
             
            if(BinarySearch(largearr, smallarr[i]))
            {
               
                Intersection.add(smallarr[i]);
            }
        }
       return Intersection.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}