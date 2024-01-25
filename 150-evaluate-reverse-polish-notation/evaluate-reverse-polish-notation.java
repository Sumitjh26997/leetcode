class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> result = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+")) {
                int num1 = result.pop();
                int num2 = result.pop();
                result.push(num2 + num1);
            } else if(tokens[i].equals("-")) {
                int num1 = result.pop();
                int num2 = result.pop();
                result.push(num2 - num1);
            } else if(tokens[i].equals("*")) {
                int num1 = result.pop();
                int num2 = result.pop();
                result.push(num2 * num1);
            } else if(tokens[i].equals("/")) {
                int num1 = result.pop();
                int num2 = result.pop();
                result.push(num2 / num1);
            } else {
                result.push(Integer.parseInt(tokens[i]));
            }
        }

        return result.pop();
    }
}