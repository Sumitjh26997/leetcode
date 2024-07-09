class Solution {
    public double averageWaitingTime(int[][] customers) {
        double currTime = 0.0;
        double waitTime = 0.0;

        for(int i = 0; i < customers.length; i++) {
            currTime = Math.max(customers[i][0], currTime) + customers[i][1];
            waitTime += currTime - customers[i][0];
        }

        return waitTime / (double) customers.length;
    }
}