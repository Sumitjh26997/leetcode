class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> elements = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            elements.put(arr[i], i);
        }

        for(int i = 0; i < arr.length; i++) {
            if(elements.get(arr[i] * 2) != null && elements.get(arr[i] * 2) != i){
                return true;
            }
        }

        return false;
    }
}