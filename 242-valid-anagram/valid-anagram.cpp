class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length() != t.length())
            return false;

        unordered_map <char, int> s_map;
        unordered_map <char, int> t_map;

        for(int i=0;i<s.length();i++) {
            s_map[s[i]]++;
            t_map[t[i]]++;
        }

        for(auto j: s_map) {
            if(j.second != t_map[j.first])
                return false;
        }

        return true;
    }
};