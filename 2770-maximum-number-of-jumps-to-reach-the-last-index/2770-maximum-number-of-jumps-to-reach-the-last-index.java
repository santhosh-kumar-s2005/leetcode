class Solution {
    public int maximumJumps(int[] nums, int target) {
    int n=nums.length;
    int dp[]=new int[n];
    for(int i=1;i<n;i++){
        int maxjump=-1;
        for(int j=i-1;j>=0;j--){
            if(nums[j]-nums[i]>=-target && nums[j]-nums[i]<=target ){
              //  maxjump=Math.max(maxjump,dp[j]);
              maxjump=dp[j];
              break;
            }
        }
        dp[i]=(maxjump==-1)?-1:maxjump+1;
    }
    return dp[n-1];
        
    }
}