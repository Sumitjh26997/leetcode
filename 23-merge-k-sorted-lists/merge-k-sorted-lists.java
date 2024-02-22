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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(ListNode list : lists) {
            while(list != null) {
                minHeap.add(list.val);
                list = list.next;
            }
        }

        if(minHeap.isEmpty()) {
            return null;
        }

        ListNode sortedList = new ListNode(minHeap.poll());
        ListNode dummy = sortedList;
        
        while(!minHeap.isEmpty()) {
            ListNode node = new ListNode(minHeap.poll());
            sortedList.next = node;
            sortedList = sortedList.next;
        }
        
        return dummy;
    }
}