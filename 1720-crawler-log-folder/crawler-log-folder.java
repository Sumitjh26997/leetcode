class Solution {
    public int minOperations(String[] logs) {
        int fromMain = 0;

        for(int i = 0; i < logs.length; i++) {
            String cmd = logs[i];

            if(cmd.equals("./") || (cmd.equals("../") && fromMain == 0)) {
                continue;
            } else if(cmd.equals("../") && fromMain != 0) {
                fromMain--;
            } else {
                fromMain++;
            }
        }

        return fromMain;
    }
}