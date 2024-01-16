class RandomizedSet {

    private HashSet<Integer> set;

    public RandomizedSet() {
        this.set = new HashSet<>();
    }
    
    public boolean insert(int val) {
       if(this.set.contains(val))
        return false;

       this.set.add(val);
       return true; 
    }
    
    public boolean remove(int val) {
        if(!this.set.contains(val))
            return false;
        
        this.set.remove(val);
        return true;
    }
    
    public int getRandom() {
        int item = new Random().nextInt(this.set.size()); 
        int i = 0;
        for(int num : this.set)
        {
            if (i == item)
                return num;
            i++;
        }
        return -1;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */