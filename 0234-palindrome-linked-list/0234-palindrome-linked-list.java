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
    public boolean isPalindrome(ListNode head) {
        ListNode newh = new ListNode(head.val);
        ListNode temp = head.next;
        ListNode cpy =newh;
        while(temp != null){
            cpy.next = new ListNode(temp.val);
            cpy = cpy.next;
            temp = temp.next;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
           ListNode p1 = newh;
        ListNode p2 = prev;

        while(p1 != null && p2 != null){
            if(p1.val != p2.val){
                return false;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}