class Solution {
    public int[] findBuildings(int[] heights) {
        Stack<Integer> view = new Stack<>();

        for(int i = 0; i < heights.length - 1; i++) {
            if(heights[i] > heights[i+1]) {
                while(!view.isEmpty() && heights[i] >= heights[view.peek()]) {
                    view.pop();
                }
                view.push(i);
            }
        }

        while(!view.isEmpty() && heights[heights.length - 1] >= heights[view.peek()]) {
            view.pop();
        }
        view.push(heights.length - 1);
        
        int[] result = new int[view.size()];

        for(int i = view.size() - 1; i >= 0; i--) {
            result[i] = view.pop();
        }

        return result;
    }
}