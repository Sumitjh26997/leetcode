class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> circle = new ArrayDeque<>();

        for(int i = 1; i <= n; i++) {
            circle.add(i);
        }

        while(circle.size() != 1) {
            for(int i = 0; i < k; i++) {
                int rem = circle.poll();
                if(i != k-1) {
                    circle.add(rem);
                }
            }
        }

        return circle.poll();
    }
}