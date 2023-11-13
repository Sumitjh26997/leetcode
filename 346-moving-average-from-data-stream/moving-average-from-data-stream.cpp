class MovingAverage {

private:
    queue<int> q;
    int capacity, count, sum;
public:
    MovingAverage(int size) {
        this->capacity = size;
        this->count = 0;
        this->sum = 0;
    }
    
    double next(int val) {
        if(this->count == this->capacity) {
            this->sum = this->sum - this->q.front();
            this->q.pop();
            this->count--;
        }

        this->q.push(val);
        this->sum += this->q.back();
        this->count++;
        return (double)this->sum / (double)this->count;;
    }
};

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage* obj = new MovingAverage(size);
 * double param_1 = obj->next(val);
 */