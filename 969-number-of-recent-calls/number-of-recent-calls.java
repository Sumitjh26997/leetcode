class RecentCounter {
    private Queue<Integer> calls;

    public RecentCounter() {
        this.calls = new LinkedList<>();
    }
    
    public int ping(int t) {
        this.calls.offer(t);
        
        while(!this.calls.isEmpty() && (this.calls.peek()+3000) < t) {
            this.calls.poll();
        }

        return this.calls.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */