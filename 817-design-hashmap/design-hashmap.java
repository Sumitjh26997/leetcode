class MyHashMap {
    private int buckets;
    private int set[]; 

    public MyHashMap() {
       this.buckets = 1000001;
        this.set = new int[this.buckets];
        Arrays.fill(this.set, -1);
    }
    
    public void put(int key, int value) {
        this.set[key] = value;
    }
    
    public int get(int key) {
        return this.set[key];
    }
    
    public void remove(int key) {
        this.set[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */