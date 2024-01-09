class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = -1;
        List<Boolean> candy = new ArrayList<>();

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > maxCandies)
                maxCandies = candies[i];
        }

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= maxCandies)
                candy.add(true);
            else 
                candy.add(false);
        }

        return candy;
    }
}