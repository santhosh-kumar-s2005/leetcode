class Solution {
    public int integerBreak(int n) {
        int dp[]=new int[n+1];
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            for(int j=i-1;j>=(i/2);j--){
                int val=(j>dp[j])?j:dp[j];
                val*=i-j>dp[i-j]?i-j:dp[i-j];
                dp[i]=Math.max(dp[i],val);
            }
        }
        return dp[n];
        
    }
}