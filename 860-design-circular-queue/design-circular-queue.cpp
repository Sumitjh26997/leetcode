class MyCircularQueue {

private:
    int headIndex;
    int count;
    int capacity;
    int *queue;

public:
    MyCircularQueue(int k) {
        this->queue = new int[k];
        this->capacity = k;
        this->headIndex = 0;
        this->count = 0;
    }
    
    bool enQueue(int value) {
        if(isFull()) {
            return false;
        } else {
            int insert = (this->headIndex + this->count) % this->capacity;
            queue[insert] = value;
            this->count++;
            return true;
        }
    }
    
    bool deQueue() {
        if(isEmpty()) {
            return false;
        }
        this->headIndex = (this->headIndex + 1) % this->capacity;
        this->count--;
        return true;
    }
    
    int Front() {
        if(isEmpty()) {
            return -1;
        } else {
            return queue[this->headIndex];
        }
    }
    
    int Rear() {
        if(isEmpty()) {
            return -1;
        } else {
            int tail = (this->headIndex + this->count - 1) % this->capacity;
            return queue[tail];
        }
    }
    
    bool isEmpty() {
        return (this->count == 0);
    }
    
    bool isFull() {
        return (this->count == this->capacity);
    }
};

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue* obj = new MyCircularQueue(k);
 * bool param_1 = obj->enQueue(value);
 * bool param_2 = obj->deQueue();
 * int param_3 = obj->Front();
 * int param_4 = obj->Rear();
 * bool param_5 = obj->isEmpty();
 * bool param_6 = obj->isFull();
 */