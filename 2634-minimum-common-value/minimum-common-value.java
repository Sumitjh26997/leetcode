class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       HashSet<Integer> common = new HashSet<>();

       for(int num : nums1) {
           common.add(num);
       }

       for(int num : nums2) {
           if(common.contains(num)) {
               return num;
           }
       }

       return - 1;
    }
}