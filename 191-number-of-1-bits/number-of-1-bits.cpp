class Solution {
public:
    int hammingWeight(uint32_t n) {
        int result = 0;
        uint32_t multiplier = 1;
        
        for(int i = 0; i < 32; i++ ){
           uint32_t and_res = (n >> i) & multiplier;
           result = (and_res == 1) ? result + 1 : result;
        }
        
        return result;
    }
};