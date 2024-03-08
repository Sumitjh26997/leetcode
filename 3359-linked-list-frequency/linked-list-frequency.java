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
    public ListNode frequenciesOfElements(ListNode head) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        while(head != null) {
            freq.put(head.val, freq.getOrDefault(head.val, 0) + 1);
            head = head.next;
        }

        ListNode freqList = new ListNode();
        ListNode dummy = freqList;

        Iterator<Map.Entry<Integer, Integer>> iterator = freq.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            freqList.val = entry.getValue();
            
            if (iterator.hasNext()) {
               freqList.next = new ListNode();
                freqList = freqList.next;
            }
        }

        return dummy;
    }
}