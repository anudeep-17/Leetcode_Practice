import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> uniqueSet1 = new HashSet<>();
        Set<Integer> uniqueSet2 = new HashSet<>();
        
        for (int element : nums1) {
            uniqueSet1.add(element);
        }
        for (int element : nums2) {
            uniqueSet2.add(element);
        }

        uniqueSet1.retainAll(uniqueSet2);
        int[] uniqueArray = new int[uniqueSet1.size()];
        int index = 0;
        for (int element : uniqueSet1) {
            uniqueArray[index++] = element;
        }

        return uniqueArray;
    }
}