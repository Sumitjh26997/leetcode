class Solution {
public:
    bool isValid(string s) {
        stack<char> expression_parser;
        for(int i=0; i<s.length(); i++) {
            if(s[i] == '(' || s[i] == '[' || s[i] == '{')
                expression_parser.push(s[i]);
            else {
                if(expression_parser.empty() || (s[i] == ')' && expression_parser.top() !='(') || (s[i] == '}' && expression_parser.top() !='{') || (s[i] == ']' && expression_parser.top() !='['))
                    return false;
                else
                    expression_parser.pop();
            }
        }

        if(expression_parser.empty())
            return true;
        else
            return false;
    }
};