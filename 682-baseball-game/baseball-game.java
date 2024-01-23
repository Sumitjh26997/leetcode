class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();
        int result = 0;

        for(int i = 0; i < operations.length; i++) {
            if(operations[i].equals("C")) {
                scores.pop();
            } else if (operations[i].equals("D")) {
                int temp = scores.peek();
                scores.push(temp*2);
            } else if (operations[i].equals("+")) {
                int num2 = scores.pop();
                int num1 = scores.pop();
                int num3 = num1+num2;
                scores.push(num1);
                scores.push(num2);
                scores.push(num3);
            } else {
                scores.push(Integer.parseInt(operations[i]));
            }
        }

        while(!scores.isEmpty()) {
            result += scores.pop();
        }

        return result;
    }
}