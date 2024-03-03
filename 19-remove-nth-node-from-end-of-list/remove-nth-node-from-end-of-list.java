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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode l = head;
        ListNode result = head;

        while(l != null) {
            length++;
            l = l.next;
        }

        if(length == 0 || (length == 1 && n == 1)) {
            return null;
        }

        if(length == n) {
            result = head.next;
            return result;
        }

        for(int i = 1; i <= length - n - 1; i++) {
            head = head.next;
        }

        System.out.println(head.val);
        head.next = head.next.next == null ? null : head.next.next;
        return result;
    }
}