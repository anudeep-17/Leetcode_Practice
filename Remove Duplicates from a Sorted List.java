# Optimized
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = head;

        while(dummy != null && dummy.next != null){
            if(dummy.val == dummy.next.val){
                dummy.next = dummy.next.next;
            } else {
                dummy = dummy.next;
            }
        }

        return head;
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
