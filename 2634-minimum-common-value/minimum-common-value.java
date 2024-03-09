class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       HashSet<Integer> n1 = new HashSet<>();
       HashSet<Integer> common = new HashSet<>();

       for(int num : nums1) {
           n1.add(num);
       }

       for(int num : nums2) {
           if(n1.contains(num)) {
               common.add(num);
           }
       }

        if(common.size() == 0) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        for(int num : common) {
            if(min > num) 
                min = num;
        }

        return min;
    }
}