class SparseVector {
    
    private HashMap<Integer, Integer> map;

    SparseVector(int[] nums) {
        map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
                map.put(i, nums[i]);
        }    
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int result = 0;

        for(Map.Entry<Integer, Integer> entry : this.map.entrySet()) {
            if(vec.map.containsKey(entry.getKey())) {
                result += entry.getValue() * vec.map.get(entry.getKey());
            }
        }

        return result;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);