class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n];
        // for(int i=0; i<n; i++){
        //     dp[i] = -1;
        // }
        return climb(0, n);
    }
    public int climb(int root, int n){
        if(root >= n){
            if(root == n)return 1;
            else return 0;
        }

        if(dp[root] != 0)return dp[root];
        return dp[root] = climb(root+1, n) + climb(root+2, n);
    }
}