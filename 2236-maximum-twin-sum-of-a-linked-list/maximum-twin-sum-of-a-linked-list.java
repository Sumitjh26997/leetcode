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
    public int pairSum(ListNode head) {
        int max = 0;
        List<Integer> values = new ArrayList<>();

        while(head != null) {
            values.add(head.val);
            head = head.next;
        }

        int i = 0, j = values.size() - 1;

        while(i < j) {
            max = (values.get(i) + values.get(j)) > max ? values.get(i) + values.get(j) : max;
            i++;
            j--;
        }

        return max;
    }
}