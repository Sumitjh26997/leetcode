class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = strs[0];

        for(int i = 1; i < strs.length; i++) {
            String comm="";
            for(int j = 0; j < strs[i].length(); j++) {
                if(common.length() == 0) {
                    return "";
                }
                if(!(j >= common.length()) && common.charAt(j) == strs[i].charAt(j)){
                    comm+=common.charAt(j);
                } else {
                    break;
                }
            }
            common = comm;
        }

        return common;
    }
}