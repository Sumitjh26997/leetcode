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
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode track = head;

        while(track != null) {
            track = track.next;
            length++;
        }

        track = head;
        int counter = length % 2 == 0 ? (length / 2) : length / 2 ;
        
        for(int i = 0; i < counter; i++) {
            track = track.next;
        }

        return track;
    }
}