class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int intersection[];

        for( Integer num1 : nums1 ) {
            s1.add(num1);
        }

        for( Integer num2 : nums2 ) {
            if ( s1.contains(num2) ) {
                s2.add(num2);
            }
        }

        int j = 0;
        intersection = new int[s2.size()];
        for( Integer i : s2 ) {
            intersection[j] = i;
            j++;
        }

        return intersection;
    }
}