class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] result = new int[m+n];

        while(i < m+n) {
            if(j >= m) {
                result[i] = nums2[k];
                i++;
                k++;
            } else if(k >= n) {
                result[i] = nums1[j];
                i++;
                j++;
            } else {
                if(nums1[j] <= nums2[k]) {
                    result[i] = nums1[j];
                    i++;
                    j++;
                } else {
                    result[i] = nums2[k];
                    i++;
                    k++;  
                }
            }
        }

        for(int l = 0; l < result.length; l++) {
            System.out.println("index : " + l + " element : " + result[l]);
        }

        if((m+n) % 2 != 0) {
            System.out.println("median element : " + result[(result.length)/2]);
            return (double) result[(result.length)/2];
        } else {
            System.out.println("median element1 : " + result[(result.length)/2]);
            System.out.println("median element2 : " + result[(result.length)/2 - 1]);
            return ((double) (result[(result.length)/2 - 1] + (double) result[(result.length)/2]) / (double) 2);
        }
    }
}