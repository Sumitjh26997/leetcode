class Solution {
    public int addDigits(int num) {
        int result = 0;
        
        while(true) {
            while(num > 0) {
                result += num % 10;
                num /= 10;
            }
            if(result >= 10) {
                num = result;
                result = 0;
            } else {
                break;
            }
        }
        

        return result;
    }
}