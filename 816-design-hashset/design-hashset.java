class MyHashSet {
    private int buckets;
    private int set[];

    public MyHashSet() {
        this.buckets = 1000001;
        this.set = new int[this.buckets];
        Arrays.fill(this.set, -1);
    }
    
    public void add(int key) {
        if ( !contains(key) ) {
            this.set[key] = key;
        } 
    }
    
    public void remove(int key) {
        this.set[key] = -1;
    }
    
    public boolean contains(int key) {
       return this.set[key] != -1; 
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */