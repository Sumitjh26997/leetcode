class MyHashSet {
    private int buckets;
    private boolean set[];

    public MyHashSet() {
        this.buckets = 1000001;
        this.set = new boolean[this.buckets];
        Arrays.fill(this.set, false);
    }
    
    public void add(int key) {
        if ( !contains(key) ) {
            this.set[key] = true;
        } 
    }
    
    public void remove(int key) {
        this.set[key] = false;
    }
    
    public boolean contains(int key) {
       return this.set[key] != false; 
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */