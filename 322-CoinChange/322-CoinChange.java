// Last updated: 9/4/2025, 12:05:40 PM
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int [n+1][amount+1];
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = amount + 1; 
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for(int i=1;i<coins.length+1;i++){
            for(int j=1;j<amount+1;j++){
                if(coins[i-1]<=j){
                    dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
        
            }
        }
        return (dp[n][amount] > amount) ? -1 : dp[n][amount];
    }
}