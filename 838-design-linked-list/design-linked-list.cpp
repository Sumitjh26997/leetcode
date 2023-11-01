class MyLinkedList {
    struct SinglyListNode {
        int val;
        SinglyListNode* next;
        SinglyListNode(int x) : val(x), next(NULL){}      
    };
    
    SinglyListNode* head;
public:
    MyLinkedList() {
        head = NULL;
    }
    
    SinglyListNode* getNode(int index) {
        SinglyListNode *cur = head;
        for(int i = 0; i<index && cur; i++){
            cur = cur->next;
        }
        return cur;
    }
    
    int get(int index) {
        if(index < 0)
            return -1;
        
        SinglyListNode* trv = getNode(index);
        int val = trv == NULL ? -1 : trv->val;
        return val;
    }
    
    
    
    void addAtHead(int val) {
        SinglyListNode* cur = new SinglyListNode(val);
        cur->next = head;
        head = cur;
    }
    
    void addAtTail(int val) {
        SinglyListNode* cur = new SinglyListNode(val);
        if(head == NULL) { 
            addAtHead(val);
            return;
        }
        
        SinglyListNode* trv =  head;
        while(trv && trv->next != NULL) {
            trv = trv->next;
        }
        
        trv->next = cur;
    }
    
    void addAtIndex(int index, int val) {
        SinglyListNode* cur = new SinglyListNode(val);
        if(index == 0) {
            addAtHead(val);
            return;
        }
        
        SinglyListNode *prev = getNode(index - 1);
        if (prev == NULL) {
            return;
        }
        
        SinglyListNode *next = prev->next;
        cur->next = next;
        prev->next = cur;
    }
    
    void deleteAtIndex(int index) {
        SinglyListNode* cur = getNode(index);
        if(cur == NULL)
            return;
        
        SinglyListNode* next = cur->next;
        if(index == 0) {
            head = next;
            return;
        }
        
        SinglyListNode* prev = getNode(index - 1);
        prev->next = next;
    }
};

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList* obj = new MyLinkedList();
 * int param_1 = obj->get(index);
 * obj->addAtHead(val);
 * obj->addAtTail(val);
 * obj->addAtIndex(index,val);
 * obj->deleteAtIndex(index);
 */