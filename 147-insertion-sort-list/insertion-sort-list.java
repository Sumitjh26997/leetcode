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
    public ListNode insertionSortList(ListNode head) {
       for(ListNode curr = head; curr != null; curr = curr.next) {
           for(ListNode inner = head; inner != curr; inner = inner.next) {
               if(inner.val > curr.val) {
                   int temp = curr.val;
                   curr.val = inner.val;
                   inner.val = temp;    
               }
           }
       }
       return head;
    }
}