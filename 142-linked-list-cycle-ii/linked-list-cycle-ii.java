/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<>();

        while(head != null) {
            if(nodes.contains(head)) {
                return head;
            } else {
                nodes.add(head);
            }

            head = head.next;
        }

        return null;
    }
}