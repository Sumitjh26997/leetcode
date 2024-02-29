class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Stack<Integer> trace = new Stack<>();
        trace.push(0);

        while(!trace.isEmpty()) {
            int curr = trace.pop();
            visited[curr] = true;

            List<Integer> keys = rooms.get(curr);

            for(int key : keys) {
                if(!visited[key]) {
                    trace.push(key);
                }
            }
        }


        for(boolean visit : visited) {
            if(!visit){
               return false; 
            }
        }
        return true;
    }
}