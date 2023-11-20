class Solution {
    public int[] twoSum(int[] nums, int target) {
      int result[] = new int[2];
      //populate hashMap with with each element as key and index as value
      Map<Integer, Integer> hashMap = new HashMap<>();
      
      for(int i = 0; i< nums.length; i++) {
          hashMap.put(nums[i], i);
      }

      // iterate over each entry in hashMap and check if target - key exists and return searched element's index
      for(int i = 0; i< nums.length; i++) {
          int complement = target - nums[i];
          if(hashMap.containsKey(complement) && i != hashMap.get(complement)) {
            result[0] = i;
            result[1] = hashMap.get(complement);
            break;
          }
      }

      return result;
    }
}