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
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        } else if (head.next == null) {
            System.out.println("current node : " + head.val);
            return head;
        }
        
        ListNode rev = reverseList(head.next);
        
        System.out.println("rev : " + rev.val);
        System.out.println("head : " + head.val);
        head.next.next = head;
        head.next = null;

        return rev;
    }
}