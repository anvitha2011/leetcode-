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
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        ListNode curr = head;
        
        while (curr != null) {
            
            // Check if current node starts a duplicate sequence
            if (curr.next != null && curr.val == curr.next.val) {
                
                int duplicateValue = curr.val;
                
                // Skip all nodes having the duplicate value
                while (curr != null && curr.val == duplicateValue) {
                    curr = curr.next;
                }
                
                // Connect prev directly to first non-duplicate node
                prev.next = curr;
                
            } else {
                
                // Current node is unique
                prev = curr;
                curr = curr.next;
            }
        }
        
        return dummy.next;
    }
}