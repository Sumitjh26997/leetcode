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
    public String gameResult(ListNode head) {
        int odd = 0, even = 0;

        while(head != null) {
            int e = head.val;
            int o = head.next.val;
            if(e > o) {
                even++;
            } else {
                odd++;
            }

            head = head.next.next;
        }

        return odd == even ? "Tie" : odd > even ? "Odd" : "Even";
    }
}