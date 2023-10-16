class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> rows[rowIndex + 1];
        rows[0].push_back(1);
        for(int i=1; i<=rowIndex; i++) {
            for(int j=0; j<=i;j++) {
                if(j == 0 || j == i)
                    rows[i].push_back(1);
                else{
                    rows[i].push_back(rows[i-1][j-1] + rows[i-1][j]);
                }
            }
        }

        return rows[rowIndex];
    }
};