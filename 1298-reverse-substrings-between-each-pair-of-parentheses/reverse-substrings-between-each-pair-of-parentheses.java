class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')') {
                StringBuilder subString = new StringBuilder();
                while(stack.peek() != '(') {
                    subString.append(stack.pop());
                }
                stack.pop();
                int j = 0;
                while(j < subString.length()) {
                    stack.push(subString.charAt(j++));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        return result.reverse().toString();    
    }
}