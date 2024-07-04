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
    public ListNode mergeNodes(ListNode head) {
        if(head == null) {
            return null;
        }

        int value = 0;

        ListNode dummy = new ListNode();
        ListNode newHead = new ListNode();
        dummy.next = newHead;

        ListNode curr = head.next;
        while(curr != null) {
            if(curr.val != 0) {
                value += curr.val;
            } else {
                newHead.val = value;
                value = 0;
                if(curr.next != null) {
                    newHead.next = new ListNode();
                    newHead = newHead.next;
                } else {
                    newHead.next = null;
                }
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}