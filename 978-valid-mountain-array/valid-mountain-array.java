class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length <= 2){
            return false;
        }
        int i,j;

        for(i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] <= arr[i]) {
                break;
            }
        }

        if(i == arr.length - 1) {
            return false;
        }

        for(j = arr.length - 1; j > 0; j--) {
            if(arr[j-1] <= arr[j]) {
                break;
            }
        }

        if(j == 0) {
            return false;
        }

        return i==j;
    }
}