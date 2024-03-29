class Solution {
    public int pivotInteger(int n) {
        if(n == 1) {
            return 1;
        }
        int left = 1, right = n;
        while(left < right) {
            int mid = left + (right - left) / 2;
            int leftSum = (mid*(mid + 1)) / 2;
            int rightSum = (n*(n+1)) / 2 - (mid*(mid - 1)) / 2;

            if(leftSum == rightSum) {
                return mid;
            } else if(leftSum < rightSum) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}