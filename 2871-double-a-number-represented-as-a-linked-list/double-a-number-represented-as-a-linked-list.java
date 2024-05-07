/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 long num = 0;

        ListNode traversal = head;
        while(traversal != null) {
            num = (num * 10) + traversal.val;
            traversal = traversal.next;
        }

        System.out.println(num);
        num *= 2;
        String result = String.valueOf(num);

        ListNode newTraversal = new ListNode();
        ListNode res = new ListNode();
        res.next = newTraversal;
        for(int i = 0; i < result.length(); i++) {
            newTraversal.val = Character.getNumericValue(result.charAt(i));
            System.out.println(newTraversal.val);
            if(i != result.length() - 1) {
                newTraversal.next = new ListNode();
                newTraversal = newTraversal.next;
            }
        }

        // while(res != null) {
        //     System.out.println(res.val);
        //     res = res.next;
        // }
        return res.next;
 * }
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