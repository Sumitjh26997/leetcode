class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count = 0, max = 0;

        for(int i = 0; i < nums.size(); i++){
            if(nums[i] == 1) {
                count++;
            } else if(nums [i] == 0) {
                max = (max < count) ? count : max;
                count = 0;
            }
        }

        return (max < count) ? count : max;;
    }
};