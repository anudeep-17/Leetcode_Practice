# Optimized
class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;
        for (int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                pointer++;
                nums[pointer] = nums[i];
            }
            }

        return pointer+1;
        }
    }

# Unoptimized
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1); // Create a dummy node to simplify handling the head
        dummy.next = head;
        ListNode current = dummy;
        Set<Integer> set = new HashSet<Integer>();

        while (current.next != null) {
            if (set.contains(current.next.val)) {
                current.next = current.next.next;
            } else {
                set.add(current.next.val);
                current = current.next;
            }
        }

        return dummy.next; // Return the modified list starting from the node after the dummy node
    }
}
