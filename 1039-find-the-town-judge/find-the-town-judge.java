class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1 || n == 0) {
            return 1;
        }

        HashMap<Integer, Integer> trusted = new HashMap<>();
        HashMap<Integer, Integer> trustee = new HashMap<>();

        for(int i = 0; i < trust.length; i++) {
            trustee.put(trust[i][0], trustee.getOrDefault(trust[i][0], 0) + 1);
            trusted.put(trust[i][1], trusted.getOrDefault(trust[i][1], 0) + 1);   
        }

        for(Map.Entry<Integer, Integer> entry : trusted.entrySet()) {
            if(entry.getValue() == n-1) {
                if(trustee.getOrDefault(entry.getKey(), 0) == 0)
                    return entry.getKey();
            }
        }

        return -1;
    }
}