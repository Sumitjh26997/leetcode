class Solution {
    public int minOperations(String[] logs) {
        int fromMain = 0;

        for(int i = 0; i < logs.length; i++) {
            String cmd = logs[i];

            if(cmd.equals("./") || (cmd.equals("../") && fromMain == 0)) {
                System.out.println("c1");
                continue;
            } else if(cmd.equals("../") && fromMain != 0) {
                System.out.println("c2");
                fromMain--;
            } else {
                System.out.println("c3");
                fromMain++;
            }

            System.out.println("steps: " + fromMain);
        }

        return fromMain;
    }
}