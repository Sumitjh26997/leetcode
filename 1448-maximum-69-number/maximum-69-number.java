class Solution {
    public int maximum69Number (int num) {
        String number = Integer.toString(num);
        int result = num;

        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == '9') {
                String mod = number.substring(0, i) + '6' + number.substring(i + 1);
                result = (Integer.parseInt(mod) > result) ? Integer.parseInt(mod) : result;
            } else {
                String mod = number.substring(0, i) + '9' + number.substring(i + 1);
                result = (Integer.parseInt(mod) > result) ? Integer.parseInt(mod) : result;
            }
        }

        return result;
    }
}