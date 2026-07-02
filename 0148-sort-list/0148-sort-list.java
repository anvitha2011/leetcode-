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
    public ListNode sortList(ListNode head) {
        int count=0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int ar[] = new int[count];
        int i=0;
        temp = head;
        while(temp != null){
            ar[i] = temp.val;
            i++;
            temp = temp.next;
        }
        Arrays.sort(ar);
        temp = head;
        for(int j=0;j<count;j++){
            temp.val = ar[j];
            temp = temp.next;
        }
       return head; 
    }
}