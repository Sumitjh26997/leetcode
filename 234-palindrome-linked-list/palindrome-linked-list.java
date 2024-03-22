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
    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();

        while(head != null) {
            values.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = values.size() - 1;
        while(left < right) {
            if(values.get(left) == values.get(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}