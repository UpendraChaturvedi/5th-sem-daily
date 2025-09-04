// Last updated: 9/4/2025, 12:02:04 PM
class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int n=t1.length();
        int m=t2.length();
        int dp[][]=new int [n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(t1.charAt(i-1)==t2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
}