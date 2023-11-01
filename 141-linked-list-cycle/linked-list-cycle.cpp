/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        ListNode* sptr = head;
        ListNode* fptr = head;
        
        while(fptr && fptr->next != NULL) {
            sptr = sptr->next;
            fptr = fptr->next->next;
                    
            if(fptr == sptr)
                return true;
        }
        return false;
    }
};