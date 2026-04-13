class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=Integer.MAX_VALUE;
        for(int i=start;i<nums.length;i++){
            if(nums[i]==target){
                ans=i-start;
                break;
              }
        }
        for(int i=start-1;i>=0;i--){
            if(start-i>ans){
                break;
            }
            if(nums[i]==target){
                 ans=Math.min(ans,start-i);
                 break;
            }
        }
          return ans;
        
    }
}