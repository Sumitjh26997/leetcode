class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int, int> num_count;
        int num, max=0;
        for(int i=0; i<nums.size(); i++) {
            num_count[nums[i]]++;
        }

        for (auto i : num_count) {
            if(i.second > max) {
                max = i.second;
                num = i.first;
            }     
        }
        
        return num;
    }
};