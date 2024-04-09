class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int seconds = 0;
        Queue<int[]> ticketBuyers = new ArrayDeque<>();

        for(int i = 0; i < tickets.length; i++) {
            if(i == k) {
                ticketBuyers.offer(new int[] {tickets[i], 1});
            } else {
                ticketBuyers.offer(new int[] {tickets[i], 0});
            }
        }

        while(true) {
            int[] curr = ticketBuyers.poll();
            curr[0]--;
            seconds++;
            if(curr[0] == 0) {
                if(curr[1] == 1) {
                    break;
                }
            } else {
                ticketBuyers.offer(curr);
            }      
        }

        return seconds;
    }
}