class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n == 1) {
            return true;
        }
        HashMap<Integer, List<Integer>> adjacencyList = new HashMap<>();
        Stack<Integer> trace = new Stack<>();
        int[] visited = new int[n];

        for(int i = 0; i < edges.length; i++) {
            List<Integer> l1 = adjacencyList.getOrDefault(edges[i][0], new ArrayList<>());
            List<Integer> l2 = adjacencyList.getOrDefault(edges[i][1], new ArrayList<>());

            l1.add(edges[i][1]);
            l2.add(edges[i][0]);

            adjacencyList.put(edges[i][0], l1);
            adjacencyList.put(edges[i][1], l2);
        }

        trace.push(source);

        while(!trace.isEmpty()) {
            int current = trace.pop();
            visited[current] = 1;

            List<Integer> adjList = adjacencyList.get(current);

            for(int vertex : adjList) {
                if(visited[vertex] != 1) {
                    trace.push(vertex);
                }
            }
        }


        return visited[destination] == 1;
    }
}