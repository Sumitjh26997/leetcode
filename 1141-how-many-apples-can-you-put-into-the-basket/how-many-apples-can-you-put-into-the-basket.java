class Solution {
    public int maxNumberOfApples(int[] weight) {
        int currentWeight = 0, maxWeight = 5000, maxNumberOfApples = 0;
        Arrays.sort(weight);

        for(int i = 0; i < weight.length; i++) {
            currentWeight += weight[i];

            if(currentWeight > maxWeight) {
                return maxNumberOfApples;
            }

            maxNumberOfApples++;
        }

        return maxNumberOfApples;
    }
}