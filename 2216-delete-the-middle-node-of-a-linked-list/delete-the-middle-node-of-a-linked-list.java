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
    public ListNode deleteMiddle(ListNode head) {
        ListNode track = head;
        int n = 0;

        while(track != null) {
            n++;
            track = track.next;
        }

        if(n == 0 || n == 1) {
            return null;
        }

        track = head;

        for(int i = 0; i < n/2 - 1; i++) {
            track = track.next;
        }

        if(track.next.next == null) {
            track.next = null;
        } else {
            track.next = track.next.next;
        }

        return head;
    }
}