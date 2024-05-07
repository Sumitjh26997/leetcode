/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> num = new Stack<>();
        Stack<Integer> res = new Stack<>();

        while(head != null) {
            num.push(head.val);
            head = head.next;
        }

        int carry = 0;
        while(!num.isEmpty()) {
            int digit = num.pop();
            int inter = digit * 2 + carry;
            res.push(inter % 10);
            carry = inter > 9 ? 1 : 0;
        }

        if(carry == 1) {
            res.push(carry);
        }
        
        ListNode newTraversal = new ListNode();
        ListNode result = new ListNode();
        result.next = newTraversal;

        while(!res.isEmpty()) {
            newTraversal.val = res.pop();
            if(res.size() != 0) {
                newTraversal.next = new ListNode();
                newTraversal = newTraversal.next;
            }
        }
        
        return result.next;
    }
}