class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        while(numBottles != 0 && numBottles / numExchange != 0) {
            int exchanged = numBottles / numExchange;
            int empty = numBottles % numExchange;
            result += exchanged;
            numBottles = exchanged + empty; 
        }

        return result;
    }
}