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
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
   
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null){
            return head;
        }
     else{
        ListNode temp = head;
        while(temp.next != null){
            int a = temp.val;
            int b = temp.next.val;
            ListNode nextNode = temp.next;
            int g = gcd(a,b);
            ListNode temp1 = new ListNode(g);
             temp.next = temp1;
             temp1.next = nextNode;

            temp = nextNode;
        }
     } 
     return head;       
    }

}