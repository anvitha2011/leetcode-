class Solution {
    public int getDecimalValue(ListNode head) {

        ListNode temp = head;
        String str = "";

        while (temp != null) {
            str = str + temp.val;
            temp = temp.next;
        }

        return Integer.parseInt(str, 2);
    }
}